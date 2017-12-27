package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.app.entity.Employee;

public class Test_LoadAll {

	public static void main(String[] args) {
		//get the spring configuration
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		//get the hibernate Template bean
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("htObj");
		//create the entity object and load all the data
		List<Employee> e=null;
		e=ht.loadAll(Employee.class);
		for(Employee emps:e) {
			System.out.println(emps);
		}

	}

}
