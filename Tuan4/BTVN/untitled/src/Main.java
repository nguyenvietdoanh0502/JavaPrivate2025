import Model.Product;
import Service.ProductController;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Product product = new Product("hello","hello",10);
        productController.addProduct("smartphone","hello","des",11);
        ArrayList<Product> products  = new ArrayList<>();
        products = productController.getAllProduct();
        System.out.println(products.getFirst().getInfo());
    }
}