package q2;

public class Form extends AbstractForm {
    
    private String name;
    private int age;
    
    public Form(User user, String name, int age) {
        super(user);
        
        this.age = age;
        this.name = name;
    }

    @Override
    protected boolean validateForm() {
        if(this.name == null) {
            System.err.println("Name is required");
            return false;
        }
        
        if(this.name.isEmpty()) {
            System.err.println("Name is required");
            return false;
        }
        
        if(this.age <= 0) {
            System.err.println("Age should be greater than zero");
            return false;
        }
        
        return true;
    }
}