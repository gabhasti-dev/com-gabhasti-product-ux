package com.gabhasti.product.component;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DashBoardController {

	
	@GetMapping("/dashboard")
	public ModelAndView  getDashboard(Principal principal) {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("dashboard");
		model.addObject(principal);
		//return "dashboard";
		return model;
	}
	
	
	
	
}
