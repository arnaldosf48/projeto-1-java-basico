import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Numero de conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite sua Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + ", Obrigado por criar uma conta em nosso banco " + 
        " sua agencia e: " + agencia + ", conta: " + numero + " e seu saldo e: " + saldo + ".");





        //Exibir as mensagnes para o nosso usuario

        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a menssagem final (da conta criada)

            scanner.close();
    }
}
