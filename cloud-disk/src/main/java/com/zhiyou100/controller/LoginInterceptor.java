package com.zhiyou100.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// 进行登录验证，没有登录跳到登录界面
		HttpSession session = request.getSession();
		
		if (session.getAttribute("accountId") == null) {
			
			response.sendRedirect(request.getContextPath() + "/index.html");
			
			return false;
		}
		
		return super.preHandle(request, response, handler);
	}
}
