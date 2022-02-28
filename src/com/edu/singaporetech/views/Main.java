package com.edu.singaporetech.views;

import com.edu.singaporetech.controllers.JSONParser;
import com.edu.singaporetech.controllers.UserGreetingPrinter;
import com.edu.singaporetech.controllers.UserHandler;
import com.edu.singaporetech.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Entry point of program. Main class contains main method.
 * In this main method, the input JSON is parsed into a list of User objects.
 * Then, the list of User objects is mapped 1:1 into a list of String of corresponding user greetings.
 * Finally, each user greeting in the list of String is printed to the console.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        String JSON_INPUT_PATH = "src/com/edu/singaporetech/rsc/input.json";

        List<User> usersArrayList = JSONParser.parseJSONToArrayList(JSON_INPUT_PATH);
        List<String> userGreetingsArrayList = UserHandler.getUserGreetings(usersArrayList);
        UserGreetingPrinter.printUserGreetings(userGreetingsArrayList);
    }
}
