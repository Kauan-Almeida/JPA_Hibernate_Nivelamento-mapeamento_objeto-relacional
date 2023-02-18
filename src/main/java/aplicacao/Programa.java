package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		// **to add element in database
		  Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com"); 
		  Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquin@gmail.com"); 
		  Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com"); 
		  Pessoa p4 = new Pessoa(null, "Bob Green", "bob@gmail.com");
		  Pessoa p5 = new Pessoa(null, "Alex Grey", "alex@gmail.com");
		  Pessoa p6 = new Pessoa(null, "Tomy Miller", "tomy@gmail.com");
		   
		  em.getTransaction().begin();
		  em.persist(p1); 
		  em.persist(p2); 
		  em.persist(p3); 
		  em.persist(p4);
		  em.persist(p5); 
		  em.persist(p6); 
		  em.getTransaction().commit();
		 
		  System.out.println("Pronto!");

		// **Print on screen list of people
		/*
		 * Pessoa p1 = em.find(Pessoa.class, 4); 
		 * Pessoa p2 = em.find(Pessoa.class, 5);
		 * Pessoa p3 = em.find(Pessoa.class, 6); 
		 * Pessoa p4 = em.find(Pessoa.class, 7);
		 * Pessoa p5 = em.find(Pessoa.class, 8); 
		 * Pessoa p6 = em.find(Pessoa.class, 9);
		 * System.out.println(p1); 
		 * System.out.println(p2); 
		 * System.out.println(p3);
		 * System.out.println(p4); 
		 * System.out.println(p5); 
		 * System.out.println(p6);
		 */
		
		//*Remove people from the list
		/*
		*Pessoa p1 = em.find(Pessoa.class, 7);
		*Pessoa p2 = em.find(Pessoa.class, 8);
		*Pessoa p3 = em.find(Pessoa.class, 9);
		*
		*em.getTransaction().begin();
		*em.remove(p1);
		*em.remove(p2);
		*em.remove(p3);
		*em.getTransaction().commit();
		*System.out.println(p1);
		**/	
		em.close();
		emf.close();
	}
}
