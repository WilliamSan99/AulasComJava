package entidades;

public class Estudantes {
    private String nome, email;


    public Estudantes(String nome, String email){
        this.nome= nome;
        this.email= email;
    }

     public String toString(){
        return "\nNome: "+nome+
                "\nE-mail: "+email;
    }

}
