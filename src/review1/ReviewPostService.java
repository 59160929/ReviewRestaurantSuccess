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
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author 59160929
 */
public class ReviewPostService {

    private static DaoReview restaurantDao;
    private static DaoReview restaurant;
    private static DaoStatus daoStatus;

    public static ArrayList<Restaurant> getLinkImage() {

        restaurantDao = new RestaurantDao();

        return restaurantDao.getRestaurant();
    }

    public static ArrayList<Status> getid() {

        daoStatus = new StatusDao();

        return daoStatus.getStatus();
    }

    public static String getLink(int IDRestaurant) {
        ArrayList<Restaurant> restaurant = getLinkImage();
        IDRestaurant = IDRestaurant - 1;

        for (int i = 0; i < restaurant.size(); i++) {
            return restaurant.get(IDRestaurant).getlinkImage();
        }
        return "";
    }

    public static double getPoint(int IDRestaurant) {
        ArrayList<Restaurant> restaurant = getLinkImage();
        IDRestaurant = IDRestaurant - 1;

        for (int i = 0; i < restaurant.size(); i++) {
            double point = restaurant.get(IDRestaurant).getPoint() + 0.00;
            return point;
        }

        return 0.00;
    }

    public static double getCount(int IDRestaurant) {
        ArrayList<Restaurant> restaurant = getLinkImage();
        IDRestaurant = IDRestaurant - 1;
        System.out.println(IDRestaurant);

        for (int i = 1; i < restaurant.size(); i++) {
            double count = restaurant.get(IDRestaurant).getCount() + 0.00;
            return count;

        }
        return 0.00;
    }

   
    public static double getAverage(int IDRestaurant) {
        ArrayList<Restaurant> restaurant = getLinkImage();

        for (int i = 0; i < restaurant.size(); i++) {
            double getpoint = getPoint(IDRestaurant);
            double getcount = getCount(IDRestaurant);

            return getpoint / getcount;

        }
        return 0.00;
    }

    public static String getNameRestaurant(int IDRestaurant) {
        ArrayList<Restaurant> restaurant = getLinkImage();
        IDRestaurant = IDRestaurant - 1;

        for (int i = 0; i < restaurant.size(); i++) {

            String name = restaurant.get(IDRestaurant).getNameRestaurant();

            return name;

        }
        return "";

    }

    public static String getDescribtionRestaurant(int IDRestaurant) {
        ArrayList<Restaurant> restaurant = getLinkImage();
        IDRestaurant = IDRestaurant - 1;

        for (int i = 0; i < restaurant.size(); i++) {

            String describtion = restaurant.get(IDRestaurant).getDescribtionRestaurant();

            return describtion;

        }
        return "";

    }

    public static String getAddressRestaurant(int IDRestaurant) {
        ArrayList<Restaurant> restaurant = getLinkImage();
        IDRestaurant = IDRestaurant - 1;

        for (int i = 0; i < restaurant.size(); i++) {

            String addressRestaurant = restaurant.get(IDRestaurant).getAddressRestaurant();

            return addressRestaurant;

        }
        return "";

    }

    public static int getStatus(int IDRestaurant, int user) {
        ArrayList<Status> status = getStatus();
        //IDRestaurant = IDRestaurant - 1;
        int x = 1;

        for (int i = 0; i < status.size(); i++) {
            if (status.get(i).getIdRestaurant() == IDRestaurant && status.get(i).getIdUser() == user && status.get(i).getStatus() == 1) {
                return x = 2;
            }

        }

        return x;

    }

    public static ArrayList<Status> getStatus() {
          daoStatus = new StatusDao();
          return daoStatus.getStatus();
    }

    public static boolean addStatus(int IDRestaurant, int user) {
        ArrayList<Restaurant> restaurant = new ArrayList<>();

         if (getStatus(IDRestaurant, user) == 1) {
        restaurantDao.addStatus(IDRestaurant, user, user);
        return true;
         }
        return false;
    }

    public static boolean updatePointAndCount(int IDRestaurant, int count, int point) {
        ArrayList<Restaurant> restaurant = new ArrayList<>();

        double getpoint = getPoint(IDRestaurant);
        getpoint = getpoint + point;
        double getcount = getCount(IDRestaurant);
        getcount = getcount + count;
        double getrating = getpoint / getcount;
           restaurantDao.updateRating(IDRestaurant,getrating);
             restaurantDao.updatePointAndCount(IDRestaurant, getcount, getpoint);
        return true;
        
       

         
    }

    

    public static void main(String[] args) {
        ArrayList<Restaurant> restaurant = getLinkImage();
        ArrayList<Status> status = getStatus();
       // System.out.println(getStatus(5, 4));
        
//        for(int i =0 ; i<status.size(); i++){
//            System.out.println(status.get(i).getIdStatus()+" "+ status.get(i).getIdUser());
//        }

    }

}
