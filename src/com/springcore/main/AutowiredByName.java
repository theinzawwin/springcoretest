package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Address;
import com.springcore.model.Person;

public class AutowiredByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Person person=(Person) context.getBean("person");
		person.showInfo();
		//te.spellCheck();
	}


}
