package observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object o1) {
        System.out.println("Updated ==> "+ o1);
    }
}