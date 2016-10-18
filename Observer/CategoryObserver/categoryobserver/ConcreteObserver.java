package categoryobserver;

import java.util.Observable;

public class ConcreteObserver {
    
    public void update(Observable o, String category, Object o1) {
        System.out.print(category);
         if(o.hasChanged()) 
            System.out.println("\t"+o1);
    }
}