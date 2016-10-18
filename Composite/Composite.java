package composite;

import java.util.ArrayList;

public class Composite implements Composition {
    private ArrayList<Composition> compositions;
    
    public Composite() {
        this.compositions = new ArrayList<>();
    }
    
    @Override
    public void operation() {
        for(Composition composition : compositions)
            composition.operation();
    }

    public void add(Composition c) {
        if(!compositions.contains(c))
            compositions.add(c);
    }
    
    public void remove(Composition c) {
        if(compositions.contains(c))
            compositions.remove(c);
    }
    
    public Composition getChild(int i) {
        if(i < compositions.size())
            return compositions.get(i);
        return null;
    }
}