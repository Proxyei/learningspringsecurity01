package com.xywei.springsecurity;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.alibaba.fastjson.JSON;

public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {

		Map<String, String> map = new HashMap<>();
		map.put("login", "failure");
		String reps = JSON.toJSONString(map);
		System.err.println(reps);
		response.setContentType("text/json;charset=UTF-8");
		response.getWriter().write(reps);

	}

}
