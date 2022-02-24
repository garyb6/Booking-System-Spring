package com.courseBookingSystem.courseBookingSystem.repositories;


import com.courseBookingSystem.courseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findCoursesByRating(int rating);
    List<Course> findCoursesByBookingsCustomerName(String name);

}
