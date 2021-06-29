package ua.com.alevel.crud;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class User implements Serializable {

    private String firstName;
    private String lastName;
    private transient String fullName;
}
