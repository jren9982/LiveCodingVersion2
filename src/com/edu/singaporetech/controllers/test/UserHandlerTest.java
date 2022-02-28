package com.edu.singaporetech.controllers.test;

import com.edu.singaporetech.models.Developer;
import com.edu.singaporetech.models.Teacher;
import com.edu.singaporetech.models.User;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides unit test for the UserHandler class.
 */
class UserHandlerTest {
    List<User> inputUserArrayList;
    List<String> expectedUserGreetingsArrayList;

    /**
     * Tests whether the expected greeting phrase is produced when getGreeting() is called on each User object.
     */
    @Test
    @DisplayName("Given an arraylist of users, calling getGreeting() on each user should produce the correct greeting.")
    void testCorrectGreetings() {
        inputUserArrayList = new ArrayList<>() {
            {
                add(new Teacher("Watson Mclean", 25));
                add(new Developer("Tiffany Travis", 22));
                add(new User("John Smith", 32));
            }
        };
        expectedUserGreetingsArrayList = new ArrayList<>() {
            {
                add("Hi my name is Watson Mclean and I am 25 years old, I teach for a living.");
                add("Hi my name is Tiffany Travis and I am 22 years old, I code for a living.");
                add("Hi my name is John Smith and I am 32 years old, I work for a living.");
            }
        };
        for (int index = 0; index < inputUserArrayList.size(); index++) {
            String expectedGreeting = expectedUserGreetingsArrayList.get(index);
            String actualGreeting = inputUserArrayList.get(index).getGreeting();
            assertEquals(expectedGreeting, actualGreeting);
        }
    }
}