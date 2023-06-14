import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nomeCliente = "Barry Allen";
        String tipoDeConta = "Poupança";
        double saldo = 98.90;

        System.out.println("*******************************");
        System.out.println("Nome do cliente: %s".formatted(nomeCliente));
        System.out.println("Tipo de conta: %s".formatted(tipoDeConta));
        System.out.println("Saldo: R$ %.2f".formatted(saldo));
        System.out.println("*******************************");

        int opcao = 0;
        String menu = """
                Olá %s seja bem vindo
                O que deseja fazer?
                
                1- Consutlar Saldo
                2- Transferir
                3- Depositar
                4- Sair""".formatted(nomeCliente);
        Scanner leitor = new Scanner(System.in);
        double transferencia = 0;
        double deposito = 0;

        while (opcao != 4){
            System.out.println(menu);
            System.out.println("**********************");
            opcao = leitor.nextInt();

            if(opcao == 1){
                System.out.println("R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite um valor para transferir: ");
                transferencia = leitor.nextDouble();
                if(saldo > transferencia) {
                    saldo = saldo - transferencia;
                    System.out.println("Seu novo saldo é: R$ %2f".formatted(saldo));
                } else{
                    System.out.println("Saldo insuficiente!!");
                }
            } else if(opcao == 3){
                System.out.println("Digite um valor para deposito: ");
                deposito = leitor.nextDouble();
                saldo = saldo + deposito;
                System.out.println("Seu novo saldo é: R$ %2f".formatted(saldo));
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opcao não encontra disponivel\n" + menu);
            }
        }
    }
}
