package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Controller
public class PriductController {
	@Autowired
	private Product entity;
	@Autowired
	private ProductRepository repo;
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String initForm(Model model) {
		model.addAttribute("title","Add Products");
		model.addAttribute("command",entity);
		return "addProduct";
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command")Product entity) {
		int rowAdded;
		try {
		rowAdded = this.repo.add(entity);
			return "success";
		} catch (Exception e) {
		
			e.printStackTrace();
			return "failure";
		}	
	}
	@RequestMapping(value="/product/search",method=RequestMethod.GET)
	public String initSearch (Model model) {
		model.addAttribute("search","searchbyid");
		return "searchbyid";
		
	}

	@RequestMapping(value="/product/search",method=RequestMethod.POST)
	public String searchProduct(@RequestParam("id")int id,Model model) {
		Optional<Product> entity=repo.findById(id);
		model.addAttribute("found",entity);
		return "showproduct";
		
	}
	@RequestMapping(value="/product/delete",method=RequestMethod.GET)
	public String initdelete (Model model) {
		model.addAttribute("delete","deletebyid");
		return "deletebyid";
		
	}

	@RequestMapping(value="/product/delete",method=RequestMethod.POST)
	public String deleteProduct(@RequestParam("id") int id,Model model) {
		int entity=repo.remove(id);
		model.addAttribute("deletedee",entity);
		return "deleted";
		
	}
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("index","indexpg");
		return "indexpg";
	}
	@RequestMapping(value="/product/update",method=RequestMethod.GET)
	public String initUpdate (Model model) {
		model.addAttribute("update","update");
		return "update";
		
	}
	//@RequestMapping(value="/product/update",method=RequestMethod.POST)
	//public String updateProduct(@RequestParam("id") int id,Model model) {
	//	int entity=repo.update(entity);
		//model.addAttribute("updated",entity);
		//return "updated";
		


}
