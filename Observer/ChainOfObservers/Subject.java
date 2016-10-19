package q1;

import java.util.Observable;

public class Subject extends Observable {
    protected String state;
    protected String name;
    
    protected Subject(String name) {
        this.state = "<state>";
        this.name = name;
    }
    
    public void changeState() {
        this.state = this.state.toUpperCase();
        super.setChanged();
        super.notifyObservers(this.state);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
