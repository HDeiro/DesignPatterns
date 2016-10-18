package command;

import java.util.List;

public class ConcreteCommand implements Command {
    
    private List<Receiver> receivers;
    
    public ConcreteCommand(List<Receiver> receivers) {
        this.receivers = receivers;
    }
    
    @Override
    public void execute() {
        for(Receiver receiver : receivers)
            receiver.toggle();
    }
}
