import com.bookify.demo.AdminMenu;

public class App {
    public static void main(String[] args) {
        AdminMenu adminMenu = AdminMenu.getInstance();

        while(true){
            adminMenu.displayAdminMenu();
            adminMenu.performAdminMenu();
        }
    }   
}