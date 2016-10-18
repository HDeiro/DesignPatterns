package framework.core;

import framework.interfaces.ICore;
import framework.interfaces.IPlugin;

public class Bolo extends Component implements IPlugin {

    @Override
    public boolean initialize(ICore core) {
        System.out.println("Inicializou Bolo");
        return true;
    }    

    @Override
    public void preparar() {
        System.out.println("Preparando Bolo");
    }

    @Override
    public String toString() {
        return "Bolo";
    }
}