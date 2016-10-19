package templatemethod;

public class ConcreteClass01 extends AbstractClass {

    @Override
    protected void templateMethod01() {
        System.out.println("Executing template method 1 through ConcreteClass01");
    }

    @Override
    protected void templateMethod02() {
       System.out.println("Executing template method 2 through ConcreteClass01");
    }
    
}
