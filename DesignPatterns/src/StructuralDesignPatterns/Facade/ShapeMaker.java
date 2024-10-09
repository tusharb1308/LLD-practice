package StructuralDesignPatterns.Facade;

public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

}
