package composite;

public class SquareLeaf implements Composition {
    @Override
    public void operation() {
        System.out.println("I'm a Square Leaf!");
    }
}
