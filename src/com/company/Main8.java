package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main8 {

    public static void main(String[] arg) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        String userJson = "{\"name\":\"John\",\"age\":21}";
        User userObject = objectMapper.readValue(userJson, User.class);

        System.out.println(userObject.getName()); // John
        System.out.println(userObject.getAge());  // 21
    }
}