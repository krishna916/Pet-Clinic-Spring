/**
 * 
 */
package me.krishnamurti.springpetclininc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import me.krishnamurti.springpetclininc.services.OwnerService;

/**
 * @author krishna
 *
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	private final OwnerService ownerService;
	
	/**
	 * @param ownerService
	 */
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}



	
	@RequestMapping({ "","/", "/index", "/index.html"})
	public String listOfOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
	
	@RequestMapping({"/find"})
	public String findOwners() {
		return "not-implemented";
	}
}
