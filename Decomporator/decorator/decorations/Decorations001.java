package decorator.decorations;

import decorator.Decorator;

public class Decorations001 extends Decorator {

    @Override
    public void operate() {
        super.decorated.operate();
        System.out.println("Decorations001");
    }
}