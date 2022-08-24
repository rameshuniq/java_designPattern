package FactoryDesignpattern;

public class OperatingSystemFactoryPattern {

    public OS getInstance(String value) {

        if (value.equals("open")) {
            return new Andriod();
        } else if (value.equals("closed")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }

}
