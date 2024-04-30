package hiberrr.fetching;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fruits {
	
	@Id
	private int fid;
	private String fnameString;
	private String typeString;
	
	List<String> fruitssList = new ArrayList<String>();

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFnameString() {
		return fnameString;
	}

	public void setFnameString(String fnameString) {
		this.fnameString = fnameString;
	}

	public String getTypeString() {
		return typeString;
	}

	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}

	public List<String> getFruitssList() {
		return fruitssList;
	}

	public void setFruitssList(List<String> fruitssList) {
		this.fruitssList = fruitssList;
	}

	public Fruits(int fid, String fnameString, String typeString, List<String> fruitssList) {
		super();
		this.fid = fid;
		this.fnameString = fnameString;
		this.typeString = typeString;
		this.fruitssList = fruitssList;
	}

	public Fruits() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Fruits [fid=" + fid + ", fnameString=" + fnameString + ", typeString=" + typeString + ", fruitssList="
				+ fruitssList + "]";
	}
	
	

}
