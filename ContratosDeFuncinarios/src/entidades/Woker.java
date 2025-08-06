package entidades;

import entidades.enums.WokerLevel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Woker {
    private String nome;
    private WokerLevel level;
    private double baseSalary;

    private Department department;
    private List<HourContract> contractlist = new ArrayList<>();

    public Woker(String name, WokerLevel level, double baseSalary, Department department) {
        this.department = department;
        this.baseSalary = baseSalary;
        this.level = level;
        this.nome = nome;
    }

    public void addContract(HourContract contract){
        contractlist.add(contract);
    }
    public void removeContract(HourContract contract){
        contractlist.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c: contractlist){
            cal.setTime(c.getDate());
            int cYear = cal.get(Calendar.YEAR);
            int cMonth = 1+cal.get(Calendar.MONTH);
            if(year == cYear && month==cMonth ){
                sum +=c.totalValue();
            }
        }
        return sum;
    }


    public String getNome() {
        return nome;
    }

    public WokerLevel getLevel() {
        return level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public Department getDepartment() {
        return department;
    }
}
