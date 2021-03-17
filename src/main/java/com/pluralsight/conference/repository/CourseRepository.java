package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Course;

public interface CourseRepository {
    Course save(Course course);
}
