package abstractfactory;

import abstractfactory.interfaces.IBrowserFactory;
import abstractfactory.family.android.AndroidBrowser;
import abstractfactory.family.desktop.DesktopBrowser;

public class Main {
    
    public void init(IBrowserFactory ibf) {
        ibf.createRender().render();
        ibf.createTouchHandler().touchHandle();
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        
        main.init(new AndroidBrowser());
        main.init(new DesktopBrowser());     
    }
}