package command;

public class Receiver {
    
    private boolean done = false;
    private String name;
    
    public Receiver(String name) {
        this.name = name;
    }
    
    public boolean isDone() {
        return done;
    }
    
    public void toggle() {
        if(isDone()) 
            undo();
        else 
            redo();
    }
    
    public void redo() {
        System.out.println("Redo "+this.toString());
        done = true;
    }
    
    public void undo() {
        System.out.println("Undo "+this.toString());
        done = false;
    }

    @Override
    public String toString() {
        return name;
    }
}