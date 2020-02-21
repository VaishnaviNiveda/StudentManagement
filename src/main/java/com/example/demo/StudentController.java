package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService st;

	@RequestMapping("/all")
	public List<Student> getStudents() {
		List<Student> studentList;
		studentList = st.getAllStudents();
		return studentList;
	}

	@RequestMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student;
		student = st.getStudent(id);
		return student;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/student/save")
	public void addStudent(@RequestBody Student student) {
		st.addStudent(student);
	}
}
