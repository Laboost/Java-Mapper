import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<PhoneNumber> phoneNumbers  = new ArrayList<PhoneNumber>();
        phoneNumbers.add(new PhoneNumber("mobile","(423) 811-7588"));
        Customer newCustomer = new Customer(
                "John",
                "Doe",
                25,
                "Milton Street",
                "New York",
                10021,
                phoneNumbers
                );
        //Creating a json of the customer data using jackson mapper
        Mapper<Customer> customerMapper = new Mapper<Customer>();
        customerMapper.objectToJson(newCustomer);
    }
}
