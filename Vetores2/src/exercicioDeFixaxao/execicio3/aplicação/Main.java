/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

package exercicioDeFixaxao.execicio3.aplicação;

import exercicioDeFixaxao.execicio3.entidades.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Quantas pessoal vão ser digitadas? ");
        n = sc.nextInt();
        Pessoa [] pessoa;
        pessoa = new Pessoa[n];

        for(int i = 0; i< pessoa.length;i++){
            sc.nextLine();
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite a idade");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("digite a altura");
            float altura = sc.nextFloat();
            pessoa[i] = new Pessoa(nome,idade,altura);
        }

        float soma=0, media;
        for(int i =0;i< pessoa.length;i++){

            soma+=pessoa[i].getAltura();
        }
        media = soma / pessoa.length;
        System.out.printf("A altura media= %.2f%n",media);

        soma = 0;
        System.out.println("Pessoas com menos de 16 anos");
        for(int i =0; i<pessoa.length;i++){
            if(pessoa[i].getIdade()<16){
                System.out.println(pessoa[i].getNome());
                soma +=1;
            }
        }
        float porcentagem = soma / pessoa.length *100;
        System.out.printf("Estas pessoas represetam: %.2f%n", porcentagem);
    }
}
