/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/
package exercicioDeFixaxao;

import java.util.Scanner;

public class Execicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int [] vetor;

        System.out.print("Digite um nomero inteiro: ");
        i = sc.nextInt();
        sc.nextLine();

        vetor = new int[i];

        for(int j = 0; j< vetor.length;j++){
            System.out.println("Digite um numero");
            int h = sc.nextInt();
            sc.nextLine();
            vetor[j] = h;
        }

        for(int j=0; j< vetor.length; j++){
            if(vetor[j]<=0){
                System.out.println(vetor[j]);
            }
        }
    }
}
