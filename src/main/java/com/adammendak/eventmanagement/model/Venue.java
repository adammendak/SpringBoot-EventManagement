package com.adammendak.eventmanagement.model;

import javax.persistence.Entity;

@Entity
public class Venue extends AbstractEntity{

    private String name;
    private String streetAddress;
    private String streetAddress2;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Venue venue = (Venue) o;

        if (name != null ? !name.equals(venue.name) : venue.name != null) return false;
        if (streetAddress != null ? !streetAddress.equals(venue.streetAddress) : venue.streetAddress != null)
            return false;
        if (streetAddress2 != null ? !streetAddress2.equals(venue.streetAddress2) : venue.streetAddress2 != null)
            return false;
        if (city != null ? !city.equals(venue.city) : venue.city != null) return false;
        if (state != null ? !state.equals(venue.state) : venue.state != null) return false;
        if (country != null ? !country.equals(venue.country) : venue.country != null) return false;
        return postalCode != null ? postalCode.equals(venue.postalCode) : venue.postalCode == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (streetAddress != null ? streetAddress.hashCode() : 0);
        result = 31 * result + (streetAddress2 != null ? streetAddress2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        return result;
    }
}
