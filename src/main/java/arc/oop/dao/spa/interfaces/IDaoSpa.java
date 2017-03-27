package arc.oop.dao.spa.interfaces;

import arc.oop.model.chamber.Chamber;
import arc.oop.model.spa.Spa;

import java.util.List;

/**
 * Created by initium on 23.03.17.
 */
public interface IDaoSpa {
    List<Spa> getAll();
    Spa getSpa(int id);
    void createSpa(Spa spa);
    void updateSpa(Spa spa);
    void deleteSpa(int id);
    void showAll();
}
