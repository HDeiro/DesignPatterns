package iterator;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao", "M");
        Aluno a2 = new Aluno("Pedro", "M");
        Aluno a3 = new Aluno("Maria", "F");
        
        ArrayList<Aluno> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        
        Iterator i = new Iterator(lista, "nome", ">", "Joao");
        while(i.hasNext()) {
            Aluno a = (Aluno) i.next();
            System.out.println(a.getNome());
        }
    }
}