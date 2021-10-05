package exercicio6;

public class Calculadora {
    public boolean ehPar(int numero){
        if (numero % 2 == 0){
            return true;
        } else {
            return false;
        }

    }
    public boolean ehImpar(int numero){
        if (numero % 2 == 1){
            return true;
        } else {
            return false;
        }

    }
    public boolean ehPrimo(int numero){
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;

    }
    public int fatorial(int numero){
        int i, numero1=numero;
        for (i=1;i<numero;i++){
            numero1=numero1*i;
        }
        return numero1;
    }
    public int somar(int numero1, int numero2){
        return numero1 + numero2;
    }
    public int subtrair(int numero1, int numero2){
        return numero1 - numero2;
    }
    public int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }
    public int dividir(int numero1, int numero2){
        return numero1 / numero2;
    }
}
