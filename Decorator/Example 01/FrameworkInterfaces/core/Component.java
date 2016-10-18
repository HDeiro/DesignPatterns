package framework.core;

public abstract class Component {
    private Component previousComponent;
    
    public void preparar() {
        previousComponent.preparar();
    }
    
    public void setPreviousComponent(Component previousComponent) {
        this.previousComponent = previousComponent;
    }
}
