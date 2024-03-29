/**
 * 
 */
package me.krishnamurti.springpetclininc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import me.krishnamurti.springpetclininc.services.VetService;

/**
 * @author krishna
 *
 */
@Controller
public class VetController {
	
	private final VetService vetService;
	
	/**
	 * @param vetService
	 */
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}
	
	
	@RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
	
}
