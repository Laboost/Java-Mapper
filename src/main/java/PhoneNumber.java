public class PhoneNumber {

    private String type;
    private String number;

    public PhoneNumber(String type, String number){
        this.type = type;
        this.number = number;
    }

    //getters
    public String getType() {
        return type;
    }
    public String getNumber() {
        return number;
    }

    //setters
    public void setType(String type) {
        this.type = type;
    }
    public void setNumber(String number) {
        this.number = number;
    }

}