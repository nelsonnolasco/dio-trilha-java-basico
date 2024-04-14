public class OperadoresIncremento {
    public static void main(String[] args) {
            
            int numero = 5;
            System.out.println();
            
            System.out.println(numero++);// pega a variável e mostra depois incrementa
            System.out.println(numero);
            
            System.out.println(++numero); // pega a variável e já incrementa antes de mostrar
            System.out.println(numero);
            
            System.out.println(numero--);// pega a variável e mostra depois decrementa
            System.out.println(numero);
            
            System.out.println(--numero);// pega a variável e já decrementa antes de mostrar
            System.out.println(numero);

            System.out.println("-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-");
            
            boolean variavel = true;
            System.out.println(!variavel); // inverte o valor da variável
            System.out.println(variavel); // mostra o valor da variável

            // redefinindo a variável com atribuição !variável
            variavel = !variavel;
            System.out.println(variavel); // mostra o valor da variável
    }
}
