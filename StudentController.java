package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping ("/getallstudents")
	public List<Student> GetAllStudents()
	{
		return service.GetAllStudents();
	}
	
	@PostMapping ("/addstudent")
	public String InsertStudent(@RequestBody Student stud)
	{
		String message= service.InsertStudent(stud);
		return message;
	}
	
	@PutMapping ("/updatestudent")
	public String UpdateStudent(@RequestBody Student student)
	{
		String message=service.UpdateStudent(student);
		return message;
	}
	
	@DeleteMapping ("/deleteStudent/{rollnum}")
	public String DeleteStudentByRoll(@PathVariable int rollnum){
		String msg=service.DeleteStudentByRoll(rollnum);
		return msg;
	}

}
