package com.utry.ut.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.utry.ut.pojo.TestUser;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 获取请求的URL

		String url = request.getRequestURI();
		System.out.println("url=" + url);
		// URL:除了登录请求外，其他的URL都进行拦截控制
		if (url.indexOf("Login") >= 0) {
			return true;
		}
		// 获取 Session currentUser
		HttpSession session = request.getSession();
		TestUser user = (TestUser) session.getAttribute("currentUser");
		// 判断Session中是否有用户数据，如果有，则返回true，继续想下执行
		if (user != null) {
			return true;
		}
		// 不符合条件的给出提示信息，并转发到登录页面 user/LoginUI
		request.getRequestDispatcher("/WEB-INF/jsp/main/login.jsp").forward(request, response);
		return false;
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

}