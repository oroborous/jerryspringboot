package com.example.jerryspringboot;

import com.example.jerryspringboot.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}
