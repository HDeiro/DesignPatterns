package templatemethod;

public class ConcreteClass02 extends AbstractClass {

    @Override
    protected void templateMethod01() {
        System.out.println("Executing template method 1 through ConcreteClass02");
    }

    @Override
    protected void templateMethod02() {
       System.out.println("Executing template method 2 through ConcreteClass02");
    }
    
}
