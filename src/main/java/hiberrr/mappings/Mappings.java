package hiberrr.mappings;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mappings {
	// one to one , one to many , many to one , many to many 
	public static void main(String[] args) {
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
		
        Project project = new Project();
        project.setPid(1);
        project.setPnameString("e-commerse site");
        

        
        Project project2 = new Project();
        project2.setPid(2);
        project2.setPnameString("facture detection");
        
        Project project3 = new Project();
        project3.setPid(3);
        project3.setPnameString("student management");
        
        Students students = new Students();
        students.setNameString("rochak");
        students.setSid(1);
        students.setTypeString("web development");
        
        Students students2 = new Students();
        students2.setNameString("rikesh");
        students2.setSid(5);
        students2.setTypeString("microservices");
     
        List<Project> projects = new ArrayList<Project>();
        projects.add(project2);
        projects.add(project);
        projects.add(project3);
        
        
        List<Students> studentliStudents = new ArrayList<Students>();
        studentliStudents.add(students2);
        studentliStudents.add(students);
        
        
        
        students.setProjects(projects);
        students2.setProjects(projects);
        
        project.setSrList(studentliStudents);
        project2.setSrList(studentliStudents);
        project3.setSrList(studentliStudents);
    
       
        
        
        Session session = factory.openSession();
        Transaction txTransaction = session.beginTransaction();
		// save
        
        session.save(project2);
        session.save(project);
        session.save(project3);
        session.save(students);
        session.save(students2);
      
        
        txTransaction.commit();
        session.close();
        
        
        
		
	}
	
	
}
