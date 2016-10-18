package abstractfactory.family.android;

import abstractfactory.interfaces.IRender;

public class AndroidRender implements IRender
{
    @Override
    public void render() {
        System.out.println("AndroidRender.render()");
    } 
}
