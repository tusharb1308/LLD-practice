package BehavioralDesignPatterns.Observer;

public class OctalSubscriber extends Subscriber {

    OctalSubscriber(Publisher publisher){
        this.publisher = publisher;
//        this.publisher.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(publisher.getState()));
    }
}
