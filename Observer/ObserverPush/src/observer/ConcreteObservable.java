package observer;

import java.util.Observable;

public class ConcreteObservable extends Observable {
    
    public void operate() {
        System.out.println("ConcreteObservable ("+super.countObservers()+" observers)");
        
        super.setChanged();
        super.notifyObservers("mudo push");
    }
}