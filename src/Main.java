import database.ItemDatabase;
import database.OrderDatabase;
import database.ProductDatabase;
import database.UserDatabase;
import model.Item;
import model.Order;
import model.Product;
import model.User;
import service.ItemService;
import service.OrderService;
import service.ProductService;
import service.UserService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Adatbázisok létrehozása
        ItemDatabase itemDatabase = new ItemDatabase();
        OrderDatabase orderDatabase = new OrderDatabase();
        ProductDatabase productDatabase = new ProductDatabase();
        UserDatabase userDatabase = new UserDatabase();

        // Szerviz rétegek létrehozása
        ItemService itemService = new ItemService(itemDatabase);
        OrderService orderService = new OrderService(orderDatabase);
        ProductService productService = new ProductService(productDatabase);
        UserService userService = new UserService(userDatabase);

        // Példa adatok hozzáadása és kiolvasása
        Item item1 = new Item("chemicals", Arrays.asList("not food"));
        Item item2 = new Item("meats", Arrays.asList("food"));
        itemService.addItem(item1);
        itemService.addItem(item2);
        itemService.updateItem(item2);
        itemService.deleteItem(item1.getName());

        List<Item> items = itemService.getItems();
        for (Item item : items) {
            System.out.println("Item name: " + item.getName());
            System.out.println("Item categories: " + item.getCategories());
        }


        Product product1 = new Product("v1","windowscleaner", 2500);
        Product product2 = new Product("v2","steak", 15000);
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.updateProduct(product2);
        productService.deleteProduct(product1.getName());

        List<Product> products = productService.getProducts();
        for (Product product : products) {
            System.out.println("Product name: " + product.getName());
            System.out.println("Product price: " + product.getPrice());
        }

        User user1 = new User("Steven Segal", "pass");
        User user2 = new User("Will Smith", "12345678");
        userService.addUser(user1);
        userService.addUser(user2);
        userService.updateUser(user2);
        userService.deleteUser(user1.getUsername());

        List<User> users = userService.getUsers();
        for (User user : users) {
            System.out.println("User name: " + user.getUsername());
            System.out.println("User password: " + user.getPassword());
        }

    }
}
