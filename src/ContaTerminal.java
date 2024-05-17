import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Instanciando a ferramenta Scanner

        // Declarando as variáveis
        int numeroDaConta;
        String agencia;
        String nomeDoCliente;
        double saldo;

        // Recebendo os dados do cliente
        System.out.println("Digite o número da conta: ");
        numeroDaConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        nomeDoCliente = scanner.next();

        System.out.println("Insira o saldo:");
        saldo = scanner.nextDouble();

        // Retornando os dados formatados

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numeroDaConta + " e seu saldo: R$" + saldo + " já está disponível para saque.");
    }
}
