package aplicação;

import entidades.Estudantes;
import entidades.Quartos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quartos [] quartos = new Quartos[10];
        quartos[0] = new Quartos(1);
        quartos[1] = new Quartos(2);
        quartos[2] = new Quartos(3);
        quartos[3] = new Quartos(4);
        quartos[4] = new Quartos(5);
        quartos[5] = new Quartos(6);
        quartos[6] = new Quartos(7);
        quartos[7] = new Quartos(8);
        quartos[8] = new Quartos(9);
        quartos[9] = new Quartos(10);
        int n = 1;
        int escolha = 1;
        while (escolha==1){

            System.out.printf("Entre com o nome do %d° estudante: ",n);
            String nome = sc.nextLine();
            System.out.print("Digite o E-mail: ");
            String email = sc.nextLine();
            Estudantes estudantes = new Estudantes(nome, email);

            System.out.print("Digite o numero do quanto que o estudante escolheu: ");
            int numero = sc.nextInt();
            if (quartos[numero-1].getEstudantes()==null) {
                quartos[numero-1].setEstudantes(estudantes);
            }else {
                System.out.println("Quanto está ocupado");
            }
            System.out.println("Deseja inserir mais algum estudante?  Y=1/N=0");
            escolha = sc.nextInt();
            sc.nextLine();
            n+=1;
        }
        System.out.println("****Lista dos quartos****");

        for(int i =0 ; i< quartos.length; i++){
            if(quartos[i].getEstudantes()!=null){
                System.out.println(quartos[i]);
            }
        }

    }
}