package com.xywei.springsecurity;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.alibaba.fastjson.JSON;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		Map<String, String> map = new HashMap<>();
		map.put("login", "success");
		String reps = JSON.toJSONString(map);
		System.err.println(reps);
		response.setContentType("text/json;charset=UTF-8");
		response.getWriter().write(reps);
	}

}
