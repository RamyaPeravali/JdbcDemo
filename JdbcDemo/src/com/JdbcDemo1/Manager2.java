package com.JdbcDemo1;

import org.hibernate.Session;

public class Manager2 {

	public static void main(String[] args) {
		   Session s1=Util.getSession();
	        Mail m1=(Mail) s1.load(Mail.class, 3);
	        System.out.println(m1.getUsername());
	        System.out.println(m1.getPassword());
	        System.out.println(m1.getStudent().getFirstName());
	        System.out.println(m1.getStudent().getLastname());	            
	        System.out.println("done");
	         
	    }
}