/**
 * 
 */
package me.krishnamurti.springpetclininc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author krishna
 *
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	@RequestMapping({ "","/", "/index", "/index.html"})
	public String listOfOwners() {
		return "owners/index";
	}
	
}
