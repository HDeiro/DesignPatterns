package framework.core;

import framework.interfaces.ICore;
import framework.interfaces.IPluginController;

public class Core implements ICore {
    
    public Core() {
       
    }
    
    @Override
    public IPluginController getPluginController() {
        return PluginController.getInstance();
    }
    
    public void start() {
         new PreparadorDeBolos().setVisible(true);
    }
   
}