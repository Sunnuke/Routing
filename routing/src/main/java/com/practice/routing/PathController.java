package com.practice.routing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
	
	@RequestMapping("/dojo")
	public String path1() {
		return "Oh yeah! I do want to learn Kung Fu!";
	}
	@RequestMapping("/{test1}-{test2}")
	public String path2(@PathVariable("test1") String test1, @PathVariable("test2") String test2) {
		return "Lol the URL says; " + test1 + " " + test2;
	}
	@RequestMapping("/{test3}/{test4}")
	public String path3(@PathVariable("test1") String test1, @PathVariable("test2") String test2) {
		return "Oh Hey! Look at this; " + Character.toUpperCase(test1.charAt(0)) + Character.toUpperCase(test2.charAt(0)) + " Lol I abbreviated the input!";
	}
}
