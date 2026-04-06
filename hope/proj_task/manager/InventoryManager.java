package manager;

import model.Product;
import analytics.InventoryAnalytics;

import java.util.*;

public class InventoryManager {

    public void add(List<Product> list, Product p) {
        list.add(p);
        System.out.println("Added!");
    }

    public void view(List<Product> list) {
        for (Product p : list) p.display();
    }

    public void search(List<Product> list, String name) {
        for (Product p : list) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.display();
                return;
            }
        }
        System.out.println("Not Found");
    }

    public void update(List<Product> list, String name, int qty) {
        for (Product p : list) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.setQuantity(qty);
                System.out.println("Updated!");
                return;
            }
        }
        System.out.println("Not Found");
    }

    public void delete(List<Product> list, String name) {
        list.removeIf(p -> p.getName().equalsIgnoreCase(name));
        System.out.println("Deleted!");
    }

    public void showAnalytics(List<Product> list) {
        InventoryAnalytics.show(list);
    }
}