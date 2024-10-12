package BehavioralDesignPatterns.Observer;

public class HexaSubscriber extends Subscriber {

    HexaSubscriber(Publisher publisher){
        this.publisher = publisher;
//        this.publisher.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(publisher.getState()));
    }
}
