package com.cg.oct12.batch3.hibernate.labbook;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.oct12.batch3.hibernate.labbook.entities.Author;


public interface AuthorDemo {
public static void main(String[] args) {
		
		System.out.println("Start");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		Author aut1 = new Author(101,"Shubham","Mahesh","Patil",9999999999l);
		Author aut2 = new Author(102,"Samruddhi","Ramesh","Thakare",7777777777l);
		Author aut3 = new Author(103,"Chetan","Chirag","tambe",8888888888l);
		
		//Insert
//		em.persist(aut1);  
//		em.persist(aut2);
//		em.persist(aut3);
		
		//remove
//		em.remove(em.find(Author.class, 102)); 
		
		// Update
//		aut1.setFirstName("Nilesh");
//		em.merge(aut1);    
		
		// Display
		Author aut = em.find(Author.class, 101);   
		System.out.println(aut.toString());
		
		tr.commit();
		System.out.println("End");
}
}