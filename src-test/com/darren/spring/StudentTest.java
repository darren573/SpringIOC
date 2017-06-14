package com.darren.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.darren.spring.bean.Student;

public class StudentTest {

	@Test
	public void test() {
		System.out.println("**********自己控制*******************");
		Student student = new Student();//实例化对象的控制权在开发人员手中
		System.out.println("可以使用的实例化对象:"+student);
		System.out.println("**********spring容器控制：XML配置文件实现*******************");
		ApplicationContext context01=new ClassPathXmlApplicationContext("applicationContext02.xml");
		Student stu01=context01.getBean(Student.class);
		System.out.println(stu01.getName());
		System.out.println("**********spring容器控制：注解的方式来实现*******************");
		ApplicationContext context02=new ClassPathXmlApplicationContext("applicationContext01.xml");
		Student stu02 =context02.getBean(Student.class);
		stu02.setId(123);
		stu02.setName("张无忌");
		stu02.setAddress("同住地球村");
		stu02.setSex("男");
		System.out.println(stu02.getId()+"\t"+stu02.getName()+"\t"+stu02.getAddress()+"\t"+stu02.getSex());
	}
}
