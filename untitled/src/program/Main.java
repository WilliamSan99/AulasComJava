package program;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Digite a quantidade de funcionarios");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<n; i++){
            System.out.println("Dados do funcionario "+(i+1)+"#");
            System.out.println("O funcionario e terceirizado?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Digite o nome do funcionario");
            String name = sc.nextLine();
            System.out.println("Horas trabalhadas");
            int hours = sc.nextInt();
            System.out.println("Valor das horas trabalhadas");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.println("Digite o valor adicional");
                double additionalChager = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour , additionalChager);
                list.add(emp);
            }else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println("\n\n------Payments------");
        for (Employee e: list){
            System.out.println(e);
        }
    }
}