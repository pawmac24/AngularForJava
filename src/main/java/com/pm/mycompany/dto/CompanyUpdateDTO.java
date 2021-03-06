package com.pm.mycompany.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

/**
 * Created by pmackiewicz on 2015-11-04.
 */
public class CompanyUpdateDTO {

    @NotBlank
    @Size(min = 1, max = 50)
    private String name;

    private AddressDTO address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public CompanyUpdateDTO() {
    }

    public CompanyUpdateDTO(String name, AddressDTO address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "CompanyUpdateDTO{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
