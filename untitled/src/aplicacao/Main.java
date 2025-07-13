package aplicacao;


import entidades.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroConta = 1, escolha;
        String nomeTitular;
        float valorParaOperacoes;
        Conta contaFisica;

        Scanner sc = new Scanner(System.in);
        System.out.println("****** Cadastro de conta bancaria ********");
        System.out.println("Digite seu nome: ");
        nomeTitular = sc.nextLine();
        System.out.println("Deseja já realizar um deposito? Y = 1 / N = 0");
        escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.print("Digite o valor do deposito: ");
            valorParaOperacoes = sc.nextFloat();
            sc.nextLine();
            contaFisica = new Conta(numeroConta,nomeTitular, valorParaOperacoes);
        }else {
            contaFisica = new Conta(numeroConta,nomeTitular);
        }


        System.out.println(contaFisica);
        while (true){
            System.out.println("\nQual operação deseja realizar\n1)- Deposito\n2)- Saque\n3)- Alteração do nome");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.print("Digite o valor do deposito: ");
                    valorParaOperacoes = sc.nextFloat();
                    contaFisica.Deposito(valorParaOperacoes);
                    contaFisica.toString();
                    break;
                case 2:
                    System.out.println("Digite o valor de saque");
                    valorParaOperacoes = sc.nextFloat();
                    contaFisica.Saque(valorParaOperacoes);
                    contaFisica.toString();
                    break;
                case 3:
                    System.out.println("Digite o novo nome:");
                    nomeTitular = sc.nextLine();
                    contaFisica.setNomeTitular(nomeTitular);
                    contaFisica.toString();

                    break;
                default:
                    System.out.println("Opção in valida");
            }
        }



    }
}
