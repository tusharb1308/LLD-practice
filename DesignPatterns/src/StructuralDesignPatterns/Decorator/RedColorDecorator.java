package StructuralDesignPatterns.Decorator;

public class RedColorDecorator extends ShapeDecorator {
    RedColorDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
//        super.draw();
        decoratedShape.draw();
        System.out.println("Added Red Color");
    }
}
