import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       //TODO: Conhecer e importar a class Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       // Exibir as mensagens para nosso usuario
      //Obter pela sanner os valores digirados no terminal 
      System.out.println("Por favor, digite o seu nome: ");
      String nome = scanner.next();

      System.out.println("Por favor, digite o número da conta: ");
      int numero = scanner.nextInt();

      System.out.println("Por favor, digite o número da Agência: ");
      String agencia = scanner.next();

      System.out.println("Por favor, digite o seu saldo! ");
      Double saldo = scanner.nextDouble();

       // Exibir a mensagem conta crianda
       System.out.println("===============================================");
       System.out.println("                 NIL's Bank                     ");
       System.out.println("===============================================");
       System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de " + saldo + " que já está disponível para saque.");

    }
}
