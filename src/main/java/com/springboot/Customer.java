package com.springboot;

import jakarta.validation.constraints.*;

public class Customer {
    @Min(value = 0,message = "must be greater or equal to zero")
    @Max(value = 10,message = "must be lower or equal to 10")
    private int freePasses;
    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;
    @Pattern(regexp = "^[A-Za-z0-9]{5}" ,message = "only 5 digits/numbers allowed")
    private String postalCode;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public @Pattern(regexp = "^[A-Za-z0-9]{5}", message = "only 5 digits/numbers allowed") String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(@Pattern(regexp = "^[A-Za-z0-9]{5}", message = "only 5 digits/numbers allowed") String postalCode) {
        this.postalCode = postalCode;
    }
}
