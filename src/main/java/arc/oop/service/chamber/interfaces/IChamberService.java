package arc.oop.service.chamber.interfaces;

import arc.oop.model.chamber.Chamber;

import java.util.List;

/**
 * Created by initium on 24.03.17.
 */
public interface IChamberService {
    List<Chamber> getAll();
    Chamber getChamber(int id);
    void createChamber(Chamber chamber);
    void updateChamber(Chamber chamber);
    void deleteChamber(int id);
    void showAll();

    int getAmountOfAllBills();
}
