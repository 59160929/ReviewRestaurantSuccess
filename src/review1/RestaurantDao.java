/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.awt.List;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 59160929
 */
public class RestaurantDao implements DaoReview<Restaurant> {

    @Override
    public ArrayList<Restaurant> getRestaurant() {
        ArrayList<Restaurant> restaurant = new ArrayList<>();
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String countfromdatabase = "Select * From Restaurant";
            ResultSet rs = st.executeQuery(countfromdatabase);

            while (rs.next()) {
                restaurant.add(new Restaurant(rs.getInt("idRestaurant"), rs.getString("NameRestaurant"), rs.getString("AddressRestaurant"),
                        rs.getString("DescribtionRestaurant"), rs.getInt("Count"), rs.getInt("Point"), rs.getInt("Restarantnearby1"),
                        rs.getInt("Restarantnearby2"), rs.getInt("Restarantnearby3"), rs.getString("Province"), rs.getDouble("Rating"), rs.getString("linkImage")));
            }
              
               connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(RestaurantDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return restaurant;
    }

    public static boolean updatePointAndCount(String IDRestaurant, int count, int point) {
        ArrayList<Restaurant> restaurant = new ArrayList<>();
        try {
            PreparedStatement pst;
            Connection connection;

            String keepIDrestaurant = "" + IDRestaurant;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            connection.createStatement();

            String sql = "update Restaurant SET Count = ? , Point= ? WHERE idRestaurant = " + keepIDrestaurant;
            pst = connection.prepareStatement(sql);

            pst.setInt(1, count);
            pst.setInt(2, point);
            pst.executeUpdate();
               connection.close();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public static boolean updateRating(String IDRestaurant, double getrating) {

        ArrayList<Restaurant> restaurant = new ArrayList<>();
        try {
            PreparedStatement pst;
            Connection connection;

            String keepIDrestaurant = "" + IDRestaurant;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            connection.createStatement();

            String sql = "update Restaurant SET Rating = ?  WHERE idRestaurant = " + keepIDrestaurant;
            pst = connection.prepareStatement(sql);

            pst.setDouble(1, 10000);

            pst.executeUpdate();
               connection.close();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }


}
