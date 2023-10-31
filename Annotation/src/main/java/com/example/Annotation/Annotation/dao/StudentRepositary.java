package com.example.Annotation.Annotation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Annotation.Annotation.entity.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer> {

}
