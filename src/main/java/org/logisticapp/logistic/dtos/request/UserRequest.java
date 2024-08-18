package org.logisticapp.logistic.dtos.request;

import lombok.Getter;
import lombok.Setter;
import org.logisticapp.logistic.data.models.Address;
import org.logisticapp.logistic.data.models.Location;
import org.logisticapp.logistic.data.models.UserRoles;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class UserRequest {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private String userName;
    private String password;
    private String confirmPassword;
    private Address address;
    private UserRoles yourRole;
    private Location userLocation;
}
