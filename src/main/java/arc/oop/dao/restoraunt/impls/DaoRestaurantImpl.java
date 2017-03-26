package arc.oop.dao.restoraunt.impls;

import arc.oop.dao.restoraunt.interfaces.IDaoRestaurant;
import arc.oop.model.restorant.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by initium on 24.03.17.
 */
public class DaoRestaurantImpl implements IDaoRestaurant {
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public DaoRestaurantImpl() {

    }

    public DaoRestaurantImpl(List<Restaurant> restaurants) {

        this.restaurants = restaurants;
    }

    public List<Restaurant> restaurants = new ArrayList<Restaurant>();

    public List<Restaurant> getAll() {
        return restaurants;
    }

    public Restaurant  getRestaurant(int id) {
        Restaurant result = null;
        for (  Restaurant item: restaurants
                ) {
            if (item.getId() == id){
                result = new Restaurant(
                item.getId(),
                item.getFood(),
                item.getPrice());
            }
        }
        return result;
    }

    public void createRestaurant(Restaurant restaurant) {

    }

    public void updateRestaurant(Restaurant restaurant) {
        Restaurant updateRestaurant = null;
        for (Restaurant item : restaurants) {
            if (item.getId() == restaurant.getId()) {
                updateRestaurant = item;
                break;

            }
        }
        updateRestaurant = restaurant;
    }

    public void deleteRestaurant(int id) {
        int i = 0;
        boolean is = false;
        for (Restaurant item : restaurants) {
            if (item.getId() == id) {
                is = true;
                break;
            }
            i++;
        }
        if (is) {
            restaurants.remove(i);
        }
    }

    public void showAll() {

        for (Restaurant item: restaurants
                ) {
            System.out.println(item.toString());
        }
    }

}
