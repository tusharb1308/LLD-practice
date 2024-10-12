package BehavioralDesignPatterns.Strategy;

public class SubtractStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        System.out.print(num1 + " - " + num2 + ": ");
        return (num1 - num2);
    }
}
