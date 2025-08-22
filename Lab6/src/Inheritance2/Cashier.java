package Inheritance2;

import java.util.HashMap;

public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void printReceipt(InventoryCart cart) {
        System.out.println("-------------------------------------");
        System.out.println("Pumpkin Shop (" + name + ")\n");

        HashMap<String, Integer> count = new HashMap<>();
        HashMap<String, Integer> totalPrice = new HashMap<>();

        for (Product p : cart.getItems()) {
            String item = p.toString().split("  ")[0]; // ตัดชื่อ + ปริมาณ
            int price = p.getPrice();

            count.put(item, count.getOrDefault(item, 0) + 1);
            totalPrice.put(item, totalPrice.getOrDefault(item, 0) + price);
        }

        int total = 0;
        for (String item : count.keySet()) {
            int qty = count.get(item);
            int price = totalPrice.get(item);
            System.out.println(qty + " x " + item + " " + price);
            total += price;
        }

        System.out.println("\n-------------------------------------");
        System.out.println("Total      " + total + " $");
    }
}