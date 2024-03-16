## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


```java
package com.ecomm.util;

import java.util.Scanner;

import com.ecomm.model.*;

public class AdminMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager = ProductManager.getInstance(); 
    
    //TEMP RANDOM DATA
    public static void generateTestData() {
        // Generate test categories
        Category electronics = new Category("Electronics", "electronics.jpg");
        Category clothing = new Category("Clothing", "clothing.jpg");
        Category books = new Category("Books", "books.jpg");

        // Add categories to the ProductManager
        productManager.addCategory(electronics);
        productManager.addCategory(clothing);
        productManager.addCategory(books);

        // Generate test products
        productManager.addProduct(new Product(electronics, "Smartphone", "Latest smartphone model", 799.99, 50, 0.1, "smartphone.jpg"));
        productManager.addProduct(new Product(electronics, "Laptop", "High-performance laptop", 1299.99, 30, 0.05, "laptop.jpg"));
        productManager.addProduct(new Product(clothing, "T-shirt", "Cotton T-shirt", 19.99, 100, 0.15, "tshirt.jpg"));
        productManager.addProduct(new Product(clothing, "Jeans", "Slim-fit jeans", 39.99, 80, 0.1, "jeans.jpg"));
        productManager.addProduct(new Product(books, "Java Programming", "Java programming guide", 29.99, 20, 0.2, "java_book.jpg"));
        productManager.addProduct(new Product(books, "Harry Potter", "Fiction fantasy novel", 15.99, 50, 0.1, "harry_potter.jpg"));
    }

    public static void main(String[] args) {
    	
        boolean exit = false;
        while (!exit) {
            System.out.println("Admin Menu:");
            System.out.println("1. Create Category");
            System.out.println("2. Create Product");
            System.out.println("3. View Available Products");
            System.out.println("4. View Categories"); // New option to view categories
            System.out.println("5. Modify Product");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createCategory();
                    break;
                case 2:
                    createProduct();
                    break;
                case 3:
                    viewAvailableProducts();
                    break;
                case 4:
                    viewCategories(); // Call the new method to view categories
                    break;
                case 5:
                    modifyProduct();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }

    private static void createCategory() {
        System.out.println("Enter Category Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Category Image:");
        String image = scanner.nextLine();

        Category category = new Category(name, image);
        productManager.addCategory(category);
        System.out.println("Category created successfully: " + category);
    }

    private static void createProduct() {
        System.out.println("Enter Category ID:");
        int categoryId = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Category category = productManager.findCategoryById(categoryId);
        if (category == null) {
            System.out.println("Category with ID " + categoryId + " not found.");
            return;
        }

        System.out.println("Enter Product Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Product Description:");
        String description = scanner.nextLine();
        System.out.println("Enter Product Price:");
        double price = scanner.nextDouble();
        System.out.println("Enter Product Quantity:");
        int qty = scanner.nextInt();
        System.out.println("Enter Product Discount:");
        double discount = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.println("Enter Product Image:");
        String image = scanner.nextLine();

        Product product = new Product(category, name, description, price, qty, discount, image);
        productManager.addProduct(product);
        System.out.println("Product created successfully: " + product);
    }

    private static void viewAvailableProducts() {
        System.out.println("Available Products:");
        for (Product product : productManager.getAllProducts()) {
            System.out.println(product);
        }
    }

    private static void modifyProduct() {
        System.out.println("Enter Product ID to Modify:");
        int productId = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Product product = productManager.findProductById(productId);
        if (product != null) {
            System.out.println("Enter New Product Name:");
            String name = scanner.nextLine();
            System.out.println("Enter New Product Description:");
            String description = scanner.nextLine();
            System.out.println("Enter New Product Price:");
            double price = scanner.nextDouble();
            System.out.println("Enter New Product Quantity:");
            int qty = scanner.nextInt();
            System.out.println("Enter New Product Discount:");
            double discount = scanner.nextDouble();
            scanner.nextLine();  // Consume newline
            System.out.println("Enter New Product Image:");
            String image = scanner.nextLine();

            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            product.setQty(qty);
            product.setDiscount(discount);
            product.setImage(image);

            System.out.println("Product details updated successfully: " + product);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    private static void viewCategories() {
        System.out.println("Available Categories:");
        for (Category category : productManager.getAllCategories()) {
            System.out.println(category);
        }
    }
}


package com.ecomm.util;



import java.util.Scanner;

import com.ecomm.model.*;

public class AdminMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager = ProductManager.getInstance(); 
    
    //TEMP RANDOM DATA
    public static void generateTestData() {
        // Generate test categories
        Category electronics = new Category("Electronics", "electronics.jpg");
        Category clothing = new Category("Clothing", "clothing.jpg");
        Category books = new Category("Books", "books.jpg");

        // Add categories to the ProductManager
        productManager.addCategory(electronics);
        productManager.addCategory(clothing);
        productManager.addCategory(books);

        // Generate test products
        productManager.addProduct(new Product(electronics, "Smartphone", "Latest smartphone model", 799.99, 50, 0.1, "smartphone.jpg"));
        productManager.addProduct(new Product(electronics, "Laptop", "High-performance laptop", 1299.99, 30, 0.05, "laptop.jpg"));
        productManager.addProduct(new Product(clothing, "T-shirt", "Cotton T-shirt", 19.99, 100, 0.15, "tshirt.jpg"));
        productManager.addProduct(new Product(clothing, "Jeans", "Slim-fit jeans", 39.99, 80, 0.1, "jeans.jpg"));
        productManager.addProduct(new Product(books, "Java Programming", "Java programming guide", 29.99, 20, 0.2, "java_book.jpg"));
        productManager.addProduct(new Product(books, "Harry Potter", "Fiction fantasy novel", 15.99, 50, 0.1, "harry_potter.jpg"));
    }

    public static void main(String[] args) {
    	
        boolean exit = false;
        while (!exit) {
            System.out.println("Admin Menu:");
            System.out.println("1. Create Category");
            System.out.println("2. Create Product");
            System.out.println("3. View Available Products");
            System.out.println("4. View Categories"); // New option to view categories
            System.out.println("5. Modify Product");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createCategory();
                    break;
                case 2:
                    createProduct();
                    break;
                case 3:
                    viewAvailableProducts();
                    break;
                case 4:
                    viewCategories(); // Call the new method to view categories
                    break;
                case 5:
                    modifyProduct();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }

    private static void createCategory() {
        System.out.println("Enter Category Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Category Image:");
        String image = scanner.nextLine();

        Category category = new Category(name, image);
        productManager.addCategory(category);
        System.out.println("Category created successfully: " + category);
    }

    private static void createProduct() {
        System.out.println("Enter Category ID:");
        int categoryId = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Category category = productManager.findCategoryById(categoryId);
        if (category == null) {
            System.out.println("Category with ID " + categoryId + " not found.");
            return;
        }

        System.out.println("Enter Product Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Product Description:");
        String description = scanner.nextLine();
        System.out.println("Enter Product Price:");
        double price = scanner.nextDouble();
        System.out.println("Enter Product Quantity:");
        int qty = scanner.nextInt();
        System.out.println("Enter Product Discount:");
        double discount = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.println("Enter Product Image:");
        String image = scanner.nextLine();

        Product product = new Product(category, name, description, price, qty, discount, image);
        productManager.addProduct(product);
        System.out.println("Product created successfully: " + product);
    }

    private static void viewAvailableProducts() {
        System.out.println("Available Products:");
        for (Product product : productManager.getAllProducts()) {
            System.out.println(product);
        }
    }

    private static void modifyProduct() {
        System.out.println("Enter Product ID to Modify:");
        int productId = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Product product = productManager.findProductById(productId);
        if (product != null) {
            System.out.println("Enter New Product Name:");
            String name = scanner.nextLine();
            System.out.println("Enter New Product Description:");
            String description = scanner.nextLine();
            System.out.println("Enter New Product Price:");
            double price = scanner.nextDouble();
            System.out.println("Enter New Product Quantity:");
            int qty = scanner.nextInt();
            System.out.println("Enter New Product Discount:");
            double discount = scanner.nextDouble();
            scanner.nextLine();  // Consume newline
            System.out.println("Enter New Product Image:");
            String image = scanner.nextLine();

            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            product.setQty(qty);
            product.setDiscount(discount);
            product.setImage(image);

            System.out.println("Product details updated successfully: " + product);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    private static void viewCategories() {
        System.out.println("Available Categories:");
        for (Category category : productManager.getAllCategories()) {
            System.out.println(category);
        }
    }
}

```

```java
package com.ecomm.util;
import java.time.LocalDate;
import java.util.Scanner;

import com.ecomm.model.*;

public class UserMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager = ProductManager.getInstance(); 
    private static Cart cart = new Cart();
    private static User user;

    public static void setUser(User user) {
        UserMenu.user = user;
    }

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("User Menu:");
            System.out.println("1. View Products");
            System.out.println("2. Buy Product");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    viewProducts();
                    break;
                case 2:
                    buyProduct();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }

    private static void viewProducts() {
        System.out.println("Available Products:");
        for (Product product : productManager.getAllProducts()) {
            System.out.println(product);
        }
    }

    private static void buyProduct() {
        System.out.println("Enter Product ID to Buy:");
        int productId = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.println("Enter Quantity:");
        int quantity = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Product product = productManager.findProductById(productId);
        if (product != null) {
            cart.addItem(product, quantity);
            System.out.println("Product added to cart successfully.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    private static void viewCart() {
        System.out.println("Items in Cart:");
        for (CartItem item : cart.getItems()) {
            System.out.println(item);
        }
    }

    private static void checkout() {
        // Assuming the user confirms the checkout process
        System.out.println("Processing payment for the items in the cart...");
        //  implement payment processing logic here
        double totalAmount = calculateTotalAmount();
        Order order = new Order("Pending", "Credit Card", user, LocalDate.now());
        order.processPayment(totalAmount);
    }

    private static double calculateTotalAmount() {
        double total = 0.0;
        for (CartItem item : cart.getItems()) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }
}

```