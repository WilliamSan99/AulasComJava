package entities;

public class OutsourcedEmployee extends Employee{
    private Double additianlCharger;

    public OutsourcedEmployee(String nome, Integer hours, Double valuePerHour,Double additianlCharger ) {
        super(nome, hours, valuePerHour);
        this.additianlCharger = additianlCharger;
    }
    @Override
    public Double payments(){
        return super.payments()+ additianlCharger*1.1;
    }

}
