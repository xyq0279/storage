package test;

//import java.util.Calendar;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import pojo.Hello;
//import pojo.User;
//import pojo.User2;
import pojo.User3;


public class TestSpring {
	
	
	@Test
	public void test13(){
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		User3 user = (User3) context.getBean("user3");
		System.out.println(user);
	}
	
	
	
	/*//set注入测试
	@Test
	public void test10(){
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User2 user = (User2) context.getBean("user");
		user.getCat().habby();
		user.getDog().habby();
		System.out.println(user);
	}
	*/
	/*//测试初始化操作
	@Test
	public void test09(){
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User2 user = (User2) context.getBean("user");
		user.say();
		context.close();
	}*/
	
	//懒加载
/*	@Test
	public void test08(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
	}*/
	/*//测试对象是否单例或多例
	@Test
	public void test07(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
		User user1 = (User) context.getBean("user");
		System.out.println(user1);
		user.say();
	}*/
	
	
	/*//静态工厂
	@Test
	public void test04(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calendar calendar = (Calendar) context.getBean("CalendarA");
		System.out.println(calendar.getTime());
	}
	//实例工厂
	@Test
	public void test05(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calendar calendar = (Calendar) context.getBean("CalendarB");
		System.out.println(calendar.getTime());
	}
	//Spring工厂
		@Test
		public void test06(){
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Calendar calendar = (Calendar) context.getBean("CalendarC");
			System.out.println(calendar.getTime());
		}*/
	/*@Test
	public void test01(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) context.getBean("hello");
		hello.Hello();
	}
	
	@Test
	public void test02(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = context.getBean(Hello.class);
		hello.Hello();
	}
	@Test
	public void test03(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) context.getBean("hahaha");
		hello.Hello();
	}
	*/
}
