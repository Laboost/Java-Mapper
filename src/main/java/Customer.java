import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private Integer age;
    private Address address;
    private ArrayList<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

    public Customer(String firstName, String lastName, Integer age, String streetAddress, String city,
                    Integer postalCode, HashMap<String,String> phoneNumbers){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = new Address(streetAddress,city,postalCode);
        for (String type : phoneNumbers.keySet()){
            PhoneNumber customerPhone = new PhoneNumber(type,phoneNumbers.get(type));
            this.phoneNumbers.add(customerPhone);
        }

    }

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

    public ArrayList<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }
}