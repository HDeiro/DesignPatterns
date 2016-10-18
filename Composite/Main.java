package composite;

public class Main {
    public static void main(String[] args) {
        Composite c1 = new Composite();
        Composite c2 = new Composite();
        
        c1.add(new SquareLeaf());
        c1.add(c2);
        
        c2.add(new CircleLeaf());
        c2.add(new StarLeaf());
        
        c1.operation();
    }
}
