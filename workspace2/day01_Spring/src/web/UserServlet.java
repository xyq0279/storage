package web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pojo.User;
import service.UserService;

@Controller
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/applicationContext2.xml")
public class UserServlet {
	@Autowired
	private UserService userService;
	@Test
	public void userAdd(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		User user = (User) context.getBean("user");
		userService.userAdd(user);
		System.out.println(user);
	}
}
