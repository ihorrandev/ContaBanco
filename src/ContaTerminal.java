import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao nosso sistema bancário!");
        System.out.print("Digite seu nome, por favor: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Agora, digite a agência do banco: ");
        String agenciaBanco = scanner.next();

        System.out.print("Digite o saldo na sua conta, por favor: ");
        double saldoNaConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBanco + ", conta " + numeroConta + "e seu saldo "+ saldoNaConta + " já está disponível para saque");
    }
}
