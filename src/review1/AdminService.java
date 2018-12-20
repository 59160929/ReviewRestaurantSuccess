/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import review1.Restaurant;


/**
 *
 * @author 59160929
 */
public class AdminService {

  

    private Dao AdminDao ;
    
       public  ArrayList<Restaurant> Search(int idRestaurant)   {
      
        AdminDao data = new AdminDao();
        return data.Search(idRestaurant);
      }
        

     
    public static ArrayList<Restaurant> getData() {
        AdminDao data = new AdminDao();
        return data.getAll();
    }
    
     public void Delete(int idRestaurant)  {
      
        AdminDao data = new AdminDao();
        data.Delete(idRestaurant);
         
      } 
      public void AddRestaruant(Restaurant restaurant)  {
      
        AdminDao = new AdminDao();
        AdminDao.insert(restaurant);
         
      } 
      
   
     
     public  void update(Restaurant restaurant, int id ){
        // AdminDao.UpdateTest(restaurant, id);
         AdminDao = new AdminDao();
         AdminDao.update(restaurant, id);
         
         
     }
     
//     public static void main(String [] args){
//         
//         
//     }

   
   
   

   

   

   

   
}
