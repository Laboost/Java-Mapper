public class Address {

    private String streetAddress;
    private String city;
    private Integer postalCode;

    public Address(String streetAddress, String city, Integer postalCode){
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }
    public Integer getPostalCode() {
        return postalCode;
    }

}