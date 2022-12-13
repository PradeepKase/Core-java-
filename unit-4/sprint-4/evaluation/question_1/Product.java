package question_1;

public class Product implements Comparable<Product> {
    String productName;
    double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int compareTo(Product o){
        if(this.productPrice>o.productPrice){
            return 1;
        } else if (this.productPrice<o.productPrice) {
            return -1;
        }
        return 0;
    }

}
