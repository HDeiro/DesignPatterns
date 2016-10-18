package iterator;

public class Aluno {
    
    private String nome;
    private String sexo;
    
    public Aluno(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
 
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }
}