public class OperadoresRelacionais {
    public static void main(String[] args) {
        
    String nome1 = "Nelson";
    //String nome2 = "Nelson";
    
    String nome2 = new String("Nelson");
    System.out.println(nome1.equals(nome2));
    
    System.out.println();
    System.out.println(nome1 == nome2);
    
    int numero1 = 5;
    int numero2 = 10;

    boolean simNao = numero1 == numero2;
        System.out.println();

    if (numero1 < numero2) {
        System.out.println("a nossa condição é verdadeira");
    } 
    
    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;
    System.out.println("numeroUm é diferente de numeroDois? " + simNao);

    simNao = numero1 > numero2;
    System.out.println("numeroUm é maior que numeroDois? " + simNao);

    simNao = numero1 < numero2;
    System.out.println("numeroUm é menor que numeroDois? " + simNao);
    }
}
