package com.chen.controller;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chen.webservice.HelloWorld;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource(name="helloWorld")
	private HelloWorld helloWorld;
	
	@RequestMapping("/gethello")
	@ResponseBody
	public String getWS()
	{
		return helloWorld.helloWorld("bugai");
	}

}
