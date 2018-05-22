package com.ak.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/home",method=RequestMethod.GET)
public class HomeController {
	
	@RequestMapping(value="/")
	public String getList(@RequestHeader("token") String token, HttpServletRequest req,HttpServletResponse res) {
		return token;		
	}
}
