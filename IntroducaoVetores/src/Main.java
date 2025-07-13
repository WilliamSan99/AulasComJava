import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double media=0.0;
        double [] vetor = new double[i];

        for(int j = 0;j<i; j++){
            vetor[j] = sc.nextDouble();
        }
        for(int j = 0; j<i; j++){
            media = media + vetor[j];
        }
        media = media/i;

        System.out.println(media);
    }
}