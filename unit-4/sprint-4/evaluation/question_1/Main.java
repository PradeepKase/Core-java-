package question_1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Product> t1 = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=4; i++){
            System.out.println("Enter Product Name ");
            String name = sc.next();

            System.out.println("Enter Product Price ");
            int price = sc.nextInt();

            Product p1 = new Product(name, price);
            t1.add(p1);
        }

       for(Product res:t1){
           System.out.println("Name of product is "+ res.productName+ "ans Price is "+ res.productPrice);
       }
    }
}
