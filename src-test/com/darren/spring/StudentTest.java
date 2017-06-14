package com.darren.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.darren.spring.bean.Student;

public class StudentTest {

	@Test
	public void test() {
		System.out.println("**********�Լ�����*******************");
		Student student = new Student();//ʵ��������Ŀ���Ȩ�ڿ�����Ա����
		System.out.println("����ʹ�õ�ʵ��������:"+student);
		System.out.println("**********spring�������ƣ�XML�����ļ�ʵ��*******************");
		ApplicationContext context01=new ClassPathXmlApplicationContext("applicationContext02.xml");
		Student stu01=context01.getBean(Student.class);
		System.out.println(stu01.getName());
		System.out.println("**********spring�������ƣ�ע��ķ�ʽ��ʵ��*******************");
		ApplicationContext context02=new ClassPathXmlApplicationContext("applicationContext01.xml");
		Student stu02 =context02.getBean(Student.class);
		stu02.setId(123);
		stu02.setName("���޼�");
		stu02.setAddress("ͬס�����");
		stu02.setSex("��");
		System.out.println(stu02.getId()+"\t"+stu02.getName()+"\t"+stu02.getAddress()+"\t"+stu02.getSex());
	}
}
