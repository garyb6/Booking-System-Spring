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

}
