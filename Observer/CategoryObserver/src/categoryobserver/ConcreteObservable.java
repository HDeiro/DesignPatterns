package categoryobserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;

public class ConcreteObservable extends Observable {
    
    private HashMap<String, ArrayList<ConcreteObserver>> observers;
    
    public ConcreteObservable() {
        observers = new HashMap<>();
    }

    public void operate(String... categories) {
        System.out.println("ConcreteObservable");
        
        super.setChanged();
        this.notifyConcreteObservers(categories);
    }
    
    public void addObserver(ConcreteObserver o, String category) {
        if(observers.get(category) == null)
            observers.put(category, new ArrayList<>());
        
        observers.get(category).add(o);
    }
    
    public void notifyConcreteObservers(String... categories) {
        for(String category : categories) {
            List<ConcreteObserver> list = observers.get(category);
            
            for(ConcreteObserver observer : list)
                observer.update(this, category, "UpdatedValue");
        }
    }
}