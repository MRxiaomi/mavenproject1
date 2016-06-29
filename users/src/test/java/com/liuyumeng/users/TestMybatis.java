package com.liuyumeng.users;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liuyumeng.users.model.User;
import com.liuyumeng.users.service.UserServiceI;

/** 
  * @author  小米 
  * @date 创建时间：2016年6月26日 上午8:46:35 
  * @version 1.0 
  * @parameter  
  * @since  
  * @return  
  */
public class TestMybatis {
	@Test
	public  void test1(){
		//ApplicationContext context = new FileSystemXmlApplicationContext(new String[]{"src/main/resources/spring.xml","src/main/resources/spring-mybatis.xml"});
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		UserServiceI userService = (UserServiceI)context.getBean("userService");
		User user = userService.getUserById(1);
		System.out.println(user.getUid());
		System.out.println(user.getUserid());
		
		System.out.println(user.getShowname());
		System.out.println(user.getPwd());
	}
	
}
