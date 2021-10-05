package exercicio1;

public class Televisor {
    private int canal, volume;

    
    
    public int getVolume() { 
        return volume;
    }

    public void setVolume(int volume) { 
        if (0 < volume && volume < 100) {
            this.volume = volume;
        } else {
            System.out.println("Volume fora da faixa permitida, deve ser um valor entre 0 e 100.");
        }
    }

    public void diminuirVolume(){
        this.volume -= 1;
    }
    public void aumentarVolume(){
        this.volume += 1;
    }

    public int getCanal() { 
        return canal;
    }

    public void setCanal(int canal) { 
        
        // Canal indisponível, deve ser um valor entre 0 e 1000.
        if (0 < canal && canal < 1000) {
            this.canal = canal;
        } else {
            System.out.println("Canal indisponível, deve ser um valor entre 0 e 1000.");
        }

    }
    public void diminuirCanal(){
        this.canal -= 1;
    }
    public void aumentarCanal(){
        this.canal += 1;
    }

    public void mostrar(){
        System.out.printf("\nVolume: %d", getVolume());
        // System.out.println(getVolume());
        System.out.printf("\nCanal: %d", getCanal());
        System.out.printf("\n");
        // System.out.println(getCanal());
    }
}
