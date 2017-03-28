package arc.oop.service.spa.interfaces;

import arc.oop.model.spa.Spa;

import java.util.List;

/**
 * Created by initium on 28.03.17.
 */
public interface ISpaService {
    List<Spa> getAll();
    Spa getSpa(int id);
    void createSpa(Spa spa);
    void updateSpa(Spa spa);
    void deleteSpa(int id);
    void showAll();
}
