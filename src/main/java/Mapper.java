import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.ParameterizedType;

public class Mapper<T> {

    private Class<T> typeOfT;
    private ObjectMapper objectMapper;

    @SuppressWarnings("unchecked")
    public Mapper(){
        objectMapper= new ObjectMapper();
        typeOfT = (Class<T>)
                ((ParameterizedType)getClass()
                        .getGenericSuperclass())
                        .getActualTypeArguments()[0];
    }

    //create java object of a given String
    public T JsonToObject(String json){

        try {
            return objectMapper.readValue(json, typeOfT);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    //create a json String of a given object
    public String ObjectToJson(Object object){
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
