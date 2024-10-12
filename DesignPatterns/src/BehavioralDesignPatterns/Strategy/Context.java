package BehavioralDesignPatterns.Strategy;

public class Context {
    private Strategy strategy;

    Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void doOperation(int num1, int num2){
        System.out.println(strategy.doOperation(num1, num2));
    }
}
