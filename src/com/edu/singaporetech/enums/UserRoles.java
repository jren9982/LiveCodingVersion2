package com.edu.singaporetech.enums;

/**
 * Provides an enum of UserRoles.
 */
public enum UserRoles {
    /** A generic User, represents any object in the input JSON */
    USER("User"),

    /** A Teacher, represents objects in the input JSON with "role":"Teacher" */
    TEACHER("Teacher"),

    /** A Developer, represents objects in the input JSON with "role":"Developer" */
    DEVELOPER("Developer");

    /** stores the user's role */
    private final String userRole;

    /**
     * Initialises each enum type with a corresponding userRole value.
     * @param userRole
     */
    UserRoles(String userRole) {
        this.userRole = userRole;
    }

    /**
     * @return the userRole value for the given enum type.
     */
    public String getUserRole() {
        return this.userRole;
    }

    /**
     * Determines the task that the User should have, given the enum type's userRole value.
     * @return String: the task of the User.
     */
    public String getUserRoleTask() {
        switch(this.userRole) {
            case "User":
                return "work";

            case "Teacher":
                return "teach";
                
            case "Developer":
                return "code";
        }
        return "ERROR!";
    }
}
