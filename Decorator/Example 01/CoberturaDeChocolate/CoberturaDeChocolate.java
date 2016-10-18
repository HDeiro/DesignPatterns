package coberturadechocolate;

import framework.core.Component;
import framework.interfaces.ICore;
import framework.interfaces.IPlugin;

public class CoberturaDeChocolate extends Component implements IPlugin {

    @Override
    public boolean initialize(ICore core) {
        System.out.println("Inicializou cobertura de chocolate");
        return true;
    }    

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Preparando Cobertura de Chocolate");
    }

    @Override
    public String toString() {
        return "CoberturaDeChocolate";
    }
}