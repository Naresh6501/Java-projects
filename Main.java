package com.zensar.bean.pack1;

 

 

import java.time.LocalDate;

 

import javax.persistence.EntityManager;

 


import com.zensar.util.JPAUtil;

 

public class Main {
    
    static void test1() {
        Person person=new Person(103, "naresh", LocalDate.of(1998, 5, 16), 'M', null);
        
        ContactInfo contactInfo=new ContactInfo("nkreddy@gmail.com", "988776655", null);
        person.setContactInfo(contactInfo);
        contactInfo.setPerson(person);
        
        EntityManager em=JPAUtil.createEntityManager("PU");
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        JPAUtil.shutDown();
        
        
    }

 static void test2() {
	Person person=null;
	 
	 EntityManager em=JPAUtil.createEntityManager("PU");
    person= em.find(Person.class, 102);
	 System.out.println(person);
     JPAUtil.shutDown();
 }

    public static void main(String[] args) {
        test1();

 

    }

 

}