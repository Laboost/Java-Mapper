import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper{
    private ObjectMapper objectMapper;

    public Mapper(){
        objectMapper= new ObjectMapper();
    }

    //create a json String of a given object
    public String objectToJson(Object object){
        try {
            String json = objectMapper.writeValueAsString(object);
            logObjectMapping(json);
            return json;
        } catch (Exception e) {
            MyLogger.getInstance().error(e);
        }
        return null;
    }

    //Logs Object data into jsontest.txt (C:\)
    private void logObjectMapping(String objectData){
        MyLogger.getInstance().info("Object Json: " + objectData);
    }
}
