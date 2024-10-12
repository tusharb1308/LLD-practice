package BehavioralDesignPatterns.Observer;

public class BinarySubscriber extends Subscriber{

    BinarySubscriber(Publisher publisher){
        this.publisher = publisher;
//        this.publisher.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary string: " + Integer.toBinaryString(publisher.getState()));
    }
}
