package com.courseBookingSystem.courseBookingSystem;

import com.courseBookingSystem.courseBookingSystem.models.Booking;
import com.courseBookingSystem.courseBookingSystem.models.Course;
import com.courseBookingSystem.courseBookingSystem.models.Customer;
import com.courseBookingSystem.courseBookingSystem.repositories.BookingRepository;
import com.courseBookingSystem.courseBookingSystem.repositories.CourseRepository;
import com.courseBookingSystem.courseBookingSystem.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseBookingSystemApplicationTests {


	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createCourseAndCustomerAndBookingThenSave(){
		Course course = new Course("java", "edinburgh", 4);
		courseRepository.save(course);

		Customer customer = new Customer("gary", "gateshead", 22);
		customerRepository.save(customer);

		Booking booking = new Booking ("15-11-21", course, customer);
		bookingRepository.save(booking);
	}

	@Test
	public void canFindCoursesByRating(){
		List<Course> found = courseRepository.findCoursesByRating(4);
		assertEquals(1, found.size());
	}

	@Test
	public void canFindCourseByCustomerName(){
		List<Course> foundCourses = courseRepository.findCoursesByBookingsCustomerName("andrew");
		assertEquals(1, foundCourses.size());
		assertEquals("python", foundCourses.get(0).getName());
	}

}
