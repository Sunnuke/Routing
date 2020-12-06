package com.practice.routing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("coding")
public class CodingController {
	
	@RequestMapping("")
	public String code1() {
		return "Hello Coding World!!!";
	}
	@RequestMapping("/python")
	public String code2() {
		return "LOL Python and Django are awesome!";
	}
	@RequestMapping("/java")
	public String code3() {
		return "Lmao! but Java and Spring are pretty cool too!";
	}
}
