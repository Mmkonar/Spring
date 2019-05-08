package com.cg.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rsc = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		Employee emp= (Employee)factory.getBean("emp1");
//		emp.setEmpId(112);
//		emp.setName("MMK");
//		emp.setJoinDate(LocalDate.now());
//		emp.setSalary(23102);
//		emp.setLocation("Mumbai");
		System.out.println(emp);
		Employee emp1= (Employee)factory.getBean("emp2");
		System.out.println(emp1);
		
	}

}
