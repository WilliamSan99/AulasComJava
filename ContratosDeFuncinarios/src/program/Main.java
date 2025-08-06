package program;



import entidades.Department;
import entidades.HourContract;
import entidades.Woker;
import entidades.enums.WokerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Entre com o nome do Departamento");
        String departmenteName = sc.nextLine();
        System.out.println("Digite o nome do trabalhador");
        String workerName = sc.nextLine();
        System.out.println("Entre com o nivel do trabalhador");
        String workerLevel = sc.nextLine();
        System.out.println("Digite o salario do funcionario");
        double workerSalary = sc.nextDouble();
        sc.nextLine();
        Woker worker = new Woker(workerName, WokerLevel.valueOf(workerLevel), workerSalary, new Department(departmenteName));

        System.out.println("Quantos contratos tem esse trabalhador");

        int n = sc.nextInt();
        sc.nextLine();

        for(int i =0; i<n; i++){
            System.out.println("Data do "+(i+1)+"° contrato: ");
            Date contractDate = sdf.parse((sc.next()));
            System.out.println("Valor do contrato por hora: ");
            double valueHour = sc.nextDouble();
            sc.nextLine();
            System.out.println("Duração do contrado em horas");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate,valueHour, hours);
            worker.addContract(contract);

        }

        System.out.println("Entre com mes e ano de renda (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt((monthAndYear.substring(3)));

        System.out.println("Nome : "+worker.getNome());
        System.out.println("Departamento :"+worker.getDepartment().getName());
        System.out.println("Renda de "+monthAndYear +": "+ String.format("%.2f",worker.income(year,month)));
       sc.close();
    }
}