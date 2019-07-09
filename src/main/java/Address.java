public class Address {

    private String streetAddress;
    private String city;
    private Integer postalCode;

    public Address(String streetAddress, String city, Integer postalCode){
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
    }

    //getters
    public String getStreetAddress() {
        return streetAddress;
    }
    public String getCity() {
        return city;
    }
    public Integer getPostalCode() {
        return postalCode;
    }

    //setters
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

}