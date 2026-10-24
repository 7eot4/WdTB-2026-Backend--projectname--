package pl.wsb.przeglady.equipment.entity;

import jakarta.persistence.*;

@Embeddable
public class Address {

    @Column(name = "street", length = 80)
    private String street;

    @Column(name = "city", length = 60)
    private String city;

    @Column(name = "postal_code", length = 12)
    private String postalCode;

    @Column(name = "country_code", length = 2)
    private String countryCode;

    protected Address() {
    }

    public Address(String street, String city, String postalCode, String countryCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

}
