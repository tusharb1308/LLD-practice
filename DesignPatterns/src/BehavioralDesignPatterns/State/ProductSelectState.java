package BehavioralDesignPatterns.State;

public class ProductSelectState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Product selected state: Processing payment.");
    }
}
