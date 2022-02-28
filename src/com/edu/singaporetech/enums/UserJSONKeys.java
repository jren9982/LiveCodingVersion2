package com.edu.singaporetech.enums;

/**
 * Provides an enum of expected keys from the input JSON.
 */
public enum UserJSONKeys {
    /** key used to denote the JSON user object's role */
    ROLE("role"),

    /** key used to denote the JSON user object's name */
    NAME("name"),

    /** key used to denote the JSON user object's age */
    AGE("age");

    /** stores the JSON key */
    private final String userJSONKey;

    /** Initialises the enum type with the expected key */
    UserJSONKeys(String JSONKey) { this.userJSONKey = JSONKey; }

    /**
     * @return the key as an enum type value for each of the JSON object's fields.
     */
    public String getUserKey() { return this.userJSONKey; }
}
