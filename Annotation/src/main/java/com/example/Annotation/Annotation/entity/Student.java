package com.example.Annotation.Annotation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "STUDENT_TBL")
	public class Student {

	    @Id
	    @Column(name = "STUDENT_ID")
	    private int id;
	    @Column(name = "STUDENT_NAME")
	    private String name;
	    @Column(name = "ROLL_NO")
	    private int rollNo;
	    @Column(name = "DEPT")
	    private String dept;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int id, String name, int rollNo, String dept) {
			super();
			this.id = id;
			this.name = name;
			this.rollNo = rollNo;
			this.dept = dept;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", dept=" + dept + "]";
		}
	    
	    

}
