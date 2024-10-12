package BehavioralDesignPatterns.State;

public class VendingMachineContext {
    private VendingMachineState vendingMachineState;

    public void setState(VendingMachineState vendingMachineState){
        this.vendingMachineState = vendingMachineState;
    }

    public void request(){
        this.vendingMachineState.handleRequest();
    }
}
