package arc.oop.dao.spa.impls;

import arc.oop.dao.spa.interfaces.IDaoSpa;
import arc.oop.model.spa.Spa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by initium on 24.03.17.
 */
public class DaoSpaImpl implements IDaoSpa {


    public List<Spa> spaes = new ArrayList<>();

    public DaoSpaImpl(List<Spa> spaes) {
        this.spaes = spaes;
    }

    public DaoSpaImpl() {

    }

    public List<Spa> getAll() {
        return null;
    }

    public Spa getSpa(int id) {
        Spa result = null;
        for (  Spa item: spaes
                ) {
            if (item.getId() == id){
                result = new Spa(
                        item.getId(),
                        item.getType(),
                        item.getPrice());
            }
        }
        return result;
    }

    public void createSpa(Spa spa) {
        spaes.add(spa);
    }

    public void updateSpa(Spa spa) {
        Spa updateSpa = null;
        for (Spa item : spaes) {
            if (item.getId() == spa.getId()) {
                updateSpa = item;
                break;

            }
        }
        updateSpa = spa;
    }

    public void deleteSpa(int id) {
        int i = 0;
        boolean is = false;
        for (Spa item : spaes) {
            if (item.getId() == id) {
                is = true;
                break;
            }
            i++;
        }
        if (is) {
            spaes.remove(i);
        }
    }
    public void showAll() {

        for (Spa item: spaes
                ) {
            System.out.println(item.toString());
        }
    }

}
