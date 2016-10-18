package abstractfactory.interfaces;

public interface IBrowserFactory {
    
    public IRender createRender();
    public ITouchHandler createTouchHandler();
    
}
