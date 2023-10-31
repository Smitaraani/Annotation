package com.example.Annotation.Annotation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "STUDENT_TBL")
	public class Course {
	    @Id
	    private int id;

	    private String courseName;

	    private Student student;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Course(int id, String courseName, Student student) {
			super();
			this.id = id;
			this.courseName = courseName;
			this.student = student;
		}

		@Override
		public String toString() {
			return "Course [id=" + id + ", courseName=" + courseName + ", student=" + student + "]";
		}
	    
	    

}
