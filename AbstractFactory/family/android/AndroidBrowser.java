package abstractfactory.family.android;

import abstractfactory.interfaces.IBrowserFactory;
import abstractfactory.interfaces.IRender;
import abstractfactory.interfaces.ITouchHandler;

public class AndroidBrowser implements IBrowserFactory {

    @Override
    public IRender createRender() {
        return new AndroidRender();
    }

    @Override
    public ITouchHandler createTouchHandler() {
        return new AndroidTouchHandler();
    } 
}