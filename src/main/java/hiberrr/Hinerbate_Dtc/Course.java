package hiberrr.Hinerbate_Dtc;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private int cid;
	
	private String cname;
	
	private Javaa jv;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Javaa getJv() {
		return jv;
	}

	public void setJv(Javaa jv) {
		this.jv = jv;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", jv=" + jv + "]";
	}

	public Course(int cid, String cname, Javaa jv) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.jv = jv;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
