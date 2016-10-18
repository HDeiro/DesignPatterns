package observer;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Observer cobs1 = new ConcreteObserver();
        Observer cobs2 = new ConcreteObserver();
        Observer cobs3 = new ConcreteObserver();
        
        ConcreteObservable obsvbl1 = new ConcreteObservable();
        
        obsvbl1.addObserver(cobs1);
        obsvbl1.addObserver(cobs2);
        obsvbl1.addObserver(cobs3);
        
        obsvbl1.operate();
    }
}
