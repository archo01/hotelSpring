package arc.oop.controller;

import arc.oop.model.restaurant.Restaurant;
import arc.oop.service.restaurant.impls.RestaurantServiceImpl;
import arc.oop.service.restaurant.interfaces.IRestaurantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by initium on 10.04.17.
 */

@RestController
public class RestaurantController {

    ApplicationContext
            mySpringContext = new
            ClassPathXmlApplicationContext("service-restaurant-context.xml");

    IRestaurantService restaurantService = (RestaurantServiceImpl) mySpringContext.getBean("service_rest");


    @RequestMapping("/api/restaurant/get_all")
    public List<Restaurant> getAll(){
       return restaurantService.getAll();

    }


    @RequestMapping("/api/restaurant/get_restaurant__{id}")
    public Restaurant getRestaurant(@PathVariable int id){
        return restaurantService.getRestaurant(id);

    }

    @RequestMapping("/api/restaurant/create_restaurant__{id}_{food}_{price}")
    public void createRestaurant(@PathVariable int id ,@PathVariable String food ,@PathVariable int price){
        Restaurant restaurant = new Restaurant(id, food, price);
        restaurantService.createRestaurant(restaurant);
    }

    @RequestMapping("/api/restaurant/update_restaurant__{id}_{food}_{price}")
    public void updateRestaurant(@PathVariable int id ,@PathVariable String food ,@PathVariable int price){
        Restaurant restaurant = new Restaurant(id, food, price);
        restaurantService.updateRestaurant(restaurant);
    }

    @RequestMapping("/api/restaurant/delete_restaurant__{id}")
    public void deleteRestaurant(@PathVariable int id){
        restaurantService.deleteRestaurant(id);

    }

    @RequestMapping("/api/restaurant/hello")
    public  String hello(){
        return "hello";
    }
}

