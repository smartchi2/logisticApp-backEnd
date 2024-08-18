package org.logisticapp.logistic.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private Location state;
    private String postalCode;
    private Countries country;
    private double latitude;
    private double longitude;
}
