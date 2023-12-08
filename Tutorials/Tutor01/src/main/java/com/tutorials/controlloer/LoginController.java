package com.tutorials.controlloer;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login.do")
	public String login(Model model, HttpServletRequest request) throws Exception{
		System.out.println("[LoginController] doGet()");
		request.setCharacterEncoding("UTF-8");
		String uid=request.getParameter("uid");
		String pwd=request.getParameter("pwd");
		
		model.addAttribute("uid", uid);
		model.addAttribute("pwd", pwd);
		return "login";
		
	
		
	}
	@RequestMapping("/login.do")
	public String login2(Model model, HttpServletRequest request) throws UnsupportedEncodingException  {
		System.out.println("[LoginController] /login.do");
			
		request.setCharacterEncoding("UTF-8");
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
			
		model.addAttribute("uid", uid);
		model.addAttribute("pwd", pwd);
		return "login";
		}
}
	
