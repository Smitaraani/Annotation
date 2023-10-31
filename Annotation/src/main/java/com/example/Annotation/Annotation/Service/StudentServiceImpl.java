package com.example.Annotation.Annotation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Annotation.Annotation.dao.StudentRepositary;
import com.example.Annotation.Annotation.entity.Student;

public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	private StudentRepositary  repositary;
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Student> getStudent(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
