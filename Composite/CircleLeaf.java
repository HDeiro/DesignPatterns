package composite;

public class CircleLeaf implements Composition {
    @Override
    public void operation() {
        System.out.println("I'm a Circle Leaf!");
    }
}
