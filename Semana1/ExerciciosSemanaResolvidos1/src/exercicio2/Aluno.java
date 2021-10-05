package exercicio2;

public class Aluno {
    private String nome, email;
    private int matricula, telefone;
    
    public Aluno(String nome, String email, int telefone, int matricula) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }
    
    public Aluno() {
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void imprimir(){
        System.out.printf("\nNome: %s | Matrícula: %d | Email: %s | Telefone: %d", nome, matricula, email, telefone);
    }


}

// imprimir
// Aluno
// setEmail
// setMatricula
// setNome
// setTelefone

