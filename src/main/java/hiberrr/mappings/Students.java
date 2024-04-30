package hiberrr.mappings;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Students {

	@Id
	private int sid;
	private String nameString;
	private String typeString;
	@ManyToMany
	private List<Project> projects;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getTypeString() {
		return typeString;
	}
	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Students(int sid, String nameString, String typeString, List<Project> projects) {
		super();
		this.sid = sid;
		this.nameString = nameString;
		this.typeString = typeString;
		this.projects = projects;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", nameString=" + nameString + ", typeString=" + typeString + ", projects="
				+ projects + "]";
	}
	
	
	
	
}
