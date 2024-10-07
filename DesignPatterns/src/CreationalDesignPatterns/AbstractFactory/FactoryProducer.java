package CreationalDesignPatterns.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        return switch (factoryType) {
            case "ROUNDED" -> new RoundedShapeFactory();
            case "NOT_ROUNDED" -> new ShapeFactory();
            default -> null;
        };
    }
}
