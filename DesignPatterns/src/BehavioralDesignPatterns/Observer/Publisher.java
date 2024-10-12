package BehavioralDesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<Subscriber> subscribers = new ArrayList<Subscriber>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllSubscribersOrObservers();
    }

    public void attach(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void detach(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifyAllSubscribersOrObservers(){
        for (Subscriber subscriber: subscribers){
            subscriber.update();
        }
    }
}
