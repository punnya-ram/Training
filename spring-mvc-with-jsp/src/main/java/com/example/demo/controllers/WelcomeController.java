package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@RequestMapping("/mvc")
@Controller
public class WelcomeController {
	private ModelAndView mdlView;
	private ProductRepository repo;
	
	@Autowired
	public WelcomeController(ModelAndView mdlView,ProductRepository repo) {
		super();
		this.mdlView = mdlView;
		this.repo=repo;
	}
	@RequestMapping(value="/first",method=RequestMethod.GET)
	public String getFirstPage() {
		return "welcome";
	}
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView getHomePage() {
		  List<Product> prdList=repo.findAll();
		  Optional<Product>view=repo.findById(1);
		  mdlView.addObject("list",prdList);
		  mdlView.addObject("show",view);

		  mdlView.setViewName("home");
		  return mdlView;
	}


}
