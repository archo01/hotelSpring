package arc.oop.service.spa.impls;

import arc.oop.dao.spa.interfaces.IDaoSpa;
import arc.oop.model.spa.Spa;
import arc.oop.service.spa.interfaces.ISpaService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by initium on 28.03.17.
 */

@Service
public class SpaServiceImpl implements ISpaService {

    IDaoSpa daoSpa;



    public IDaoSpa getDaoSpa() {
        return daoSpa;
    }

    public void setDaoSpa(IDaoSpa daoSpa) {
        this.daoSpa = daoSpa;
    }

    public SpaServiceImpl() {

    }

    public SpaServiceImpl(IDaoSpa daoSpa) {

        this.daoSpa = daoSpa;
    }

    @Override
    public List<Spa> getAll() {
        return daoSpa.getAll();
    }

    @Override
    public Spa getSpa(int id) {
        return daoSpa.getSpa(id);
    }

    @Override
    public void createSpa(Spa spa) {
        daoSpa.createSpa(spa);
    }

    @Override
    public void updateSpa(Spa spa) {
        daoSpa.updateSpa(spa);
    }

    @Override
    public void deleteSpa(int id) {
        daoSpa.deleteSpa(id);
    }

    @Override
    public void showAll() {
        daoSpa.showAll();
    }
}
