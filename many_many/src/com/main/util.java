
package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Course;
import com.pojo.Student;

public class util {
	private static SessionFactory factory;
	
	static {
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				
				.buildSessionFactory();

		
	} 
	
	public static  SessionFactory getfactory() {
		return factory;
	}

}
