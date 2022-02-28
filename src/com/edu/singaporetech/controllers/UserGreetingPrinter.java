package com.edu.singaporetech.controllers;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides a utility class to print an ArrayList of User greetings strings.
 */
public class UserGreetingPrinter {
    /**
     * Takes the User greeting as a List of String, and prints each User greeting string in the console.
     * @param userGreetingsList
     */
    public static void printUserGreetings(List<String> userGreetingsList) {
        for (String userGreeting : userGreetingsList) {
            System.out.println(userGreeting);
        }
    }
}
