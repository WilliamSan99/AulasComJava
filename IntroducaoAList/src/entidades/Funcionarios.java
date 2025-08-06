package entidades;

public class Funcionarios {
    private int id;
    private String nome;
    private double salario;

    public Funcionarios(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public double AumentoSalario(double porcentagem){
        salario  += salario * (porcentagem+1);
        return salario;
    }

    public String toString(){
        return "ID: " +id+
                "\nNome: "+ nome+
                "\nSalario: "+salario+
                "\n---------------------";
    }

    public int getId() {
        return id;
    }
}
