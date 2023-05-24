package com.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.StudentRepository;
import com.demo.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
	private StudentRepository studentrepository;
	@Override
	public Student saveStudent(Student std) {
		
		return studentrepository.save(std);
	}

}
