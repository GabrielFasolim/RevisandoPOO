import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Fazer Pedido");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o nome do cliente: ");
                scanner.nextLine();
                String nomeCliente = scanner.nextLine();

                System.out.println("Bem-vindo(a), " + nomeCliente + "!");
                Cardapio.exibirCardapio();

                int item = -1;
                double total = 0.0;
                while (item != 0) {
                    System.out.print("Digite o número do item desejado (ou 0 para finalizar o pedido): ");
                    item = scanner.nextInt();
                    scanner.nextLine();

                    if (item >= 1 && item <= Cardapio.nomesDoCardapio.length) {
                        total += Cardapio.precosDoCardapio[item - 1];
                    }
                }

                double taxaServico = total * 0.10;
                double valorTotal = total + taxaServico;

                System.out.println("\nNota Fiscal:");
                for (int i = 0; i < Cardapio.nomesDoCardapio.length; i++) {
                    if (Cardapio.precosDoCardapio[i] > 0) {
                        System.out.println(Cardapio.nomesDoCardapio[i] + " - R$" + Cardapio.precosDoCardapio[i]);
                    }
                }
                System.out.println("Taxa de Serviço - R$" + taxaServico);
                System.out.println("Total - R$" + valorTotal);

                System.out.print("Digite o valor recebido em dinheiro: ");
                double valorRecebido = scanner.nextDouble();
                double troco = valorRecebido - valorTotal;

                System.out.println("Troco: R$" + troco);

            } else if (opcao == 2) {
                System.out.println("Programa encerrado.");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
