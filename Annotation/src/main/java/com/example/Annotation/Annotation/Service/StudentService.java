package com.example.Annotation.Annotation.Service;

import java.util.List;
import java.util.Optional;

import com.example.Annotation.Annotation.entity.Student;

public interface StudentService {
	
	  public Student addStudent(Student student);

	    public Optional<Student> getStudent(int id);

	    public List<Student> getStudents();

}
