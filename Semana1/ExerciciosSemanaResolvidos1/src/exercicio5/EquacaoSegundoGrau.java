package exercicio5;

public class EquacaoSegundoGrau {
    int a, b, c;
    int delta;

    public EquacaoSegundoGrau(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int delta() {
        this.delta = (b*b) - 4*a*c;
        return delta;
    }

    public boolean raizesReais(){
        delta();
        if (delta < 0) {
            return false;
        }
        return true;
    }

    public String resolver(){
        double raiz;
        float x1, x2;
        
        if (delta < 0){

            return "sem raizes reais";
        
        } else if (delta == 0){

            raiz = Math.sqrt(delta);
            x2 = (-b - (float)raiz)/(2*a);
            return Float.toString(x2);
        
        } else {

            raiz = Math.sqrt(delta);
            x1 = (-b + (float)raiz)/(2*a);
            x2 = (-b - (float)raiz)/(2*a);
            return x1 + ";" + x2;
        }
    }

    public String imprimir(){
        return "a="+a + ";b="+b + ";c="+c + ";";
    }
}
