package com.ty.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	@GetMapping("/hi")
	public String sayHi()
	{
		return "student.jsp";
	}
	
	@GetMapping("/res")
	public String register()
	{
		return "register.jsp";
	}

}
