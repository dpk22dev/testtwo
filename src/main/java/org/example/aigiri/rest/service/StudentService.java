package org.example.aigiri.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.example.aigiri.rest.entity.Student;
import org.example.aigiri.rest.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Iterable<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student inputStudent) {
        studentRepository.save( inputStudent );
        return inputStudent;
    }
}
