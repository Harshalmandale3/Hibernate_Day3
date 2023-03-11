package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="Roll")
	private int sroll;
	
	@Column
	private String sname;
	@Column
	private String smarks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String sname, String smarks) {
		super();
		this.sname = sname;
		this.smarks = smarks;
	}



	public Student(int sroll, String sname, String smarks) {
		super();
		this.sroll = sroll;
		this.sname = sname;
		this.smarks = smarks;
	}
	
	public int getSroll() {
		return sroll;
	}
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmarks() {
		return smarks;
	}
	public void setSmarks(String smarks) {
		this.smarks = smarks;
	}
	
	

}
