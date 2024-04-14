public class SmartTv {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novocanal) {
        canal = novocanal;
        System.out.println("Mudando canal para: " + novocanal);
    }

    public void aumentarCanal() {
        canal++;
                
        System.out.println("Mudando canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Mudando canal para: " + canal);

    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }
    
    public void ligar() {
        ligada = true;
        // volume = volume + 1;
    
    }

        public void desligar() {
        ligada = false;
    }

}
