package arc.oop.dao.restaurant.interfaces;

import arc.oop.model.restaurant.Restaurant;

import java.util.List;

/**
 * Created by initium on 23.03.17.
 */
public interface IDaoRestaurant {
    List<Restaurant> getAll();
    Restaurant getRestaurant(int id);
    void createRestaurant(Restaurant restaurant);
    void updateRestaurant(Restaurant restaurant);
    void deleteRestaurant(int id);
    void showAll();
}
