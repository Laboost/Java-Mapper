import org.apache.log4j.Logger;

public class MyLogger {

    //singleton
    private MyLogger() {}
    private static final Logger instance = Logger.getLogger("Logger");
    public static Logger getInstance() {
        return instance;
    }
}
