package arc.oop.service.chamber.impls;

import arc.oop.dao.chamber.interfaces.IDaoChamber;
import arc.oop.model.chamber.Chamber;
import arc.oop.service.chamber.interfaces.IChamberService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by initium on 24.03.17.
 */

@Service
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
        return daoChamber.getChamber(id);
    }

    public void createChamber(Chamber chamber) {
        daoChamber.createChamber(chamber);   }

    public void updateChamber(Chamber chamber) {
        daoChamber.updateChamber(chamber);
    }

    public void deleteChamber(int id) {
        daoChamber.deleteChamber(id);
    }

    public void showAll() {
        daoChamber.showAll();
    }

    public int getAmountOfAllBills() {
        return daoChamber.getAll().size();
    }

    @Override
    public int getPriceById(int id) {
        int price = 250;
        Chamber room = daoChamber.getChamber(id);
            if (room.isBar()){
                price += 150;
            }
            if (room.isConditioner()){
                price += 80;
            }
            if (room.isFridge()){
                price += 60;
            }
            if (room.isJacusi()){
                price += 200;
            }
        return price;
    }


}
