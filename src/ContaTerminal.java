import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por gentileza, insira o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por gentileza, inserir o número da agência: ");
        String numeroAgencia = scanner.next();
        scanner.nextLine();

        System.out.println("Informe seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite seu saldo atual: ");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$" + saldoCliente + " já está disponível para saque.");
    }
}