public class CondicionalCompostaCaixaEletronico {
    
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 20.0;

        if (valorSolicitado < saldo) {
            System.out.println();// por causa de clareza no terminal
            saldo = saldo - valorSolicitado;
        } 
        else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);
        


            

        
    }
}

