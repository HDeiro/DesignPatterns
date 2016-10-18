package framework.core;

import framework.interfaces.IPlugin;
import framework.interfaces.IPluginController;
import java.util.HashMap;

public class PluginController implements IPluginController {
    
    private HashMap<String, IPlugin> plugins;
    private static PluginController instance = null;
    
    private PluginController() {
        this.plugins = new HashMap<>();
    }
    
    public static PluginController getInstance() {
        if(PluginController.instance == null) 
            PluginController.instance = new PluginController();
        return PluginController.instance;
    }
    
    public Component getDecoration (String key) {
        return (Component)this.plugins.get(key);
    }
    
    @Override
    public boolean add(IPlugin plugin) {
        if( ! this.plugins.containsKey(plugin.toString())) {
            this.plugins.put(plugin.toString(), plugin);
            return true;
        } 
        return false;
    }

    @Override
    public boolean remove(IPlugin plugin) {
        if(this.plugins.containsKey(plugin.toString())) {
            this.plugins.remove(plugin);
            return true;
        } 
        return false;
    }

    @Override
    public void limpar() {
        this.plugins.clear();
    }
    
    public HashMap getListOfPlugins() {
        return this.plugins;
    }
}
