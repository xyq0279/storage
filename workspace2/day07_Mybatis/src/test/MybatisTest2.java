package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import mapper.UserMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import pojo.Teacher;
import pojo.User;
import pojo.Dept;

public class MybatisTest2 {
	private SqlSessionFactory factory;

	@Before
	public void init() throws IOException{
		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
		factory= new SqlSessionFactoryBuilder().build(inputStream);
	}
	//查询用户
	@Test
	public void test01(){
		SqlSession session = factory.openSession();
		//获得代理对象
		UserMapper mapper = session.getMapper(UserMapper.class);
		//调用方法
		List<User> userList = mapper.findAll();
		for (User user : userList) {
			System.out.println(user);
		}
	}
	
	//测试二级缓存
	@Test
	public void test02(){
		SqlSession session = factory.openSession();
		//获得代理对象
		UserMapper mapper = session.getMapper(UserMapper.class);
		//调用方法
		List<User> userList = mapper.findAll();
		userList = mapper.findAll();
		userList = mapper.findAll();
		for (User user : userList) {
			System.out.println(user);
		}
		session.close();
		SqlSession session2 = factory.openSession();
		//获得代理对象
		UserMapper mapper2 = session2.getMapper(UserMapper.class);
		//调用方法
		List<User> userList2 = mapper2.findAll();

		for (User user : userList2) {
			System.out.println(user);
		}
		
	}
	//手动封装 findOTO
		@Test
		public void test03(){
			SqlSession session = factory.openSession();
			//获得代理对象
			UserMapper mapper = session.getMapper(UserMapper.class);
			//调用方法
			List<User> userList = mapper.findMap();
			for (User user : userList) {
				System.out.println(user);
			}
		}
		//一对一
		@Test
		public void test04(){
			SqlSession session = factory.openSession();
			//获得代理对象
			 
			//调用方法
			List<User> userList = session.selectList("mapper.UserMapper.findOTO");
			for (User user : userList) {
				System.out.println(user);
			}
		}
		//一对多
		@Test
		public void test05(){
			SqlSession session = factory.openSession();
			//获得代理对象
			 
			//调用方法
			List<Dept> deptList = session.selectList("mapper.UserMapper.findOTM");
			for (Dept dept : deptList) {
				System.out.println(dept);
			}
		}
		//多对多
		@Test
		public void test06(){
			SqlSession session = factory.openSession();
			//获得代理对象
			 
			//调用方法
			List<Teacher> teacherList = session.selectList("mapper.UserMapper.findMTM");
			for (Teacher teacher : teacherList) {
				System.out.println(teacher);
			}
		}
}
