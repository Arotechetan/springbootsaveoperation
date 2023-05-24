package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.StudentService;
import com.demo.model.Student;
@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;
	@PostMapping("/savestudent")
	public ResponseEntity <Student>saveStudent(@RequestBody Student student){
		Student std=studentservice.saveStudent(student);
		return ResponseEntity.ok().body(std);
		
	}
}
