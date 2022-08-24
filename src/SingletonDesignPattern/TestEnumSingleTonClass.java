package SingletonDesignPattern;

public class TestEnumSingleTonClass {

    public static void main(String[] args) {
        EnumSingleTonDemo enumSingleTonDemo = EnumSingleTonDemo.INSTANCE;
        System.out.println(enumSingleTonDemo.getName());
        enumSingleTonDemo.setName("UNIQ");
        System.out.println(enumSingleTonDemo.getName());
    }

}
