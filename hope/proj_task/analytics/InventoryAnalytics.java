package analytics;

import model.Product;
import java.util.*;

public class InventoryAnalytics {

    public static void show(List<Product> list) {

        int totalQty = 0;
        double value = 0;

        for (Product p : list) {
            totalQty += p.getQuantity();
            value += p.getQuantity() * p.getPrice();

            if (p.getQuantity() < 5) {
                System.out.println("Low Stock: " + p.getName());
            }
        }

        System.out.println("Total Items: " + totalQty);
        System.out.println("Inventory Value: Rs." + (int)value);
    }
}