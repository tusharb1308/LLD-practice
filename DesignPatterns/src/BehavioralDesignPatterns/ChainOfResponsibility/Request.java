package BehavioralDesignPatterns.ChainOfResponsibility;

public class Request {
    private final Priority priority;

    Request(Priority priority){
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}
