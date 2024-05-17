import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Instanciando a ferramenta Scanner

        // Recebendo os dados do cliente
        System.out.println("Digite o número da conta: ");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeDoCliente = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenomeDoCliente = scanner.next();

        System.out.println("Insira o saldo:");
        double saldo = scanner.nextDouble();

        // Retornando os dados formatados

        System.out.println("Olá " + nomeDoCliente.concat(" ").concat(sobrenomeDoCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numeroDaConta + " e seu saldo: R$" + saldo + " já está disponível para saque.");
    }
}
