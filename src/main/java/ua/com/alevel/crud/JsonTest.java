package ua.com.alevel.crud;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    @SneakyThrows
    public void test() {
//        List<User> users = new ArrayList<>();
//        User user = new User();
//        user.setFirstName("first1");
//        user.setLastName("last1");
//        user.setFullName("first1 last1");
//        users.add(user);
//        user = new User();
//        user.setFirstName("first2");
//        user.setLastName("last2");
//        user.setFullName("first2 last2");
//        users.add(user);
//        user = new User();
//        user.setFirstName("first3");
//        user.setLastName("last3");
//        user.setFullName("first3 last3");
//        users.add(user);
//
//        Gson gson = new Gson();
//        String usersString = gson.toJson(users);

        BufferedReader bufferedReader = new BufferedReader(new FileReader("users.json"));
        String usersString = bufferedReader.readLine();

        System.out.println("usersString = " + usersString);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<User> usersConvert = objectMapper.readValue(usersString, new TypeReference<>() { });
            System.out.println("usersConvert = " + usersConvert);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
