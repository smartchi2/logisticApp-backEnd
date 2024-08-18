package org.logisticapp.logistic.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUser {
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private String userName;
    private String password;
    private String confirmPassword;
    private UserRoles yourRole;
    private Location yourState;

}
