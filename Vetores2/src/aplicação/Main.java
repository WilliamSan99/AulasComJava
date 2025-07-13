package aplicação;

import entidades.Produto;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        Produto [] vetor = new Produto[n];

        for(int i =0; i< vetor.length; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double proco = sc.nextDouble();
            vetor[i] = new Produto(nome, proco);
        }

        double media = 0;
        for(int i = 0; i< vetor.length;i++){
            media += vetor[i].getPreco();
        }

        media = media / vetor.length;

        System.out.printf("Media dos valores dos produtos: %.2f%n", media);

        sc.close();

    }
}