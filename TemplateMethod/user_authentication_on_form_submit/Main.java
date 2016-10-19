package q2;

public class Main {
    
    public static void main(String[] args) {
        User user1 = new User(true);
        User user2 = new User(false);
        
        //Will work
        AbstractForm form = new Form(user1, "Pipoca123", 12);
        form.submit();
        
        //Won't work (Validation Error)
        //form = new Form(user1, "", 0);
        //form.submit();
        
        //Won't work (Authorization error)
        //form = new Form(user2, "Pipoca123", 12);
        //form.submit();
    }
}
