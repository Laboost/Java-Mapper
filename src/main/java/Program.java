import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<PhoneNumber> phoneNumbers  = new ArrayList<PhoneNumber>();
        Address customerAddress = new Address("Milton Street","New York",10021);
        phoneNumbers.add(new PhoneNumber("mobile","(423) 811-7588"));
        Customer newCustomer = new Customer(
                "John",
                "Doe",
                25,
                customerAddress,
                phoneNumbers
                );
        //Creating a json of the customer data using jackson mapper
        Mapper<Customer> customerMapper = new Mapper<Customer>();
        customerMapper.objectToJson(newCustomer);
    }
}
