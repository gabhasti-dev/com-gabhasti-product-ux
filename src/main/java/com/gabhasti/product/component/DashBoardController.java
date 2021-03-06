package com.gabhasti.product.component;

import java.security.Principal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DashBoardController {

	private static final Logger log = LogManager.getLogger(DashBoardController.class.getName());
	
	
	@GetMapping("/dashboard")
	public ModelAndView  getDashboard(Principal principal) {
		
		log.debug("Inside Dashboard");
		ModelAndView model = new ModelAndView();
		model.setViewName("dashboard");
		model.addObject(principal);
		
		log.debug("Exiting Dashboard"+principal);
		return model;
	}

	
	
	
}
