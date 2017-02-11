package composite;

import decorator.Decorator;
import interfaces.IComponent;
import java.util.ArrayList;

public class Composite implements IComponent {

    private ArrayList<IComponent> components = new ArrayList<>();
    private Decorator decorator;

    public void add(IComponent component) {
        if ( ! (component instanceof Decorator))
            components.add(component);
    }
    
    public void remove(IComponent component) {
        if ( ! (component instanceof Decorator))
            components.remove(component);        
    }
    
    public Decorator getDecorator() {
        return this.decorator;
    }
    
    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }
    
    @Override
    public void operate() {
        for(IComponent component : components) {
            if( !(component instanceof Composite)) {
                this.decorator.getDecorated().setDecorated(component);  //Set decorated to decorator chain
                this.decorator.operate();                               //Operate decorator chain
                this.decorator.getDecorated().setDecorated(null);       //Reset decorated leaf
            } else {
                ((Composite) component).setDecorator(this.decorator);
                component.operate();
            }
        }
    }
}