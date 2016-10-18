package abstractfactory.family.android;

import abstractfactory.interfaces.ITouchHandler;

public class AndroidTouchHandler implements ITouchHandler {

    @Override
    public void touchHandle() {
        System.out.println("AndroidTouchHandler.touchHandle()");
    }
}
