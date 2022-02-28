package com.edu.singaporetech.models;

import com.edu.singaporetech.enums.UserRoles;

/**
 * An object from the input JSON "users" key.
 * This class is the parent of Developer and Teacher subclasses.
 */
public class User {
    protected String name;
    protected int age;
    protected String greetingTemplate = "Hi my name is %s and I am %s years old, I %s for a living.";

    /**
     * Initialises the User object.
     * @param name String: sets name for the user.
     * @param age int: sets the age for the user.
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the User's greeting, with the correct arguments formatted into the greetingTemplate String.
     * @return String: the User's greeting.
     */
    public String getGreeting() {
        return String.format(greetingTemplate, this.name, this.age, UserRoles.USER.getUserRoleTask());
    }
}
