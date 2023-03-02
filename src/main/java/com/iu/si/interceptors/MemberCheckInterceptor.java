package com.iu.si.interceptors;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
@Component
public class MemberCheckInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// Controller 진입전
		// return이 true라면 다음 Controller로 진행
		// return이 false라면 다음 Controller로 진행 x
		System.out.println("Member Chect Interceptor");
		Object obj = request.getSession().getAttribute("member");

		if(obj != null) {
			return true;
		}
		System.out.println("로그인 안한 경우");
		//1. Foward Jsp
//		request.setAttribute("result","권한이 없습니다");
//		request.setAttribute("url","../member/memberLogin");
//		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/common/result.jsp");
//		view.forward(request, response);
//		return false;
//		
		//2.Redirect
		response.sendRedirect("../../../../../member/memberLogin");
		return false;
		
	}
	
	

}
