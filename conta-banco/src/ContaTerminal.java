import java.util.Locale;
import java.util.Scanner; //Classe Scanner importada

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
                                             //use.Locale(Locale.US) para não ter divergências regionais
        Scanner ler = new Scanner(System.in).useLocale(Locale.US); 
                //objeto "ler" da classe scanner
       
       
        //definição de variáveis para armazenar os dados que serão inseridos pelo usuário
        int numero = 0; 
        String agencia;
        String nomeCliente;
        double saldo = 0;
        
        //ENTRADA DE DADOS:
        //sistema interagindo com o usuário para que entre com os dados pelo terminal
        System.out.println("BEM VINDO AO NOSSO SISTEMA DE CADASTRO BANCÁRIO!");
        System.out.println("Por favor, insira o numero da agencia:");
        agencia = ler.next();
        System.out.println("Por favor, insira o numero da conta:");
        numero = ler.nextInt();
        ler.nextLine(); //comando adicionado para evitar erros de leitura do scanner
        System.out.println("Por favor, insira nome completo:");
        nomeCliente = ler.nextLine();
        System.out.println("Por favor, insira o valor do saldo para depósito:");
        saldo = ler.nextDouble();
        ler.close(); //o objeto ler da classe Scanner deve ser fechado para evitar futuros problemas no programa
        //poderia ser adicionado o recurso try-with-resources que fecharia automaticamente também
        
        //SAÍDA DE DADOS
        //com uso de conceitos de concatenação 
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numero + " e seu saldo de R$" + saldo +
        " já está disponível para saque.");
        System.out.println("Obrigado por confiar em nossos serviços!");
    }
}
