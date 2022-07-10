//package com.example.config;
//
//import org.jeecg.modules.jmreport.api.JmReportTokenServiceI;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.stereotype.Component;
//import com.example.service.TokenService;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * 自定义积木报表鉴权(如果不进行自定义，则所有请求不做权限控制)
// * 1.自定义获取登录token
// * 2.自定义获取登录用户
// */
//@Component
//public class JimuReportTokenService implements JmReportTokenServiceI {
//
//    @Autowired
//    private TokenService tokenService;
//
//    /**
//     * 通过请求获取Token
//     * @param request
//     * @return
//     */
//    @Override
//    public String getToken(HttpServletRequest request) {
//        //return TokenUtils.getTokenByRequest(request);
//        String token = tokenService.getToken(request);
//        return token;
//    }
//
//    /**
//     * 通过Token获取登录人用户名
//     * @param token
//     * @return
//     */
//    @Override
//    public String getUsername(String token) {
//        String username = tokenService.getUserName(token);
//        return username;
//    }
//
//    /**
//     * Token校验
//     * @param token
//     * @return
//     */
//    @Override
//    public Boolean verifyToken(String token) {
//        //return TokenUtils.verifyToken(token, sysBaseAPI, redisUtil);
//        Boolean flag = tokenService.verify(token);
//        return flag;
//    }
//
//    /**
//     *  自定义请求头
//     * @return
//     */
//    @Override
//    public HttpHeaders customApiHeader() {
//        HttpHeaders header = new HttpHeaders();
//        header.add("Authorization", "Authorization value 1");
//        header.add("token", "token value 2");
//        return header;
//    }
//}