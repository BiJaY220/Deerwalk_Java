package hiberrr.fetching;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
	public static void main(String[] args) {
		// get , load
		/*
		 * load -> proxy create (hit -> when using data)
		 * -> memory util , efficiency 
		 * get -> session cache, -> database hit
		 * -> get query run  
		 * lifecycle of hibernate session:
		 * 
		 * transient -> presistant -> detach -> remove
		 * 
		 * 
		 * fetching -> lazy(load), eager(get)
		 * caching-> project
		 */
        
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
		
        Fruits friFruits = new Fruits();
        friFruits.setFid(1);
        friFruits.setFnameString("apple");
        friFruits.setTypeString("sweet");
        List<String> fruitssList = new ArrayList<String>();
        fruitssList.add("mango");
        fruitssList.add("graphs");
        fruitssList.add("pine apple");
        friFruits.setFruitssList(fruitssList);
        
        
//        Fruits friFruits2 = new Fruits();
//        friFruits2.setFid(2);
//        friFruits2.setFnameString("orange");
//        friFruits2.setTypeString("sour");
        
		
        //data
        
        Session session = factory.openSession();
        Transaction txTransaction = session.beginTransaction();
        
        //save
        session.save(friFruits);
        //session.save(friFruits2);
        Fruits fruits = (Fruits)session.get(Fruits.class, 1);
        System.out.println("the details is :"+fruits.getFnameString());
//        for (Fruits fruits2 :fruits.getFruitssList()) {
//        	
//        	System.out.println("the list is "+fruits2.getFruitssList());
//        }
        
        		
        txTransaction.commit();
        
        session.close();
        
		
	}

}
