import java.util.*;

public class Customer {

    private String firstName;
    private String lastName;
    private Integer age;
    private Address address;
    private List<PhoneNumber> phoneNumbers;

    public Customer(String firstName, String lastName, Integer age, Address address, List<PhoneNumber> phoneNumbers){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Integer getAge() {
        return age;
    }
    public Address getAddress() {
        return address;
    }
    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
