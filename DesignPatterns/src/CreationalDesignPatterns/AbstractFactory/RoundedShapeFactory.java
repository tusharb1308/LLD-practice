package CreationalDesignPatterns.AbstractFactory;

public class RoundedShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "RECTANGLE" -> new RoundedRectangle();
            case "SQUARE" -> new RoundedSquare();
            default -> null;
        };
    }
}
