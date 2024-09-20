import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner  scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira o numero da agencia.");
        String agencia =  scanner.next();

        System.out.println("Por favor, digite seu nome.");
        String nome = scanner.next();

        int numero = 1021;
        double saldo = 237.48;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
