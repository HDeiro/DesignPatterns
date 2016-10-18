package abstractfactory.family.desktop;

import abstractfactory.interfaces.ITouchHandler;

public class DesktopTouchHandler implements ITouchHandler {

    @Override
    public void touchHandle() {
        System.out.println("DesktopTouchHandler.touchHandle()");
    }
}
