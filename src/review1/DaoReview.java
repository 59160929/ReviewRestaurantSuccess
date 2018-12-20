/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.util.ArrayList;

/**
 *
 * @author 59160929
 */
public interface DaoReview<T> {
      
    ArrayList<T> getRestaurant();

    public void addStatus(int IDRestaurant, int user, int i);

    public void addStatus(int IDRestaurant, double count, double point);

    public void updateRating(int IDRestaurant, double rating);

    public void updatePointAndCount(int IDRestaurant, double count, double point);
    
}
