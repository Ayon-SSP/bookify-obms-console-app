package com.bookify.demo;

import java.util.Scanner;

public class CustomerMenu {

    private static CustomerMenu customerMenu;
    private static CustomerDB customerDB = CustomerDB.getInstance();
    private static Scanner sc = new Scanner(System.in);

    private CustomerMenu() {
        super();
    }

    public static synchronized CustomerMenu getInstance() {
        if (customerMenu == null) {
            customerMenu = new CustomerMenu();
        }
        return customerMenu;
    }

    public void displayCustomerMenu() {
        System.out.println("1. View Products");
        System.out.println("2. Add to Cart");
        System.out.println("3. Remove from Cart");
        System.out.println("4. View Cart");
        System.out.println("5. Order Place");
        System.out.println("6. Exit");
    }

    public void performCustomerMenu() {
        boolean flag = true;

        while(flag){
            this.displayCustomerMenu();

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    BookStore.getInstance().displayBooks();
                    break;
                case 2:
                    System.out.println("Enter book id: ");
                    String bookId = sc.nextLine();
                    if (BookStore.getInstance().getBook(bookId) == null) {
                        System.out.println("Invalid book id");
                    } else {
                        customerDB.addCartItem(BookStore.getInstance().getBook(bookId));
                    }
                    break;
                case 3:
                    System.out.println("Enter book id: ");
                    String bookId2 = sc.nextLine();
                    customerDB.removeCartItem(BookStore.getInstance().getBook(bookId2));
                    break;
                case 4:
                    customerDB.displayCartItems();
                    break;
                case 5:
                    System.out.println("<---- Order Placed Successfully! ---->");
                    customerDB.clearCartItems();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }

    }
}