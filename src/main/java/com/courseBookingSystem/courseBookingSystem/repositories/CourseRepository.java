package com.courseBookingSystem.courseBookingSystem.repositories;


import com.courseBookingSystem.courseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
