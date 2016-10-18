package templatemethod;

public class Main {
    
    public static void main(String[] args) {
        AbstractClass abs1 = new ConcreteClass01();
        AbstractClass abs2 = new ConcreteClass02();
        
        abs1.execute();
        abs2.execute();
    }
}
