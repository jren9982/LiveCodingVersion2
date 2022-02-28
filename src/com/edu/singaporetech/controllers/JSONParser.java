package com.edu.singaporetech.controllers;

import com.edu.singaporetech.enums.UserJSONKeys;
import com.edu.singaporetech.enums.UserRoles;
import com.edu.singaporetech.models.Developer;
import com.edu.singaporetech.models.User;
import com.edu.singaporetech.models.Teacher;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Provides a utility class to parse JSON.
 */
public class JSONParser {
    /**
     * Parses JSON into a List. Involves providing the expected JSON keys as enum values.
     * @param INPUT_PATH
     * @return a List of User objects.
     * @throws Exception
     */
    public static List<User> parseJSONToArrayList(final String INPUT_PATH) throws Exception {
        String USER_ARRAY_KEY = "users";

        JSONObject parsedJSON = (JSONObject) new org.json.simple.parser.JSONParser().parse(new FileReader(INPUT_PATH));
        JSONArray usersArray = (JSONArray) parsedJSON.get(USER_ARRAY_KEY);
        Iterator usersIterator = usersArray.iterator();

        List<User> usersList = new ArrayList<>();

        while (usersIterator.hasNext())
        {
            var user = (JSONObject) usersIterator.next();
            String role = (String) user.get(UserJSONKeys.ROLE.getUserKey());
            String name = (String) user.get(UserJSONKeys.NAME.getUserKey());
            int age = (int)(long) user.get(UserJSONKeys.AGE.getUserKey());

            if (role.equals(UserRoles.DEVELOPER.getUserRole())) {
                usersList.add(new Developer(name, age));
            }
            else if (role.equals(UserRoles.TEACHER.getUserRole())) {
                usersList.add(new Teacher(name, age));
            }
            else {
                throw new Exception("Unexpected role detected while parsing!");
            }
        }
        return usersList;
    }
}
