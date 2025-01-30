import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     int numero;
     String agencia;
     String nomeCliente;
     double saldo;

     System.out.println("Insira suas informações");
     System.out.print("Numero da Agencia: ");
     numero = sc.nextInt();
     sc.nextLine();

     System.out.print("Agencia: ");
     agencia = sc.nextLine();

     System.out.print("Nome Cliente: ");
     nomeCliente = sc.nextLine();

     System.out.print("Saldo: ");
     saldo = sc.nextDouble();
     sc.nextLine();

     System.out.print("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
             ",\nconta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");

     sc.close();
    }
}
