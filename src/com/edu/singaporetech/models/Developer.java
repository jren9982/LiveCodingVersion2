package com.edu.singaporetech.models;

import com.edu.singaporetech.enums.UserRoles;

/**
 * An object from the input JSON "users" key, with "role" : "Developer"
 * Overrides inherited method getGreeting(), in order to return a greeting unique to Developer objects.
 */
public class Developer extends User {

    /**
     * Initialises the Developer object.
     * @param name String: sets name of the Developer.
     * @param age int: sets age of the Developer.
     */
    public Developer(String name, int age) {
        super(name, age);
    }

    /**
     * Returns the Developer's greeting, with the correct arguments formatted into the greetingTemplate String.
     * @return String: the Developer's greeting.
     */
    @Override
    public String getGreeting() {
        return String.format(greetingTemplate, this.name, this.age, UserRoles.DEVELOPER.getUserRoleTask());
    }
}
