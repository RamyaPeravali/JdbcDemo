package com.JdbcDemo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

	public static Session getSession(){
	    Configuration c1=new Configuration();
	    c1.configure();
	    
	    SessionFactory sf=c1.buildSessionFactory();
	    return sf.openSession();
	}
}
