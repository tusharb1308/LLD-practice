package BehavioralDesignPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler supportLevel1Handler = new Level1SupportHandler();
        SupportHandler supportLevel2Handler = new Level2SupportHandler();
        SupportHandler supportLevel3Handler = new Level3SupportHandler();

        supportLevel1Handler.setNextHandler(supportLevel2Handler);
        supportLevel2Handler.setNextHandler(supportLevel3Handler);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);
        Request request4 = new Request(Priority.MISCLLANEOUS);

        supportLevel1Handler.handleRequest(request1);
        System.out.println("---------------------------");

        supportLevel1Handler.handleRequest(request2);
        System.out.println("---------------------------");

        supportLevel1Handler.handleRequest(request3);
        System.out.println("---------------------------");

        supportLevel1Handler.handleRequest(request4);
    }
}
