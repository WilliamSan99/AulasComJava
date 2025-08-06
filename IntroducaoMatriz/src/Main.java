import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int l, c, posiL, posiC;
        Scanner sc = new Scanner(System.in);
        int [][] matriz;
        System.out.println("Digite a quantidade de linhas da matriz");
        l = sc.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz");
        c= sc.nextInt();

        matriz = new int [l] [c];

        for(int i =0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o numero que quer encontrar na matriz");

        int n = sc.nextInt();

        for(int i = 0; i < matriz.length;i++){
            for (int j =0; j< matriz[i].length;j++){
                if(matriz[i][j]==n){
                    System.out.println("Posição do nomero: "+i+","+j);
                    if(i< matriz.length){
                        System.out.println("Numero a abaixo do "+n+" é "+matriz[i+1][j]);
                    }
                    if(i>0){
                        System.out.println("Numero a acima do "+n+" é "+matriz[i-1][j]);
                    }
                    if(j>0){
                        System.out.println("Numero a esquerda do "+n+" é "+matriz[i][j-1]);
                    }
                    if(j<matriz[i].length){
                        System.out.println("Numero a direita do "+n+" é "+matriz[i][j+1]);
                    }
                }
            }
        }
    }
}