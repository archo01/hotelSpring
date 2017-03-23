package arc.oop.dao.chamber.impls;

import arc.oop.dao.chamber.interfaces.IDaoChamber;
import arc.oop.model.chamber.Chamber;

import java.util.Arrays;
import java.util.List;

/**
 * Created by initium on 23.03.17.
 */
public class DaoChamberImpl implements IDaoChamber {

    public DaoChamberImpl(List<Chamber> chambers) {
        this.chambers = chambers;
    }

    public DaoChamberImpl() {
    }

    public List<Chamber> getChambers() {
        return chambers;
    }

    public void setChambers(List<Chamber> chambers) {
        this.chambers = chambers;
    }

    public List<Chamber> chambers =
            Arrays.asList(
                    new Chamber(1,true,true,true,true),
                    new Chamber(2,true,true,true,false),
                    new Chamber(3,true,true,false,true),
                    new Chamber(4,true,false,true,true),
                    new Chamber(5,false,true,true,true)
                        );


    public List<Chamber> getAll() {

        return chambers;
    }

    public void showAll() {
        for (Chamber item: chambers
             ) {
            System.out.println(item.toString());
        }
    }

    public Chamber getChamber(int id) {
        Chamber result = null;
        for (  Chamber item: chambers
                ) {
            if (item.getId() == id){
               result = new Chamber(
                       item.getId(),
                       item.isFridge(),
                       item.isBar(),
                       item.isConditioner(),
                       item.isJacusi());
            }
        }
        return result;

    }


    public void createChamber() {

    }

    public void updateChamber(Chamber chamber) {
        Chamber updateChamber = null;
        for (Chamber item : chambers) {
            if (item.getId() == chamber.getId()) {
                updateChamber = item;
                break;

            }
        }
        updateChamber = chamber;
    }
    public void deleteChamber(int id) {

    }
}
