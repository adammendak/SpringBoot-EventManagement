package com.adammendak.eventmanagement.model;

import javax.persistence.Entity;
import java.time.Instant;

@Entity
public class Venue extends AbstractEntity{

    private String name;
    private String stringAddress;
    private String stringAddress2;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    public Venue(Long id, Instant created, String name, String stringAddress, String stringAddress2, String city, String state, String country, String postalCode) {
        super(id, created);
        this.name = name;
        this.stringAddress = stringAddress;
        this.stringAddress2 = stringAddress2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStringAddress() {
        return stringAddress;
    }

    public void setStringAddress(String stringAddress) {
        this.stringAddress = stringAddress;
    }

    public String getStringAddress2() {
        return stringAddress2;
    }

    public void setStringAddress2(String stringAddress2) {
        this.stringAddress2 = stringAddress2;
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
        if (stringAddress != null ? !stringAddress.equals(venue.stringAddress) : venue.stringAddress != null)
            return false;
        if (stringAddress2 != null ? !stringAddress2.equals(venue.stringAddress2) : venue.stringAddress2 != null)
            return false;
        if (city != null ? !city.equals(venue.city) : venue.city != null) return false;
        if (state != null ? !state.equals(venue.state) : venue.state != null) return false;
        if (country != null ? !country.equals(venue.country) : venue.country != null) return false;
        return postalCode != null ? postalCode.equals(venue.postalCode) : venue.postalCode == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (stringAddress != null ? stringAddress.hashCode() : 0);
        result = 31 * result + (stringAddress2 != null ? stringAddress2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        return result;
    }
}
