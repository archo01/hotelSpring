package arc.oop.model.chamber;

/**
 * Created by initium on 20.03.17.
 */
public class Chamber {
    int id;
    boolean fridge;
    boolean bar;
    boolean conditioner;
    boolean jacusi;


    public Chamber(int id, boolean fridge, boolean bar, boolean conditioner, boolean jacusi) {
        this.id = id;
        this.fridge = fridge;
        this.bar = bar;
        this.conditioner = conditioner;
        this.jacusi = jacusi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFridge() {
        return fridge;
    }

    public void setFridge(boolean fridge) {
        this.fridge = fridge;
    }

    public boolean isBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    public boolean isJacusi() {
        return jacusi;
    }

    public void setJacusi(boolean jacusi) {
        this.jacusi = jacusi;
    }

    public Chamber() {
    }

    @Override
    public String toString() {
        return "Chamber{" +
                "id=" + id +
                ", fridge=" + fridge +
                ", bar=" + bar +
                ", conditioner=" + conditioner +
                ", jacusi=" + jacusi +
                '}';
    }
}
