package arc.oop.service.restoraunt.impls;

import arc.oop.dao.restoraunt.interfaces.IDaoRestaurant;
import arc.oop.model.restorant.Restaurant;
import arc.oop.service.restoraunt.interfaces.IRestorauntService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by initium on 26.03.17.
 */

@Service
public class RestorauntServiceImpl implements IRestorauntService {

    IDaoRestaurant daoRestaurant;

    public IDaoRestaurant getDaoRestaurant() {
        return daoRestaurant;
    }

    public void setDaoRestaurant(IDaoRestaurant daoRestaurant) {
        this.daoRestaurant = daoRestaurant;
    }

    public RestorauntServiceImpl() {

    }

    public RestorauntServiceImpl(IDaoRestaurant daoRestaurant) {

        this.daoRestaurant = daoRestaurant;
    }

    @Override
    public List<Restaurant> getAll() {
        return daoRestaurant.getAll();
    }

    @Override
    public Restaurant getRestaurant(int id) {
        return daoRestaurant.getRestaurant(id);
    }

    @Override
    public void createRestaurant(Restaurant restaurant) {
        daoRestaurant.createRestaurant(restaurant);
    }

    @Override
    public void updateRestaurant(Restaurant restaurant) {
        daoRestaurant.updateRestaurant(restaurant);
    }

    @Override
    public void deleteRestaurant(int id) {
        daoRestaurant.deleteRestaurant(id);
    }

    @Override
    public void showAll() {
        daoRestaurant.showAll();
    }
}
