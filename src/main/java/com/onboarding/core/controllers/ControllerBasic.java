package com.onboarding.core.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.onboarding.core.beans.PostComponent;
import com.onboarding.core.configurations.Pages;
import com.onboarding.models.Post;

@Controller
@RequestMapping("/home")
public class ControllerBasic {
	@Autowired
	private PostComponent _postComponent;
	
	
	@GetMapping(path = {"/posts","/"})
	public String saludar(Model model) {
		model.addAttribute("posts",this._postComponent.getPosts());
		return "index";
	}
	@GetMapping(path= {"/public"})
	public ModelAndView post() {
		ModelAndView modelAndview= new ModelAndView(Pages.HOME); //colocamos la vista;
		modelAndview.addObject("posts",this._postComponent.getPosts());
		return modelAndview;
	}
	@GetMapping (path= {"/post"})
	public  ModelAndView getPostIndividual(@RequestParam(defaultValue = "1", name="id",required=false)int id) {
		ModelAndView modelAndview = new ModelAndView(Pages.POST);
		List<Post> postFiltrado = this._postComponent.getPosts().stream().filter((p)-> {return p.getId() == id;}).collect(Collectors.toList());
		modelAndview.addObject("post",postFiltrado.get(0));
		return modelAndview;
	}
	@GetMapping (path= {"/NewPost"})
	public ModelAndView getForm() {
		return new ModelAndView("form").addObject("post",new Post());
	}
	@PostMapping (path= {"/addNewPost"})
	public String addNewPost(Post post , Model model) {
		List<Post> posts = this._postComponent.getPosts();
		posts.add(post);
		model.addAttribute("posts", posts);
		return "index";
		
	}
	
}
