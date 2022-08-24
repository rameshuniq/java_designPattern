package FactoryDesignpattern;

public class FactoryDesignPattern {

    public static void main(String[] args) {
        OperatingSystemFactoryPattern osfp = new OperatingSystemFactoryPattern();
        // OS obj= new Andriod();
        OS obj = osfp.getInstance("open");
        obj.spec();
    }

}
