package questionThree;

public class Address {
    private String postalCode;
    private String street;
    private String zone;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", zone='" + zone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Address(String postalCode, String street, String zone, String city) {
        this.postalCode = postalCode;
        this.street = street;
        this.zone = zone;
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
