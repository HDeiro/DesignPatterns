package templatemethod;

public abstract class AbstractClass {
    
    protected abstract void templateMethod01();
    protected abstract void templateMethod02();
    
    public final void execute() {
        this.templateMethod01();
        System.out.println("Code has been executed through Abstract Class");
        this.templateMethod02();
    }
}
