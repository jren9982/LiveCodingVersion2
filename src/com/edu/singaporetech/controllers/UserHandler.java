package com.edu.singaporetech.controllers;

import com.edu.singaporetech.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides a utility class to process User objects.
 */
public class UserHandler {
    /**
     * Maps 1:1 List of User objects into an ArrayList of User greeting strings.
     * @param userList
     * @return ArrayList of User's greeting strings.
     */
    public static List<String> getUserGreetings(List<User> userList) {
        List<String> userGreetings = new ArrayList<>();
        for (User user : userList) {
            userGreetings.add(user.getGreeting());
        }
        return userGreetings;
    }
}
