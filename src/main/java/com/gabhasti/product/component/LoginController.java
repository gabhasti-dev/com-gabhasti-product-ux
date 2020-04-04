package com.gabhasti.product.component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

	
	
	@GetMapping("/login")
	public ModelAndView  getlogin() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		//model.addObject(principal);
		
	//	log.debug("Exiting Dashboard"+principal);
		return model;
	}
	@GetMapping("/")  
    public String index() {  
        return "index";  
    }  

}
