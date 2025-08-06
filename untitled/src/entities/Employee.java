package entities;

public class Employee {
    private String nome;
    private Integer hours;
    private Double valuePerHour;

    public Employee(String nome, Integer hours, Double valuePerHour) {
        this.nome = nome;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Double payments() {
        return hours * valuePerHour;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+
                "\nHoras trabalhada: "+hours+
                "\nValor por hora: "+ valuePerHour+
                "\n Pamento: "+ String.format("%.2f",payments());
    }
}
