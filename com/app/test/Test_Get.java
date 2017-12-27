package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.app.entity.Employee;

public class Test_Get {

	public static void main(String[] args) {
		//get the spring configuration
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		//get the hibernate Template bean
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("htObj");
		
			//get the single object
	Employee e=ht.get(Employee.class, 12);
	System.out.println("\n\t\t"+e);

	}

}
