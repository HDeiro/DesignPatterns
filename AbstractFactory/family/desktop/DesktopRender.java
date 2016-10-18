package abstractfactory.family.desktop;

import abstractfactory.interfaces.IRender;

public class DesktopRender implements IRender
{
    @Override
    public void render() {
        System.out.println("DesktopRender.render()");
    } 
}
