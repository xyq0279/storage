package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.UserService;

@Controller
public class UserServlet {
	
	@Autowired
	private UserService target;
	
	public void addUser(){
		target.addUser();
	}
}