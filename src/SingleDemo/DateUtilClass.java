package SingleDemo;

public class DateUtilClass {

    private static DateUtilClass instance;
    
    private DateUtilClass() {

    }

    public static DateUtilClass getInstance() {
        
       // synchronized(DateUtilClass.class){
        if (instance == null) {
            instance = new DateUtilClass();
        }
       // }
        return instance;
    }
}
