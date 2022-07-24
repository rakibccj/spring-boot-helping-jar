package com.brother.springbatch.config;

import com.brother.springbatch.entity.Student;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        return student;
    }
}
