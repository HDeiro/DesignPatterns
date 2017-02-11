package main;

import composite.Composite;
import decorator.decorations.Decorations001;
import decorator.decorations.Decorations002;
import decorator.decorations.Decorations003;
import leaf.Leaf001;
import leaf.Leaf002;

public class Main {
    
    public static void main(String[] args) {
        //Creating the Decorator chain (without decorated leaf)
        Decorations001 dec001 = new Decorations001();
        Decorations002 dec002 = new Decorations002();
        Decorations003 dec003 = new Decorations003();
        
        dec002.setDecorated(dec001);
        dec003.setDecorated(dec002);
        
        //Creating composite chain
        Composite com001 = new Composite();
        Composite com002 = new Composite();
        Composite com003 = new Composite();
        
        //Creating leafs
        Leaf001 leaf001 = new Leaf001();
        Leaf002 leaf002 = new Leaf002();
        
        //Linking leafs and composite chains
        com001.add(leaf001);
        com001.add(leaf002);
        
        com002.add(com001);
        
        com003.add(com002);
        com003.add(leaf001);
        
        //Linking composite chain with decorator chain
        com003.setDecorator(dec003);
        
        //Executing decomporator
        com003.operate();
    }
}