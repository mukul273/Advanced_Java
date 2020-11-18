package io.reference;

import io.common.Instructor;

import java.util.List;

public interface InstructorFactory {
    public abstract Instructor getInstructor(String name,
                                             int yearsOfExp,
                                             String title,
                                             String gender,
                                             boolean onlineCourse,
                                             List<String> courses);
}
