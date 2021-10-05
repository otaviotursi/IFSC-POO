package exercicio3;

public class Hora {
    int horaD, min, seg;

    public void setHorario(int hora, int min, int seg) {
        this.horaD = hora;
        this.min = min;
        this.seg = seg;
    }

    public void periodo(){
        if (horaD >= 18){
            System.out.println("Noite");
        } else {
            System.out.println("Dia");
        }
    }
    public String imprimir(){
        return horaD + ":" + min +  ":"  + seg;
    }
}
