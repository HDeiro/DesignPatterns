package command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        Receiver receiver1 = new Receiver("Receiver 01");
        Receiver receiver2 = new Receiver("Receiver 02");
        Receiver receiver3 = new Receiver("Receiver 03");
        
        List<Receiver> receivers = new ArrayList<>();
        
        receivers.add(receiver1); //redo
        receivers.add(receiver2); //redo
        receivers.add(receiver3); //redo
        receivers.add(receiver3); //undo
        
        Invoker invoker = new Invoker();
        Command command = new ConcreteCommand(receivers);
        invoker.execute(command);
    }
}