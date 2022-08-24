package SingletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingleTonClass {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        //  DateUtil instance1=new DateUtil();
        DateUtil dateUtil1 = DateUtil.getInstance();

        // DateUtil dateUtil2 = DateUtil.getInstance();
        DateUtil dateUtil2 = null;

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("d://DateUtil.ser"));

        oos.writeObject(dateUtil1);

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("d://DateUtil.ser"));

        dateUtil2 = (DateUtil) ois.readObject();
        
        oos.close();
        ois.close();

        System.out.println(dateUtil1 == dateUtil2);
    }

}
