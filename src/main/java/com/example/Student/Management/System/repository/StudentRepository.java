package com.example.Student.Management.System.repository;


import com.example.Student.Management.System.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
