interface RecommenderSystem {
    void train(User[] users);
    Product[] recommend(User user);
}

abstract class BaseRecommenderSystem implements RecommenderSystem {
    String name;
    int version;

    public BaseRecommenderSystem(String name, int version) {
        this.name = name;
        this.version = version;
    }

    void displayDetails() {
        System.out.println("Recommender System: " + name + " (Version " + version + ")");
    }
}

class User {
    String name;
    int[] purchaseHistory;

    public User(String name, int[] purchaseHistory) {
        this.name = name;
        this.purchaseHistory = purchaseHistory;
    }

    public String getName() {
        return name;
    }

    public int[] getPurchaseHistory() {
        return purchaseHistory;
    }
}

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}

class DummyRecommenderSystem extends BaseRecommenderSystem {
    Product[] products;

    public DummyRecommenderSystem(String name, int version) {
        super(name, version);
    }

    public void train(User[] users) {
        System.out.println("Training the dummy recommender system...");
    }

    public Product[] recommend(User user) {
        System.out.println("Generating recommendations for user: " + user.getName());
        int[] history = user.getPurchaseHistory();
        Product[] recommendations = new Product[history.length];
        for (int i = 0; i < history.length; i++) {
            for (Product product : products) {
                if (product.getId() == history[i]) {
                    recommendations[i] = product;
                    break;
                }
            }
        }
        return recommendations;
    }
}

public class Exercice1 {
    public static void main(String[] args) {
        User[] users = generateUsers();
        Product[] products = generateProducts();
        DummyRecommenderSystem recommenderSystem = new DummyRecommenderSystem("DummyRS", 1);
        recommenderSystem.products = products;
        recommenderSystem.train(users);
        recommenderSystem.displayDetails();
        for (User user : users) {
            System.out.println("Recommendations for " + user.getName() + ":");
            Product[] recommendations = recommenderSystem.recommend(user);
            for (Product product : recommendations) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
            System.out.println();
        }
    }

    private static User[] generateUsers() {
        User[] users = new User[3];
        users[0] = new User("User1", new int[]{1, 3});
        users[1] = new User("User2", new int[]{2, 3, 4});
        users[2] = new User("User3", new int[]{1, 4});
        return users;
    }

    private static Product[] generateProducts() {
        Product[] products = new Product[4];
        products[0] = new Product(1, "Product1", 10.0);
        products[1] = new Product(2, "Product2", 15.0);
        products[2] = new Product(3, "Product3", 20.0);
        products[3] = new Product(4, "Product4", 25.0);
        return products;
    }
}
