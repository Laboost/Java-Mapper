import java.util.HashMap;

public class Program {
    public static void main(String[] args){

        // Input Data
        String firstName = "John";
        String lastName = "Doe";
        Integer age = 25;
        String streetAdress = "Milton Street";
        String city = "New York";
        Integer postalCode = 10021;
        HashMap<String,String> phoneNumbers = new HashMap<String, String>();
        phoneNumbers.put("mobile","(423) 811-7588");

        //sending data to the processor
        CreateACustomer(firstName,lastName,age,streetAdress,city,postalCode,phoneNumbers);


    }

    private static void CreateACustomer(String firstName, String lastName, Integer age, String streetAdress, String city,
                                    Integer postalCode, HashMap<String,String> phoneNumbers){
        //create a new customer object
        Customer currentCustomer = new Customer(firstName,lastName,age,streetAdress,city,postalCode,phoneNumbers);

        System.out.println(currentCustomer.getAddress());
        System.out.println(currentCustomer.getAge());
        System.out.println(currentCustomer.getFirstName());
        System.out.println(currentCustomer.getLastName());
        System.out.println(currentCustomer.getPhoneNumbers());
    }
}
