package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Course;
import com.pojo.Student;


public class Main {

	public static void main(String[] args) {
		
		 Session session = util.getfactory().openSession();
	        Transaction t = session.beginTransaction();
//
//	        Student s = new Student();
//	        s.setSname("Priyanshu");
//
//	        Course c = new Course();
//	        c.setCname("Java");
//	        Course c1= new Course();
//	        c1.setCname("python");
//
//	        
//	        
//	        List<Course> list=new ArrayList<>();
//	        list.add(c1);
//	        list.add(c);
//	        s.setCourses(list);
//	        
//	        session.save(c1);
//	        session.save(c);
//	        session.save(s);
//	        
//	      List<Student> list=session.createQuery("from Student",Student.class).list();
//	      for(Student s : list) {
//	    	  System.out.println("student : " + s.getSname() );
//	    	  for(Course c : s.getCourses()) {
//	    		  System.out.println("course : "+ c.getCname());
//	    	  }
//	      }
	        
	        Student s = session.get(Student.class, 1);  
	        session.delete(s);
	        
	        
	       

	        t.commit();
	        session.close();

	        System.out.println("fetch successfully ✅");
		
		
		
	}

}
