package com.example.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.*;

@Service
public class TokenService {

    @Value("${token.header}")
    private String header;

    @Value("${token.secret}")
    private String secret;

    @Autowired
    public RedisTemplate redisTemplate;

    public Boolean filter(HttpServletRequest request){
        String token = getToken(request);
        return verify(token);
    }

    /**
     * 验证token
     */
    public Boolean verify(String token) {
        Object user = getObject(token);
        if (user == "") return false;
        return true;
    }

    public Object getObject(String token) {
        Claims claims = parseToken(token);
        String uuid = (String) claims.get("token_key");
        String userKey = "login_tokens:" + uuid;
        Object user = redisTemplate.opsForValue().get(userKey);
        if (user == null) return "";
        return user;
    }

    public String getUserName(String token) {
        Object user = getObject(token);
        if (user == "") return "";
        Map map = (Map) getValueByKey(user,"map");
        String username = (String) map.get("username");
        return username;
    }

    /**
     * 获取TOKEN
     */
    public String getToken(HttpServletRequest request) {
        String token1 = request.getHeader(header);
        String token2 = null;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("Admin-Token")) token2 = cookie.getValue();
        }
        return token2 != null ? token2:token1;
    }

    /**
     * 获取数据声明
     */
    private Claims parseToken(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }

    /**
     * 单个对象的某个键的值
     * @param obj 对象
     * @param key 键
     * @return Object 键在对象中所对应得值 没有查到时返回空字符串
     */
    private Object getValueByKey(Object obj, String key) {
        // 得到类对象
        Class userCla = (Class) obj.getClass();
        /* 得到类中的所有属性集合 */
        Field[] fs = userCla.getDeclaredFields();
        for (int i = 0; i < fs.length; i++) {
            Field f = fs[i];
            f.setAccessible(true); // 设置些属性是可以访问的
            try {
                if (f.getName().endsWith(key)) {
                    System.out.println("单个对象的某个键的值==反射==" + f.get(obj));
                    return f.get(obj);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        // 没有查到时返回空字符串
        return "";
    }
}
