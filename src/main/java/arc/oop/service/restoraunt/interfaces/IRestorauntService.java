package arc.oop.service.restoraunt.interfaces;

import arc.oop.model.restorant.Restaurant;

import java.util.List;

/**
 * Created by initium on 26.03.17.
 */
public interface IRestorauntService {
    List<Restaurant> getAll();
    Restaurant getRestaurant(int id);
    void createRestaurant(Restaurant restaurant);
    void updateRestaurant(Restaurant restaurant);
    void deleteRestaurant(int id);
    void showAll();
}
