package chocolategranulado;

import framework.core.Component;
import framework.interfaces.ICore;
import framework.interfaces.IPlugin;

public class ChocolateGranulado extends Component implements IPlugin {

    private Component previousComponent;
    
    @Override
    public boolean initialize(ICore core) {
        System.out.println("Inicializou chocolate granulado");
        return true;
    }    

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Preparando Chocolate Granulado");
    }
    
    @Override
    public String toString() {
        return "ChocolateGranulado";
    }
}