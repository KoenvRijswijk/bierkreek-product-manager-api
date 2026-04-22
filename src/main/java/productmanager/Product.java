package productmanager;

public class Product {
    private int id;
    private String name;
    private String category;
    private String rootstock;
    private double price;
    private int stock;
    private boolean isActive;

    public Product(int id, String name, String category, String rootstock, double price, int stock, boolean isActive) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.rootstock = rootstock;
        this.price = price;
        this.stock = stock;
        this.isActive = isActive;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getRootstock() { return rootstock; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public boolean getIsActive() { return isActive; }
}
