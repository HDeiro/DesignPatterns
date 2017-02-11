package decorator.decorations;

import decorator.Decorator;

public class Decorations003 extends Decorator {

    @Override
    public void operate() {
        super.decorated.operate();
        System.out.println("Decorations003");
    }
}