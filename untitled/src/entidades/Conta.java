package entidades;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    public Conta(int numeroConta, String nomeTitular, float depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        Deposito(depositoInicial);
    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public void Deposito(float valorDepositado){
        saldo += valorDepositado;
    }

    public float Saque(float valorASacar){
        if(saldo >= valorASacar){
            saldo = (saldo - valorASacar - 5);
            return valorASacar;
        }else {
            System.out.println("Valor para saque indisponivel\nSaldo da conta: "+getSaldo()+"\nValor a sacar: "+valorASacar);
            valorASacar = 0;
            return valorASacar;
        }
    }

    public String toString() {
        return "Conta: "+ getNumeroConta()
                +" --- Titular: "+ getNomeTitular()
                +" --- Saldo:  " + getSaldo();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }
}
