package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal(){
        return price * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Produto: "+getProduct().getName()+", ");
        sb.append("Preço: "+price+", ");
        sb.append("Quantity: "+quantity+", ");
        sb.append("Subtotal: "+subTotal()+"\n");

        return sb.toString();
    }
}
