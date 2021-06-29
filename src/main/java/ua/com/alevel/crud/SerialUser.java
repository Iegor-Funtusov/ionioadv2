package ua.com.alevel.crud;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialUser {

    private final String USERS_SERIAL = "users.out";

    public void test() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setFirstName("first1");
        user.setLastName("last1");
        user.setFullName("first1 last1");
        users.add(user);
        user = new User();
        user.setFirstName("first2");
        user.setLastName("last2");
        user.setFullName("first2 last2");
        users.add(user);
        user = new User();
        user.setFirstName("first3");
        user.setLastName("last3");
        user.setFullName("first3 last3");
        users.add(user);

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(USERS_SERIAL))) {
            objectOutputStream.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(USERS_SERIAL))) {
            users = (List<User>) objectInputStream.readObject();
            System.out.println("users = " + users);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
