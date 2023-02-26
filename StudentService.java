package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.student.dao.StudentDao;
import com.student.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;

	public List<Student> GetAllStudents() {
		
		return dao.GetAllStudents();
	}

	public String InsertStudent(Student stud) {
		
		return dao.InsertStudent(stud);
	}

	public String UpdateStudent(Student student) {
		
		return dao.UpdateStudent(student);
	}

	public String DeleteStudentByRoll(int rollnum) {
		
		return dao.DeleteStudentByRoll(rollnum);
	}
	
	
}
