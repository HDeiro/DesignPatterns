package categoryobserver;

public class Main {
    public static void main(String[] args) {
        ConcreteObserver cobs1 = new ConcreteObserver();
        ConcreteObserver cobs2 = new ConcreteObserver();
        ConcreteObserver cobs3 = new ConcreteObserver();
        
        ConcreteObservable obsvbl1 = new ConcreteObservable();
        
        obsvbl1.addObserver(cobs1, "Notícias");
        obsvbl1.addObserver(cobs2, "Notícias");
        obsvbl1.addObserver(cobs2, "Esporte");
        obsvbl1.addObserver(cobs3, "Cultura");
        
        obsvbl1.operate("Notícias");
    }
}