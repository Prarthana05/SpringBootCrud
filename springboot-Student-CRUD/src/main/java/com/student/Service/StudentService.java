package com.student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.DAO.StudentDAO;
import com.student.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDAO dao;
	
	public String addStudent(Student student) {
		dao.save(student);
		return "New Student has been added to the database "+student.getRoll(); 
		//dao layer is needed to contact database 
		
	}
	
	public String addStudents(List<Student> students) {
		dao.saveAll(students);
		return "All the Students has been added to the database";
		//dao layer is needed to contact database 
	}
	
	
	public String deleteStudent(int roll) {
		Student student = dao.getById(roll);
		dao.delete(student);
		return "Roll Number is deleted :"+roll;
	}
	
	public String updateStudent(Student student) {
		dao.save(student);
		return "Roll Number is update :"+student.getRoll();
	}
	
	public Student getStudent(int roll) {
		return dao.findById(roll).get();
	}
}
