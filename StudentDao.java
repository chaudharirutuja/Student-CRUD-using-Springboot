package com.student.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory sf;

	public List<Student> GetAllStudents() {
		Session session=sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}

	public String InsertStudent(Student stud) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(stud);
		transaction.commit();
		session.close();
		return "Student saved sucessfully";
	}

	public String UpdateStudent(Student student) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(student);
		transaction.commit();
		return "Student Updated Successfully";
	}

	public String DeleteStudentByRoll(int rollnum) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Student student=session.load(Student.class, rollnum);
		session.delete(student);
		transaction.commit();
		session.close();
		return "Student deleted Successfully !!!";
	}



}
