/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor*/
package exercicioDeFixaxao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double [] vetor;
        System.out.println("Quantos numero vc vai digitar? ");
        n = sc.nextInt();

        vetor = new double[n];

        for(int i=0; i< vetor.length;i ++){
            sc.nextLine();
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
        double soma=0, media;
        System.out.print("\nVALORES: ");
        for(int i =0; i< vetor.length;i++){
            soma+= vetor[i];
            System.out.print("  "+vetor[i]);
        }
        media = soma / vetor.length;
        System.out.printf("\n\nSoma = %.2f%n\nMedia %.2f%n%%", soma, media);

    }
}
