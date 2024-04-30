package hiberrr.Hinerbate_Dtc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /*1. configuration 
         * 2. session factory -> buildsession
         * 3.session -> opensession
         * 4.transaction -> commit 
         * 5. close
         */
        /*Embedded -> 
         * 
         */
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        // data
        Javaa jvJavaa = new Javaa();
        jvJavaa.setJid(1);
        jvJavaa.setCore("loop");
        jvJavaa.setHibernate("annotations");
        jvJavaa.setOop("interface");
        
        Javaa jvJavaa2 = new Javaa();
        jvJavaa2.setJid(2);
        jvJavaa2.setCore("conditional statements");
        jvJavaa2.setHibernate("data insert");
        jvJavaa2.setOop("inheritance");
        
        Course crCourse = new Course();
        crCourse.setCid(1);
        crCourse.setCname("fullstack");
        crCourse.setJv(jvJavaa);
     
        Course crCourse2 = new Course();
        crCourse2.setCid(2);
        crCourse2.setCname("machine learning");
        crCourse2.setJv(jvJavaa2);
        
        
//        
        Session session = factory.openSession();
        Transaction txTransaction = session.beginTransaction();
        
        // save to db ...
        
        session.save(crCourse);
        session.save(crCourse2);
       // session.save(jvJavaa);
//        session.save(jvJavaa2);
        txTransaction.commit();
        
        session.close();
        
        
        
        
        
        
        //Session session2 = factory.buildSession()
        
        
        
        
        
        
        
        
        
        
        
    }
}
