package arc.oop.service.restaurant.impls;

import arc.oop.dao.restaurant.interfaces.IDaoRestaurant;
import arc.oop.model.restaurant.Restaurant;
import arc.oop.service.restaurant.interfaces.IRestaurantService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by initium on 26.03.17.
 */

@Service
public class RestaurantServiceImpl implements IRestaurantService {

    IDaoRestaurant daoRestaurant;

    public IDaoRestaurant getDaoRestaurant() {
        return daoRestaurant;
    }

    public void setDaoRestaurant(IDaoRestaurant daoRestaurant) {
        this.daoRestaurant = daoRestaurant;
    }

    public RestaurantServiceImpl() {

    }

    public RestaurantServiceImpl(IDaoRestaurant daoRestaurant) {

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
