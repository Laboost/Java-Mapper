import java.util.HashMap;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

public class Program {
    final static Logger logger = Logger.getLogger(Program.class);

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

        //log the creation of the customer and the json
        LogCustomerCreation(CustomerJson);


    }

    //create a new customer object
    private static Customer CreateACustomer(String firstName, String lastName, Integer age, String streetAdress, String city,
                                    Integer postalCode, HashMap<String,String> phoneNumbers){

        return new Customer(firstName,lastName,age,streetAdress,city,postalCode,phoneNumbers);

    }

    //create a json String of a given object
    private static String ObjectToJson(Object object){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(object);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    private static void LogCustomerCreation(String customerData){
        logger.info("A new customer has been created.");
        logger.info("Customer Data: \n" + customerData);
    }
}
