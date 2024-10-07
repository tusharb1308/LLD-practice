package CreationalDesignPatterns.AbstractFactory;

import CreationalDesignPatterns.AbstractFactory.Shape;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = FactoryProducer.getFactory("ROUNDED");
        Shape shape1 = abstractFactory1.getShape("SQUARE");
        Shape shape2 = abstractFactory1.getShape("RECTANGLE");
        AbstractFactory abstractFactory2 = FactoryProducer.getFactory("NOT_ROUNDED");
        Shape shape3 = abstractFactory2.getShape("SQUARE");
        Shape shape4 = abstractFactory2.getShape("RECTANGLE");

        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
    }
}
