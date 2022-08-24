package SingleDemo;

public class TestSingleTonClassExample {

    public static void main(String[] args) {

        DateUtilClass dateUtilClass1 = DateUtilClass.getInstance();
        DateUtilClass dateUtilClass2 = DateUtilClass.getInstance();

      //  DateUtilClass obj=new DateUtilClass();
                
        
        
        System.out.println(dateUtilClass1 == dateUtilClass2);
    }

}
