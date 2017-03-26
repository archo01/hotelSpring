package arc.oop.model.restorant;

/**
 * Created by initium on 20.03.17.
 */
public class Restaurant {
    int id;
    String food;
    int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Restaurant() {

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", food='" + food + '\'' +
                ", price=" + price +
                '}';
    }

    public Restaurant(int id, String food, int price) {

        this.id = id;
        this.food = food;
        this.price = price;

    }
}
