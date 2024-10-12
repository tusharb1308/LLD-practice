package BehavioralDesignPatterns.State;

public class Main {
    public static void main(String[] args) {
        VendingMachineContext vendingMachine = new VendingMachineContext();

        // Set initial state
        vendingMachine.setState(new ReadyState());
        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new ProductSelectState());
        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new PaymentPendingState());
        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new OutOfStockState());
        // Request state change
        vendingMachine.request();
    }
}
