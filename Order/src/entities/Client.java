package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String nome, email;
    private Date birthDate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Client(String nome, String email, Date birthDate){
        this.nome = nome;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cleinte "+getNome());
        sb.append(" ("+sdf.format(getBirthDate())+") ");
        sb.append(getEmail());
        return sb.toString();
    }
}
