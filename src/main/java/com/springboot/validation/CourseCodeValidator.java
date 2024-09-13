package com.springboot.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String> {
    private String prefix;

    @Override
    public void initialize(CourseCode courseCode) {
        prefix = courseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        if (theCode != null) {
            return theCode.startsWith(prefix);
        } else {
            return true;
        }
    }
}
