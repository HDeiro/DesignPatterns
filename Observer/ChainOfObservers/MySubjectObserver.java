package q1;

import java.util.Observable;
import java.util.Observer;

public class MySubjectObserver extends Subject implements Observer{

    public MySubjectObserver(String name) {
        super(name);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o + " changed his state to " + arg + ", i'll change my state to " + arg);
        this.changeState();
    }
}
