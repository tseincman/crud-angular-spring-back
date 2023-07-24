package com.tmseincman.crudspring.repository;

import com.tmseincman.crudspring.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository <Course, Long> {

}
