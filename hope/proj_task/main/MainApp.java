package main;

import manager.InventoryManager;
import model.Product;
import utils.Validation;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();
        List<Product> list = new ArrayList<>();

        while (true) {

            System.out.println("\n1.Add 2.View 3.Search 4.Update 5.Delete 6.Analytics 7.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Qty: ");
                int qty = sc.nextInt();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                if (!Validation.valid(qty, price)) {
                    System.out.println("Invalid Input");
                    continue;
                }

                manager.add(list, new Product(name, qty, price));
            }

            else if (ch == 2) manager.view(list);

            else if (ch == 3) {
                System.out.print("Name: ");
                manager.search(list, sc.next());
            }

            else if (ch == 4) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("New Qty: ");
                manager.update(list, name, sc.nextInt());
            }

            else if (ch == 5) {
                System.out.print("Name: ");
                manager.delete(list, sc.next());
            }

            else if (ch == 6) manager.showAnalytics(list);

            else break;
        }
    }
}