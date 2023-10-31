package com.example.Annotation.Annotation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Annotation.Annotation.entity.Student;

@Service
	public class StudentServiceImpl2 implements StudentService{

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
