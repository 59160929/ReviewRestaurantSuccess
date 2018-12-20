/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.util.ArrayList;

/**
 *
 * @author Evolution Gaming
 */
public interface Dao<Restaurant> {
    
    ArrayList<Restaurant> getAll();
    void insert(Restaurant restaurant);
    void update(Restaurant restaurant,int id);
    void dalate(int id);
    
    
}
