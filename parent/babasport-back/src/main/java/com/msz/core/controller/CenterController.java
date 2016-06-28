package com.msz.core.controller;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * backend center
 * @author shizhema
 *
 */
@Controller
@RequestMapping(value="/control")
public class CenterController {
	
	@RequestMapping(value="/index.do")
	public String index(){
		return "index";
	}
	@RequestMapping(value="/top.do")
	public String top(){
		return "top";
	}
	@RequestMapping(value="/main.do")
	public String main(){
		return "main";
	}
	@RequestMapping(value="/left.do")
	public String left(){
		return "left";
	}
	@RequestMapping(value="/right.do")
	public String right(){
		return "right";
	}
}
