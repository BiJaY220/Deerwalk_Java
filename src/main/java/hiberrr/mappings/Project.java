package hiberrr.mappings;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Project {
	@Id
	private int pid;
	
	private String pnameString;
	@ManyToMany(mappedBy = "projects")
	private List<Students> srList;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPnameString() {
		return pnameString;
	}
	public void setPnameString(String pnameString) {
		this.pnameString = pnameString;
	}
	public List<Students> getSrList() {
		return srList;
	}
	public void setSrList(List<Students> srList) {
		this.srList = srList;
	}
	public Project(int pid, String pnameString, List<Students> srList) {
		super();
		this.pid = pid;
		this.pnameString = pnameString;
		this.srList = srList;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pnameString=" + pnameString + ", srList=" + srList + "]";
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
