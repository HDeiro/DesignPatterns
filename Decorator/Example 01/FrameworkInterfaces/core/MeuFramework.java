package framework.core;

import framework.interfaces.IPlugin;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class MeuFramework {
    
    private static Core core;

    public static void main(String[] args) throws Exception {
        core = new Core();
        if(loadPlugins())
            core.start();
    }

    public static boolean loadPlugins() throws Exception {
        File currentDir = new File("./plugins");
        String[] plugins = currentDir.list();
        PluginController pluginController = PluginController.getInstance();
        int i;
        URL[] jars = new URL[plugins.length];
        for (i = 0; i < plugins.length; i++) {
            jars[i] = (new File("./plugins/" + plugins[i])).toURL();
        }
        URLClassLoader ulc = new URLClassLoader(jars);
        for (i = 0; i < plugins.length; i++) {
            String pluginName = plugins[i].split("\\.")[0];
            IPlugin plugin = (IPlugin) Class.forName(pluginName.toLowerCase() +"."+ pluginName, true, ulc).newInstance();
            if (plugin != null) {
                plugin.initialize(core);
                pluginController.add(plugin);
            }
        }
        return true;
    }
}
