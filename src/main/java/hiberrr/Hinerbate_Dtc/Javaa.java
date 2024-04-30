package hiberrr.Hinerbate_Dtc;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Embeddable
public class Javaa {

	//@GeneratedValue()
	private int jid;
	private String oop;
	
	private String core;
	private String hibernate;
	
	
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getOop() {
		return oop;
	}
	public void setOop(String oop) {
		this.oop = oop;
	}
	public String getCore() {
		return core;
	}
	public void setCore(String core) {
		this.core = core;
	}
	public String getHibernate() {
		return hibernate;
	}
	public void setHibernate(String hibernate) {
		this.hibernate = hibernate;
	}
	
	public Javaa(int jid, String oop, String core, String hibernate) {
		super();
		this.jid = jid;
		this.oop = oop;
		this.core = core;
		this.hibernate = hibernate;
	}
	public Javaa() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Javaa [jid=" + jid + ", oop=" + oop + ", core=" + core + ", hibernate=" + hibernate + "]";
	}
	
	
	
	
	

}
