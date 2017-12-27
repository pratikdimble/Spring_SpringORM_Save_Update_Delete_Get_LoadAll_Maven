package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.app.entity.Employee;

public class Test_Save {

	public static void main(String[] args) {
		//get the spring configuration
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		//get the hibernate Template bean
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("htObj");
		//create the entity object and set the data
		Employee e=new  Employee();
		e.setEmpid(12);
		e.setEmpname("Pratik");
		e.setEmpsal(20000);
		//save the object
		int id=(Integer)ht.save(e);
			System.out.println("\n\t\tEmployee Saved with ID: "+id);
	}

}
