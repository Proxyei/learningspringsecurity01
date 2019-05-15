package com.xywei.springsecurity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPage {

	@RequestMapping(value = { "/" })
	public String toIndex(Model model) {
		model.addAttribute("username", "wei");
		return "index";
	}

	@RequestMapping(value = { "/error/denied" })
	public String deniedPage() {
		return "error/403";
	}
}
