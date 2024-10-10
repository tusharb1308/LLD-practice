package StructuralDesignPatterns.Decorator;

public class BlackBorderDecorator extends ShapeDecorator {
    BlackBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
//        super.draw();
        decoratedShape.draw();
        System.out.println("Added Black Border");
    }
}
