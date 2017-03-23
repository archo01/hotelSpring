package arc.oop.model.spa;

/**
 * Created by initium on 20.03.17.
 */
public class Spa {
    int id;
    String type;
    int price;

    public Spa(int id, String type, int price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public Spa() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
