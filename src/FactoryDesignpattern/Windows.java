package FactoryDesignpattern;

public class Windows implements OS {

    @Override
    public void spec() {
        System.out.println("Windows object created");
    }

}
