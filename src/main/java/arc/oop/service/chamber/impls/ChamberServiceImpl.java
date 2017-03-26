package arc.oop.service.chamber.impls;

import arc.oop.dao.chamber.interfaces.IDaoChamber;
import arc.oop.model.chamber.Chamber;
import arc.oop.service.chamber.interfaces.IChamberService;

import java.util.List;

/**
 * Created by initium on 24.03.17.
 */
public class ChamberServiceImpl implements IChamberService {
    IDaoChamber daoChamber;

    public IDaoChamber getDaoChamber() {
        return daoChamber;
    }

    public void setDaoChamber(IDaoChamber daoChamber) {
        this.daoChamber = daoChamber;
    }

    public ChamberServiceImpl() {

    }

    public ChamberServiceImpl(IDaoChamber daoChamber) {

        this.daoChamber = daoChamber;
    }

    public List<Chamber> getAll() {
        return daoChamber.getAll();
    }

    public Chamber getChamber(int id) {
        return null;
    }

    public void createChamber(Chamber chamber) {

    }

    public void updateChamber(Chamber chamber) {

    }

    public void deleteChamber(int id) {

    }

    public void showAll() {

    }

    public int getAmountOfAllBills() {
        return daoChamber.getAll().size();
    }
}
