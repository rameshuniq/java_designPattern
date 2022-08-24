package SingletonDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RefelctionProblem {

    public static void main(String[] args) {

        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = null;

        Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);

            try {
                dateUtil2 = (DateUtil) constructor.newInstance();
            } catch (InstantiationException ex) {
                System.err.println(ex);
            } catch (IllegalAccessException ex) {
                System.err.println(ex);
            } catch (IllegalArgumentException ex) {
                System.err.println(ex);
            } catch (InvocationTargetException ex) {
                System.err.println(ex);
            }
        }

        System.out.println(dateUtil1.hashCode());
         System.out.println(dateUtil2.hashCode());
    }

}
