import java.util.HashMap;

public class Program {
    public void Main(){

        // Input Data
        String firstName = "John";
        String lastName = "Doe";
        Integer age = 25;
        String streetAdress = "Milton Street";
        String city = "New York";
        Integer postalCode = 10021;
        HashMap<String,String> phoneNumbers = new HashMap<String, String>();
        phoneNumbers.put("mobile","(423) 811-7588");

        //Sending Data To The Processor
        ProcessCustomerData(firstName,lastName,age,streetAdress,city,postalCode,phoneNumbers);


    }

    private void ProcessCustomerData(String firstName, String lastName, Integer age, String streetAdress, String city,
                                    Integer postalCode, HashMap<String,String> phoneNumber){

    }
}
