package org.example.aigiri.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.example.aigiri.rest.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
