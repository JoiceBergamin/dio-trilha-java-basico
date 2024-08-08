import java.util.Locale;
import java.util.Scanner; //Classe Scanner importada

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US); //objeto "ler" da classe scanner

       
        int numero = 0;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        System.out.println("BEM VINDO AO NOSSO SISTEMA DE CADASTRO BANCÁRIO!");
        System.out.println("Por favor, insira o numero da agencia:");
        agencia = ler.next();
        System.out.println("Por favor, insira o numero da conta:");
        numero = ler.nextInt();
        ler.nextLine();
        System.out.println("Por favor, insira nome completo:");
        nomeCliente = ler.nextLine();
        System.out.println("Por favor, insira o valor do saldo para depósito:");
        saldo = ler.nextDouble();


        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numero + " e seu saldo de R$" + saldo +
        " já está disponível para saque.");
        System.out.println("Obrigado por confiar em nossos serviços!");
    }
}
