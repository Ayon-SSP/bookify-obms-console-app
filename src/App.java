import com.bookify.demo.AdminMenu;
import com.bookify.demo.CustomerMenu;

public class App {
    public static void main(String[] args) {
        AdminMenu adminMenu = AdminMenu.getInstance();
        CustomerMenu customerMenu = CustomerMenu.getInstance();

        adminMenu.performAdminMenu();
        customerMenu.performCustomerMenu();
    }   
}