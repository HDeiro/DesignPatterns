package q2;

class User {
    private boolean canApply;
    
    public User(boolean canApply) {
        this.canApply = canApply;
    }
    
    public boolean isAuthorizedToApply() {
        return this.canApply;
    }    
}
