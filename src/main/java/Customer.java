import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private Integer age;
    private Address address;
    private List<PhoneNumber> PhoneNumbers = new ArrayList<PhoneNumber>();

    public Customer(String firstName, String lastName, Integer age, String streetAdress, String city, Integer postalCode){
        this.address = new Address();
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return PhoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        PhoneNumbers = phoneNumbers;
    }
}