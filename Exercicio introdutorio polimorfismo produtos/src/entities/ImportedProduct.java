package entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    public Double totalPrice(){
        return getPrice()+ customsFee;
    }
    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: "+getName());
        sb.append("\nPreço: "+ String.format("%.2f",totalPrice()));
        sb.append("\nCusto de importação: "+ String.format("%.2f",customsFee));
        return sb.toString();
    }
}
