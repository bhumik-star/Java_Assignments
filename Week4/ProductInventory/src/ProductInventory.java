public class ProductInventory {
    public static void main(String[] args) {
        Product laptop = new Product("P001", "Laptop", 899.99, 5);
        Product mouse = new Product("P002", "Wireless Mouse", 24.99);
        Product notebook = new Product("P003", "Notebook", 4.99, 10);

        mouse.restock(20);
        laptop.sell(2);
        notebook.sell(3);

        System.out.println(laptop);
        System.out.println("Laptop inventory value: $" + laptop.getInventoryValue());
        System.out.println(mouse);
        System.out.println("Mouse inventory value: $" + mouse.getInventoryValue());
        System.out.println(notebook);
        System.out.println("Notebook inventory value: $" + notebook.getInventoryValue());
        System.out.println("Total products created: " + Product.getProductCount());
    }
}
