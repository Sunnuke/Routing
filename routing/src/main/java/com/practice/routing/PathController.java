package com.practice.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PathController {
	
	@RequestMapping("/dojo")
	public String path1() {
		return "Oh yeah! I do want to learn Kung Fu!";
	}
	@RequestMapping("/{test1}-{test2}/")
	public String path2(@PathVariable("test1") String test1, @PathVariable("test2") String test2) {
		return "Lol the URL says; " + test1 + " " + test2;
	}
	@RequestMapping("/a/{test3}-{test4}/")
	public String path3(@PathVariable("test3") String test1, @PathVariable("test4") String test2) {
		String a = String.valueOf(Character.toUpperCase(test1.charAt(0)));
		String b = String.valueOf(Character.toUpperCase(test2.charAt(0)));
		String say = "Oh Hey! Look at this; " + a + b + " Lol I abbreviated the input!";
		return say;
	}
}