package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controllers only purpose should be to server up our SPA
 * 
 * @author Blake
 *
 */
@Controller
@RequestMapping("page")
public class SPAController {
	
	/**
	 * This is the only method that should be used to serve up our SPA
	 * 
	 * @return String holding the location of the page to be forwarded
	 */
	@GetMapping
	public String getSPA() {
		return "forward:/static/index.html";
	}
	
}
