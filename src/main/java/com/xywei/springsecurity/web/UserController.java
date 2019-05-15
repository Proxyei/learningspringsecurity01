package com.xywei.springsecurity.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/add")
	public String userAdd() {

		return "user/useradd";
	}

	@RequestMapping("/delete")
	public String userDelete() {

		return "user/userdelete";
	}

	@RequestMapping("/list")
	public String userList() {

		return "user/userlist";
	}

	@RequestMapping("/update")
	public String userupDate() {

		return "user/userupdate";
	}

}
