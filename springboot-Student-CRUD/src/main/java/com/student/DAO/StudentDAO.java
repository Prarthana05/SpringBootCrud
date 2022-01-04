package com.student.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.model.Student;

public interface StudentDAO extends JpaRepository<Student, Integer>{

}
