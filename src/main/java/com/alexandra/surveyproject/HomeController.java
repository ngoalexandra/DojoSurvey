package com.alexandra.surveyproject;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@PostMapping("/submit")
	public String submitInfo(HttpSession session, @RequestParam(value="name") String yourName, @RequestParam(value="comment") String Comment, @RequestParam(value="location") String yourLocation, @RequestParam(value="language") String yourLang, RedirectAttributes redirectAttributes) {
		session.setAttribute("name", yourName);
		session.setAttribute("location", yourLocation);
		session.setAttribute("language", yourLang);
		session.setAttribute("comment", Comment);
		System.out.print("name");
		System.out.print("IM HERE");
		return "redirect:/result";
	}
	@RequestMapping("/result") 
	public String result() {
//		String name = (String) session.getAttribute("name");
		
		return "result.jsp";
	}
	

}
