package org.logisticapp.logistic.dtos.request;

import lombok.Getter;
import lombok.Setter;

import org.logisticapp.logistic.data.models.Countries;
import org.logisticapp.logistic.data.models.Location;

@Setter
@Getter
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
