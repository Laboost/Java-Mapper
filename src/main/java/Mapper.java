import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.ParameterizedType;

public class Mapper<T> {

    private Class<T> myType;
    private ObjectMapper objectMapper;

    @SuppressWarnings("unchecked")
    public Mapper(){
        objectMapper= new ObjectMapper();
        myType = (Class<T>)
                ((ParameterizedType)getClass()
                        .getGenericSuperclass())
                        .getActualTypeArguments()[0];
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
        MyLogger.getInstance().info(myType.getSimpleName() +  " Data: " + objectData);
    }
}
