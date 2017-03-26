package arc.oop.model.bill;

import arc.oop.model.chamber.Chamber;
import arc.oop.model.restorant.Restaurant;
import arc.oop.model.spa.Spa;

/**
 * Created by initium on 20.03.17.
 */
public class Bill {
    int id;
    Chamber chamber;
    Restaurant restorant;
    Spa spa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Chamber getChamber() {
        return chamber;
    }

    public void setChamber(Chamber chamber) {
        this.chamber = chamber;
    }

    public Restaurant getRestorant() {
        return restorant;
    }

    public void setRestorant(Restaurant restorant) {
        this.restorant = restorant;
    }

    public Spa getSpa() {
        return spa;
    }

    public void setSpa(Spa spa) {
        this.spa = spa;
    }

    public Bill() {

    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=\n" + id +
                ", chamber=\n" + chamber.toString()  +
                ", restorant=\n" + restorant.toString() +
                ", spa=\n" + spa.toString() +
                '}';
    }

    public Bill(int id, Chamber chamber, Restaurant restorant, Spa spa) {
        this.id = id;
        this.chamber = chamber;
        this.restorant = restorant;
        this.spa = spa;
    }


}
