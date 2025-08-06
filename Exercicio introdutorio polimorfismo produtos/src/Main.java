import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        List<Product> productList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        System.out.println("Digite a quantidade de produto que vao da entrada");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("Produto "+ (i+1));
            System.out.println("Comum, Usado, Importado (c/u/i)");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Digite o nome do produto");
            String name = sc.nextLine();
            System.out.println("Digite o preço do produto");
            double price = sc.nextDouble();
            if(ch == 'c'){
                productList.add(new Product(name, price));
            } else if (ch=='u') {
                System.out.println("Digite a data de validade");
                String date = sc.nextLine();
                Date manufacturaDate = sdf.parse(sc.nextLine());
                productList.add(new UsedProduct(name, price, manufacturaDate));
            }else {
                System.out.println("Digite o custo de importação");
                double customsfee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, customsfee));
            }

        }

        for(Product p: productList){
            System.out.println(p.priceTag());

        }
    }
}