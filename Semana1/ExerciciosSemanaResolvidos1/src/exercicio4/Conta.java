package exercicio4;

public class Conta {
    int conta;
    float saldo;
    String nome;

    public Conta(int conta, String nome){
        this.conta = conta;
        this.nome = nome;
    }

    public void sacar(float valor){
        
        if ((this.saldo - valor) >= 0){
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("O saque se encontra indisponivel");
        }
        
    }
    public void depositar(float valor){
        
        this.saldo += valor;
        System.out.println("Deposito efetuado com sucesso");
        
    }
    public float getSaldo(){
        return saldo;
    }
    public void imprimir(){
        System.out.printf("Titular: %s | Conta: %d | Saldo: %.2f\n", nome, conta, saldo);
    }
}
