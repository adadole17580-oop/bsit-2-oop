import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Food Ordering System ===");

        ArrayList<Order> orders = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("\nEnter customer name for Order " + i + ": ");
            String name = sc.nextLine();
            Order order = new Order(name);

            while (true) {
                System.out.print("Enter item name (or 'done' to finish): ");
                String item = sc.nextLine();
                if (item.equalsIgnoreCase("done")) break;

                System.out.print("Enter price for " + item + ": ");
                try {
                    double price = Double.parseDouble(sc.nextLine());
                    order.addItem(item, price);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            orders.add(order);
        }

        System.out.println("\nOrder Results:");
        for (Order o : orders) {
            System.out.println(o.displayOrder());
        }

        System.out.println("\nTotal orders created: " + Order.getTotalOrders());

        Order largest = orders.get(0);
        for (Order o : orders) {
            if (o.getTotalAmount() > largest.getTotalAmount()) {
                largest = o;
            }
        }
        System.out.println("Largest order: " + largest.getCustomerName() +
                " ($" + String.format("%.2f", largest.getTotalAmount()) + ")");

        sc.close();
    }
}