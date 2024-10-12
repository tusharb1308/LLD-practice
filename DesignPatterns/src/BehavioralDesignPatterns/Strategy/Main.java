package BehavioralDesignPatterns.Strategy;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(new AddStrategy());
        context.doOperation(10, 15);

        context = new Context(new SubtractStrategy());
        context.doOperation(20, 10);

        context = new Context(new MultiplyStrategy());
        context.doOperation(10, 15);
        
    }
}
