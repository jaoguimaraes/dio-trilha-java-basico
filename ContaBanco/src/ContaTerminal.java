import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) { 
        
        //Criando o objeto scanner
        try (
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o seu nome: ");
            String nome = scanner.next();

            System.out.println("Por favor, digite o número da sua Agencia: ");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da sua Conta: ");
            int conta = scanner.nextInt();

            System.out.println("Por favor, digite o código verificador: ");
            int verificador = scanner.nextInt();

            System.out.println("Por favor, digite o seu Saldo: ");
            double saldo = scanner.nextDouble();
   
            //Imprimindo os dados obtidos pelo usuário.
            System.out.println("Ola " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia 
            + ", " + "conta " + conta + "-" + verificador + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}