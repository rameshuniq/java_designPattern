package FactoryDesignpattern;

public class IOS implements OS {

    @Override
    public void spec() {
        System.out.println("IOS object created");
    }

}
