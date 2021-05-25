package com.JdbcDemo1;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1 {

	public static void main(String[] args) {
        Session s1=Util.getSession();
        //one student has two email accounts.
        Student st=new Student();
        st.setFirstName("Ramu");
        st.setLastname("sankar");
        Mail m1=new Mail();
        m1.setUsername("s@gmail.com");
        m1.setPassword("xyz");
        m1.setStudent(st);
        
        Mail m2=new Mail();
        m2.setUsername("g@gmail.com");
        m2.setPassword("abc");
        m2.setStudent(st);
               
        Student st1=new Student();
        st1.setFirstName("Kamu");
        st1.setLastname("sankar");
        Mail m3=new Mail();
        m3.setUsername("kishore@gmail.com");
        m3.setPassword("xyz1");
        m3.setStudent(st1);
        
        Mail m4=new Mail();
        m4.setUsername("kiran@gmail.com");
        m4.setPassword("blr");
        m4.setStudent(st1);
                
        Transaction t=s1.beginTransaction();       
        //save only mail objects        
        s1.save(m1);
        s1.save(m2);
        s1.save(m3);
        s1.save(m4);
        t.commit();
        System.out.println("done");        
    }
}
