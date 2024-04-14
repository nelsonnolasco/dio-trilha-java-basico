public class OperadorTernário {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero > 5 ? " Maior que 5" : " Menor ou igual a 5");

        System.out.println("------------------------------");

        int a = 6;
        int b = 6;
        //String resultado = "";
    /*  if (a==b) 
            resultado = "Iguais ou verdadeiro";
        else
            resultado = "Diferentes ou falso";
        System.out.println(resultado); */
        
    
    // Uso do operador ternário
    // O operador ternário é uma forma simplificada de fazer um if-else
    // Sintaxe:
    // variável = condição ? valor_se_verdadeiro : valor_se_falso;
    // Exemplo:
    // int numero = 5;
    // System.out.println(numero > 5 ? " Maior que 5" : " Menor ou igual a
    // 5");
    // O operador ternário é composto por três partes:
    // 1. A condição que será avaliada
    // 2. O valor que será atribuído à variável se a condição for verdadeira
    // 3. O valor que será atribuído à variável se a condição for falsa 
    // O operador ternário é uma forma simplificada de fazer um if-else
    // Sintaxe:
    // variável = condição ? valor_se_verdadeiro : valor_se_falso;

    // Exemplo:
    
        String resultado = a ==b ? "Igual ou verdadeiro" : "Diferente ou falso";
        System.out.println(resultado);

    }


}
       