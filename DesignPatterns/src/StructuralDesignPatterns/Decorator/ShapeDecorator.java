package StructuralDesignPatterns.Decorator;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
