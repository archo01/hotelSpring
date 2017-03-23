package arc.oop.dao.chamber.interfaces;

import arc.oop.model.chamber.Chamber;

import java.util.List;

/**
 * Created by initium on 23.03.17.
 */
public interface IDaoChamber {
    List<Chamber> getAll();
    Chamber getChamber(int id);
    void createChamber();
    void updateChamber(Chamber chamber);
    void deleteChamber(int id);
}
