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

/**
 *
 * @author 59160929
 */
public class ReviewPostService {

    private static DaoReview restaurantDao;
  private static DaoReview restaurant;  

    public static ArrayList<Restaurant> getLinkImage() {

        restaurantDao = new RestaurantDao();

        return restaurantDao.getRestaurant();
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
            double point = restaurant.get(IDRestaurant).getPoint()+0.00;
            return point;

        }
        return 0.00;
    }

    public static double getCount(int IDRestaurant) {
        ArrayList<Restaurant> restaurant = getLinkImage();
        IDRestaurant = IDRestaurant - 1;
        System.out.println(IDRestaurant);
                
        for (int i = 1; i < restaurant.size(); i++) {
            double count=restaurant.get(IDRestaurant).getCount()+0.00;
            return count;

        }   
        return 0.00;
    }

    public static double getRating(int IDRestaurant) {
        ArrayList<Restaurant> restaurant = getLinkImage();
        IDRestaurant = IDRestaurant - 1;

        for (int i = 1; i < restaurant.size(); i++) {
            
            return restaurant.get(IDRestaurant).getRating();

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

    public static boolean addStatus(int IDRestaurant, int user) {
        ArrayList<Restaurant> restaurant = new ArrayList<>();

   
        try {
            PreparedStatement pst;
            Connection connection;

            connection = DriverManager.getConnection(db.url, db.username, db.password);
            connection.createStatement();


            String sql = "INSERT INTO Status (idUser,idRestaurant,Status) VALUES (?,?,?) ";
            pst = connection.prepareStatement(sql);

            pst.setInt(1, (int) user);
            pst.setInt(2, (int) IDRestaurant);
            pst.setInt(3, (int) 1);
            pst.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean updatePointAndCount(int IDRestaurant, int count, int point) {
        ArrayList<Restaurant> restaurant = new ArrayList<>();

        double getpoint = getPoint(IDRestaurant);
        getpoint = getpoint + point;
        double getcount = getCount(IDRestaurant);
        getcount = getcount + count;

        try {
            PreparedStatement pst;
            Connection connection;

            String keepIDrestaurant = "" + IDRestaurant;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            connection.createStatement();

            String sql = "update Restaurant SET Count = ? ,Point = ? WHERE idRestaurant = " + keepIDrestaurant;
            pst = connection.prepareStatement(sql);

            pst.setInt(1, (int) getcount);
            pst.setInt(2, (int) getpoint);
            pst.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean updateRating(int IDRestaurant, double rating) {
        ArrayList<Restaurant> restaurant = new ArrayList<>();

        double getrating = getRating(IDRestaurant);
        getrating = getrating + rating;

        try {
            PreparedStatement pst;
            Connection connection;

            String keepIDrestaurant = "" + IDRestaurant;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            connection.createStatement();

            String sql = "update Restaurant SET Rating = ? WHERE idRestaurant = " + keepIDrestaurant;
            pst = connection.prepareStatement(sql);

            pst.setDouble(1, (double) getrating);

            pst.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Restaurant> restaurant = getLinkImage();
        //  updatePointAndCount(2,1,5);
        System.out.print("ok");
        System.out.println(getCount(2));
        System.out.println(getPoint(2));
        updatePointAndCount(2, 1, 25);

    }

}
