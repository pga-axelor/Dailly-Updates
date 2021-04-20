package test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class spy {
	@Id
	private int sid;
	private String sname;
	private String color;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
