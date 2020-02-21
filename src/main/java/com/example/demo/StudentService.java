package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentDAO studentDAO;

	public List<Student> getAllStudents() {
		List<Student> studentList;
		studentList = (List<Student>) studentDAO.findAll();
		return studentList;
	}

	public Student getStudent(int id) {
		Student student = null;
		student = (Student) studentDAO.findById(id).get();
		return student;
	}

	public void addStudent(Student student) {

		studentDAO.save(student);
	}
}
