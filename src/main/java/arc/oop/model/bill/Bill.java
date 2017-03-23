package arc.oop.model.bill;

import arc.oop.model.chamber.Chamber;
import arc.oop.model.restorant.Restorant;
import arc.oop.model.spa.Spa;

/**
 * Created by initium on 20.03.17.
 */
public class Bill {
    Chamber chamber;
    Restorant restorant;
    Spa spa;
    public Chamber getChamber() {
        return chamber;
    }

    public void setChamber(Chamber chamber) {
        this.chamber = chamber;
    }

    public Restorant getRestorant() {
        return restorant;
    }

    public void setRestorant(Restorant restorant) {
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

    public Bill(Chamber chamber, Restorant restorant, Spa spa) {

        this.chamber = chamber;
        this.restorant = restorant;
        this.spa = spa;
    }


}
