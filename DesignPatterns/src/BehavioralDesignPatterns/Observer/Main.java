package BehavioralDesignPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        BinarySubscriber binarySubscriber = new BinarySubscriber(publisher);
        OctalSubscriber octalSubscriber = new OctalSubscriber(publisher);
        HexaSubscriber hexaSubscriber = new HexaSubscriber(publisher);

        publisher.attach(binarySubscriber);
        publisher.attach(octalSubscriber);
        publisher.attach(hexaSubscriber);

        publisher.setState(10);
        System.out.println("-------------------------");

        publisher.setState(15);
        System.out.println("-------------------------");

        publisher.detach(octalSubscriber);

        publisher.setState(15);
        System.out.println("-------------------------");
    }
}
