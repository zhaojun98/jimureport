package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;
import com.example.service.TokenService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TOKEN过滤器
 */
@Component
public class JwtAuthTokenFilter extends OncePerRequestFilter {

	private static final PathMatcher pathMatcher = new AntPathMatcher();
	@Autowired
	private TokenService tokenService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
//		if (isProtectedUrl(request)){
//			String msg = "没有访问权限";
//			try {
//				boolean flag = tokenService.filter(request);
//				if(!flag){
//					msg = "token已经过期, 请重新登录";
//					throw new RuntimeException(msg);
//				};
//			}catch (Exception e){
//				throw new RuntimeException(msg);
//			}
//		}
		chain.doFilter(request, response);
	}

	private boolean isProtectedUrl(HttpServletRequest request){
		return pathMatcher.match("/**", request.getServletPath());
	}
}
