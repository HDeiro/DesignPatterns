package abstractfactory.family.desktop;
 
import abstractfactory.interfaces.IBrowserFactory;
import abstractfactory.interfaces.IRender;
import abstractfactory.interfaces.ITouchHandler;

public class DesktopBrowser implements IBrowserFactory {

    @Override
    public IRender createRender() {
        return new DesktopRender();
    }

    @Override
    public ITouchHandler createTouchHandler() {
        return new DesktopTouchHandler();
    } 
}