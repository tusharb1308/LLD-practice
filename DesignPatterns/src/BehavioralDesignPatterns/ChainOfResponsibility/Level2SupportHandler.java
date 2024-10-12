package BehavioralDesignPatterns.ChainOfResponsibility;

public class Level2SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.INTERMEDIATE){
            System.out.println("Level 2 Support handled the request");
        } else if(nextHandler != null){
            System.out.println("Level 2 transferring the request to Level 3");
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
