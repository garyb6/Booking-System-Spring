package com.courseBookingSystem.courseBookingSystem.components;

import com.courseBookingSystem.courseBookingSystem.models.Booking;
import com.courseBookingSystem.courseBookingSystem.models.Course;
import com.courseBookingSystem.courseBookingSystem.models.Customer;
import com.courseBookingSystem.courseBookingSystem.repositories.BookingRepository;
import com.courseBookingSystem.courseBookingSystem.repositories.CourseRepository;
import com.courseBookingSystem.courseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){}

    @Override
    public void run(ApplicationArguments args) {
        Course course = new Course("java", "edinburgh", 4);
        courseRepository.save(course);

        Course course2 = new Course ("python", "glasgow", 2);
        courseRepository.save(course2);

        Customer customer = new Customer("gary", "gateshead", 22);
        customerRepository.save(customer);

        Customer customer2 = new Customer( "andrew", "edinburgh", 18);
        customerRepository.save(customer2);

        Booking booking = new Booking ("15-11-21", course, customer);
        bookingRepository.save(booking);

        Booking booking2 = new Booking ("12-01-22", course2, customer2);
        bookingRepository.save(booking2);

    }
}
