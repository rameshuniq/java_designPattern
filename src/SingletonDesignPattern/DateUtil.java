package SingletonDesignPattern;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    private  volatile static DateUtil instance;

   //  private static DateUtil instance = new DateUtil();
    
//    static {
//        instance = new DateUtil();
//    }
    private DateUtil() {

    }

    public static DateUtil getInstance() {
        if (instance == null) {
            instance = new DateUtil();
        }
        return instance;
    }

    public static DateUtil getInstance1() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }
    public Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone(); 
        throw new CloneNotSupportedException();
    }

}
