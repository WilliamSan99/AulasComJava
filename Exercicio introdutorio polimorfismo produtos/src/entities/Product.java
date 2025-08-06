package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + name);
        sb.append("\nPreço: "+ String.format("%.2f",price));
        return sb.toString();
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
