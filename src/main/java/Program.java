import java.util.HashMap;
import com.fasterxml.jackson.databind.ObjectMapper;

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

        //Creating a new Customer Object using the input data
        Customer currentCustomer = CreateACustomer(firstName,lastName,age,streetAdress,city,postalCode,phoneNumbers);

        //Creating a json of the customer data using jackson mapper
        String CustomerJson = ObjectToJson(currentCustomer);
        System.out.println(CustomerJson);


    }

    private static Customer CreateACustomer(String firstName, String lastName, Integer age, String streetAdress, String city,
                                    Integer postalCode, HashMap<String,String> phoneNumbers){
        //create a new customer object
        return new Customer(firstName,lastName,age,streetAdress,city,postalCode,phoneNumbers);

    }

    private static String ObjectToJson(Object object){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(object);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
