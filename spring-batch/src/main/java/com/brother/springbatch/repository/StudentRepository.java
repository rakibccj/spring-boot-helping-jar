package com.brother.springbatch.repository;

import com.brother.springbatch.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
