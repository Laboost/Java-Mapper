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
        this.address = new Address(streetAddress,city,postalCode); //creates A new address object for the customer

        for (String type : phoneNumbers.keySet()){ //foreach set of phone info values (Type,Num)
            PhoneNumber customerPhone = new PhoneNumber(type,phoneNumbers.get(type)); //create a new phone object
            this.phoneNumbers.add(customerPhone); // add the new created object to the phone list of the customer
        }
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
    public ArrayList<PhoneNumber> getPhoneNumbers() {
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
    public void setPhoneNumbers(ArrayList<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
