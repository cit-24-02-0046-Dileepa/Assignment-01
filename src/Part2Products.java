package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Part2Products {

    public static void main(String[] args) {

        // 1. Create HashMap and add products
        HashMap<String, Double> products = new HashMap<>();

        products.put("P001", 230.50);
        products.put("P002", 150.00);
        products.put("P003", 90.75);
        products.put("P004", 170.00);
        products.put("P005", 300.00);

        // 2. Display all products
        System.out.println("---- Product Details ----");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(
                "Product Code: " + entry.getKey() +
                ", Price: " + entry.getValue()
            );
        }

        // 3. Search price of P003 – Bread
        System.out.println("\nPrice of P003 – Bread: " + products.get("P003"));

        // 4. Change price of P002 – Milk to 165.00
        products.put("P002", 165.00);

        // 5. Remove product P005 – Tea
        products.remove("P005");

        // Display updated list
        System.out.println("\n---- Updated Product List ----");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(
                "Product Code: " + entry.getKey() +
                ", Price: " + entry.getValue()
            );
        }
    }
}
