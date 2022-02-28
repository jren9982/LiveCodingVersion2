package com.edu.singaporetech.models;

import com.edu.singaporetech.enums.UserRoles;

/**
 * An object from the input JSON "users" key, with "role" : "Teacher"
 * Overrides inherited method getGreeting(), in order to return a greeting unique to Teacher objects.
 */
public class Teacher extends User {
    /**
     * Initialises the Teacher object.
     * @param name String: sets name of the Teacher.
     * @param age int: sets age of the Teacher.
     */
    public Teacher(String name, int age) {
        super(name, age);
    }

    /**
     * Returns the Teacher's greeting, with the correct arguments formatted into the greetingTemplate String.
     * @return String: the Teacher's greeting.
     */
    @Override
    public String getGreeting() {
        return String.format(greetingTemplate, this.name, this.age, UserRoles.TEACHER.getUserRoleTask());
    }
}
