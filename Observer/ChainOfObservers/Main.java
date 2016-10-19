package q1;

import java.util.Observer;

public class Main {

    public static void main(String[] args) {
        MySubject s1 = new MySubject("S1");
        Object so1 = new MySubjectObserver("SO1");
        Object so2 = new MySubjectObserver("SO2");
        s1.addObserver((Observer) so1);
        ((Subject) so1).addObserver((Observer) so2);        
        s1.changeState();
    }
}
