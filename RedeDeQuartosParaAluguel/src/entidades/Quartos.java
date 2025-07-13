package entidades;

public class Quartos {
    private int numero;
    private Estudantes estudantes;

    public Quartos(int numero) {
        this.numero = numero;
    }

    public Estudantes getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudantes estudantes) {
        this.estudantes = estudantes;
    }

    public String toString(){
        return "***************************\nNumero do quarto: "+ numero
                +"\n*****Dados do estudante*****"+estudantes+"\n\n";
    }
}
