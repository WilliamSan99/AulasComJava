package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> itemList =  new ArrayList<OrderItem>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss" );

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItems(OrderItem item){
        itemList.add(item);
    }
    public void removeItems(OrderItem item){
        itemList.remove(item);
    }

    public double total(){
        double soma =0;
        for(OrderItem o: itemList){
            soma += o.subTotal();
        }
        return soma;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Momento que o pedido foi feito: "+ sdf.format(getMoment())+"\n");
        sb.append("Status: "+ getStatus()+"\n");
        sb.append(client.toString());
        sb.append("Produtos: \n");
        for(OrderItem i : itemList){
            sb.append(i.toString());
        }
        sb.append("\nTotal: "+ String.format("%.2f",total()));
        return sb.toString();
    }
}
