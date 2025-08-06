package aplicacao;

import entidades.Funcionarios;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean controleDeRepetição = true;
        int n, id=0;
        List<Funcionarios> listaFuncionarios = new ArrayList<>();
        System.out.println("Quantos funcionarios vão fazer entrada? ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<n; i++){// Cadastro dos funcionarios
            do {// do while para repetir se o usuario ja foi cadastrado
                System.out.println("-------------------------------");
                System.out.println("Entre com o ID do "+(i+1)+"° funcionario");
                int auxId = sc.nextInt();
                sc.nextLine();
                Funcionarios buscaID = listaFuncionarios.stream().filter(x -> x.getId() == auxId).findFirst().orElse(null);//Função onde retorna o primeiro elemento da lista que tenha o ID digitado, se não tiver retorna nullo
                if(buscaID == null){
                    id = auxId;

                    controleDeRepetição = false;
                }else{
                    System.out.println("ID ja cadastrado");
                    System.out.println("-------------------------------");
                    controleDeRepetição = true;
                }
            }while (controleDeRepetição);
            System.out.println("Entre com o nome do funcionario");
            String nome = sc.nextLine();
            System.out.println("Entre com o salario do funcionario");
            double salario = sc.nextDouble();
            Funcionarios funcionario = new Funcionarios(id, nome, salario);

            listaFuncionarios.add(funcionario);
        }
        System.out.println("-------------------------------");
        for(Funcionarios x: listaFuncionarios){
            System.out.println(x);
        }
        System.out.println("-------------------------------");
        do{
            System.out.println("Digite o ID do funcionaria a ganhar aumento");
            int auxId = sc.nextInt();
            sc.nextLine();
            Funcionarios buscaId = listaFuncionarios.stream().filter(x -> x.getId() == auxId).findFirst().orElse(null);
            if(buscaId == null){
                System.out.println("ID não cadastrado");
                controleDeRepetição = true;
            }else {
                System.out.println("Entre com a porcentagem de aumento no salarios");
                double porcentagem = sc.nextDouble();
                sc.nextLine();
                buscaId.AumentoSalario(porcentagem);
                controleDeRepetição = false;
            }
        }while (controleDeRepetição);

        for (Funcionarios x: listaFuncionarios){
            System.out.println(x);
        }
        sc.close();
    }


}
