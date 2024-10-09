package CreationalDesignPatterns.Prototype;

public class Circle extends Shape {

    Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Draw Circle");
    }
}
