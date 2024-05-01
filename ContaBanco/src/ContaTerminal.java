import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da conta");
        int numConta = t.nextInt();
        t.nextLine();
        System.out.println("Por favor, digite o número da Agencia");
        String numAgencia = t.nextLine();
        System.out.println("Por favor, digite o seu nome");
        String clienteNome = t.nextLine();
        System.out.println("Por favor, digite o valor do deposito inicial");
        double saldo = t.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", clienteNome, numAgencia, numConta, saldo);
        t.close();
    }
}