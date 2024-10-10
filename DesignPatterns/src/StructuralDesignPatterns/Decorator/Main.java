package StructuralDesignPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        circle1.draw();
        System.out.println("===================");

        Shape circle2 = new RedColorDecorator(new Circle());
        circle2.draw();
        System.out.println("===================");

        Shape circle3 = new BlackBorderDecorator(new RedColorDecorator(new Circle()));
        circle3.draw();
    }
}
