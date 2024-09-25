import java.util.Scanner;

public static int orderShow(String[] menuList, String order) {
        for (int i = 0; i < menuList.length; i++) {
            if (menuList[i].equals(order)) {
                System.out.println("Your order item is available: " + menuList[i]);
                return;
            }
        }
        System.out.println("Sorry, the item is not available in the menu.");
    }

    public static void main(String[] args) {
        String[] menuList = {"Burger", "Samosa", "Ice Cream", "Tea"};

        Scanner sc = new Scanner(System.in);

        System.out.print("What do you want to order? ");
        String order[] = sc.nextLine();

        orderShow(menuList, order);
    }
}
