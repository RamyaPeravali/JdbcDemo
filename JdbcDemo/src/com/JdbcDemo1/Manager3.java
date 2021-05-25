package com.JdbcDemo1;

import org.hibernate.Session;

public class Manager3 {

	public static void main(String[] args) {
	    Session s1=Util.getSession();
	    Student st=(Student) s1.get(Student.class, 2);
	    System.out.println(st.getFirstName());
	    System.out.println(st.getLastname());
	    System.out.println(st.getId());  
	}
}
