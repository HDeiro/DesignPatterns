package decorator;

import interfaces.IComponent;

public abstract class Decorator implements IComponent {

    public IComponent decorated;
    
    protected Decorator() {
    }

    protected Decorator(IComponent decorated) {
        this.decorated = decorated;
    }
    
    public Decorator getDecorated() {
        Decorator first = null;
        
        if(decorated != null && decorated instanceof Decorator)
            first = ((Decorator) decorated).getDecorated();
       
        //if first is null that means this is the first decorator
        return first == null ? this : first;
    }
    
    public void setDecorated(IComponent decorated) {
        this.decorated = decorated;
    }
}
