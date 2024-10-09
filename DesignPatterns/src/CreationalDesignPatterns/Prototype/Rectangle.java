package CreationalDesignPatterns.Prototype;

public class Rectangle extends Shape{

    Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }
}
