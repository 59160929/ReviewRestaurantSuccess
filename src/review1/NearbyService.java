/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.util.ArrayList;
import review1.Restaurant;

/**
 *
 * @author Admin
 */
public class NearbyService {
   public static ArrayList<Restaurant> getData() {
        NearbyDao data = new NearbyDao();
        return data.getRestaurant();
    }
      
}
