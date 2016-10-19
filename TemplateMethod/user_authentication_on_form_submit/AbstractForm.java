package q2;

public abstract class AbstractForm {
    
    private User user;
    
    protected AbstractForm(User user) {
        this.user = user;
    }
    
    protected abstract boolean validateForm();
        
    public void submit() {
        if(this.user == null) {
            System.err.println("User can't be null");
            return;
        }
        
        if( ! this.user.isAuthorizedToApply()) {
            System.err.println("User isn't authorized to apply forms");
            return;
        }
        
        if( ! this.validateForm())
            return;
        
        System.out.println(new java.util.Date() + " - Validated Form");
        
        System.out.println("Processing form");
    }
}
