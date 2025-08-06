import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Client c1 = new Client("William", "willian.san99@hotmail.com", sdf.parse("05/10/1999"));
        Order order = new Order(new Date(), OrderStatus.valueOf("PROCESSING"), c1);


        Product p1 = new Product("Tv", 1000);
        OrderItem oi1 = new OrderItem(1, p1.getPrice(), p1);
        order.addItems(oi1);

        p1 = new Product("Mouse",40);
        oi1 = new OrderItem(2, p1.getPrice(), p1);
        order.addItems(oi1);

        System.out.println(order);
    }
}