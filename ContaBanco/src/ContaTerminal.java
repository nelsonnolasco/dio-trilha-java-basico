import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        // Exibir as mensagens para nosos usuários
        // obter pela cloasse Scanner os valores de entrada
        // Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da Agência: ");
        int agencia = scanner.nextInt();

        // Consumir a quebra de linha pendente
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do titular: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por ter aberto uma conta em nosso banco, sua agência é " + agencia +
                        ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
