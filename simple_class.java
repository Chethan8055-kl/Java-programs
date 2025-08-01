import java.util.Scanner;

class Market {
    String name;
    int price;
    int qty;
    int total;

    void ask(Scanner scanner) {
        System.out.print("Enter FRUIT name: ");
        name = scanner.nextLine();
        if(!name.trim().equalsIgnoreCase("apple")) \\ Checks if user enters apple or not if user enter apple the code executes .
{
            System.out.println("Invalid fruit name. Please enter 'apple':");
            name = scanner.nextLine();
        }
        
    }
void cal(Scanner scanner) {
    while (!name.trim().equalsIgnoreCase("apple")) {
        System.out.println("Invalid fruit name. Please enter 'apple':");
        name = scanner.nextLine();
    }
    System.out.print("Enter quantity: ");
    qty = scanner.nextInt();
    total = price * qty;
}


    void display() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Cost: ₹" + total);
    }
}

public class example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Market m = new Market();
        m.price = 20; // Setting the price of apple
        m.ask(scanner);
        m.cal(scanner);
        m.display();
        scanner.close();
    }
}
