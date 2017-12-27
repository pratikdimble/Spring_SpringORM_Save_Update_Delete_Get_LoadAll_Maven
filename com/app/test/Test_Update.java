package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.app.entity.Employee;

public class Test_Update {

	public static void main(String[] args) {
		//get the spring configuration
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		//get the hibernate Template bean
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("htObj");
		//create the entity object and update the data based on primary key
		Employee e=ht.get(Employee.class, 11);
		if(e!=null){
			e.setEmpname("Pratik");
			//update the object
			ht.update(e);
				System.out.println("\n\t\tEmployee Record Found and  Updated ");
		}
		else System.out.println("\n\t\tEmployee Record Not Found ");	
		
	}

}
