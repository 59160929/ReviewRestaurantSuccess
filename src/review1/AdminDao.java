/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import com.sun.javafx.logging.Logger;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import review1.Restaurant;
import review1.db;

/**
 *
 * @author 59160929
 */
public class AdminDao implements Dao<Restaurant> {
    
    public ArrayList<Restaurant> getAll() {
        ArrayList<Restaurant> list = new ArrayList<>();
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String countfromdatabase = "Select idRestaurant,NameRestaurant,linkImage From Restaurant";
            ResultSet rs = st.executeQuery(countfromdatabase);

            while (rs.next()) {
                list.add(new Restaurant(rs.getInt("idRestaurant"), rs.getString("NameRestaurant"), rs.getString("linkImage")));
            }

        } catch (SQLException ex) {

        }
        return list;
    }
    
    public ArrayList<Restaurant> Search(int idRestaurant) {
        ArrayList<Restaurant> list = new ArrayList<>();
        try {
            Connection connection;
           
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();

            String countfromdatabase = "Select * "
                    + "From Restaurant Where idRestaurant = '"+idRestaurant+" '";

            //Select idRestaurant,NameRestaurant,linkImage From u300081131_rev.Restaurant WHERE NameRestaurant="โกหลอ"
            ResultSet rs = st.executeQuery(countfromdatabase);

            while (rs.next()) {
                list.add(new Restaurant(idRestaurant,rs.getString("NameRestaurant"),rs.getString("AddressRestaurant"),rs.getString("DescribtionRestaurant"),rs.getInt("Restarantnearby1"),rs.getInt("Restarantnearby2"),rs.getInt("Restarantnearby3"),rs.getString("Province"),rs.getString("linkImage")));
            }

        } catch (SQLException ex) {

        }
        return list;
    }

    public void Delete(int idRestaurant) {
        try {
           PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String sql = "Delete From Restaurant Where idRestaurant = '"+idRestaurant+" '";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.executeUpdate(sql);
            ps.close();

        } catch (SQLException ex) {

        }

    }
    
       public   void Add(Restaurant restaurant) {

        
             try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String sql1 ="INSERT INTO Restaurant" 
            +"( NameRestaurant, AddressRestaurant, DescribtionRestaurant,Count,Point Restarantnearby1, Restarantnearby2, Restarantnearby3, Province,Rating linkImage)" 
            +"VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = connection.prepareStatement(sql1);

            
            preparedStmt.setString(1, restaurant.getNameRestaurant());
            preparedStmt.setString(2, restaurant.getAddressRestaurant());
             preparedStmt.setString(3, restaurant.getDescribtionRestaurant());
              preparedStmt.setInt(4, 0);
              preparedStmt.setInt(5, 0);
             preparedStmt.setInt(6, restaurant.getRestarantnearby1());
             preparedStmt.setInt(7, restaurant.getRestarantnearby2());
             preparedStmt.setInt(8, restaurant.getRestarantnearby3());
             preparedStmt.setString(9, restaurant.getProvince());
             preparedStmt.setDouble(10, 0.00);
              preparedStmt.setString(11, restaurant.getlinkImage());
              preparedStmt.executeUpdate(sql1);
            preparedStmt.close();

        } catch (SQLException ex) {
           
        }

    }
  
    public void UpdateTest(Restaurant restaurant, int id) {
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            
            String sql = "UPDATE Restaurant SET NameRestaurant = ?, AddressRestaurant = ?, DescribtionRestaurant = ?, Restarantnearby1 = ?, Restarantnearby2 = ?, Restarantnearby3 = ?, Province = ?, linkImage = ? WHERE idRestaurant = ?"+id;
            PreparedStatement preparedStmt = connection.prepareStatement(sql);
            preparedStmt = connection.prepareStatement(sql);
            
            preparedStmt.setString(1,restaurant.getNameRestaurant());
            preparedStmt.setString(2,restaurant.getAddressRestaurant());
            preparedStmt.setString(3,restaurant.getDescribtionRestaurant());
            preparedStmt.setInt(4,restaurant.getRestarantnearby1());
            preparedStmt.setInt(5,restaurant.getRestarantnearby2());
            preparedStmt.setInt(6,restaurant.getRestarantnearby3());
            preparedStmt.setString(7,restaurant.getProvince());
            preparedStmt.setString(8,restaurant.getlinkImage());
            preparedStmt.setInt(9, id);
            
            preparedStmt.executeUpdate(sql);
           

        } catch (SQLException ex) {

        }
        
         

    }

    @Override
    public void insert(Restaurant restaurant) {
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String sql1 ="INSERT INTO Restaurant" 
            +"( NameRestaurant, AddressRestaurant, DescribtionRestaurant,Count,Point Restarantnearby1, Restarantnearby2, Restarantnearby3, Province,Rating, linkImage)" 
            +"VALUES ("+restaurant.getNameRestaurant()+","+restaurant.getAddressRestaurant()+","+restaurant.getDescribtionRestaurant()+","+0+","+0+","+restaurant.getRestarantnearby1()+","+restaurant.getRestarantnearby2()+","+restaurant.getRestarantnearby3()+","+restaurant.getProvince()+","+0.0+","+restaurant.getlinkImage()+")";
            PreparedStatement preparedStmt = connection.prepareStatement(sql1);

            /*
            preparedStmt.setString(1, restaurant.getNameRestaurant());
            preparedStmt.setString(2, restaurant.getAddressRestaurant());
            preparedStmt.setString(3, restaurant.getDescribtionRestaurant());
            preparedStmt.setInt(4, 0);
            preparedStmt.setInt(5, 0);
            preparedStmt.setInt(6, restaurant.getRestarantnearby1());
            preparedStmt.setInt(7, restaurant.getRestarantnearby2());
            preparedStmt.setInt(8, restaurant.getRestarantnearby3());
            preparedStmt.setString(9, restaurant.getProvince());
            preparedStmt.setDouble(10, 0.0);
            preparedStmt.setString(11, restaurant.getlinkImage());*/
            
            preparedStmt.executeUpdate();
            preparedStmt.close();

        } catch (SQLException ex) {
           
        }
        
    }

    @Override
    public void update(Restaurant restaurant, int id) {
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            
            String sql = "UPDATE Restaurant SET NameRestaurant = ?, AddressRestaurant = ?, DescribtionRestaurant = ?, Restarantnearby1 = ?, Restarantnearby2 = ?, Restarantnearby3 = ?, Province = ?, linkImage = ? WHERE idRestaurant = ? ";
            PreparedStatement preparedStmt = connection.prepareStatement(sql);
            
            preparedStmt.setString(1,restaurant.getNameRestaurant());
            preparedStmt.setString(2,restaurant.getAddressRestaurant());
            preparedStmt.setString(3,restaurant.getDescribtionRestaurant());
            preparedStmt.setInt(4,restaurant.getRestarantnearby1());
            preparedStmt.setInt(5,restaurant.getRestarantnearby2());
            preparedStmt.setInt(6,restaurant.getRestarantnearby3());
            preparedStmt.setString(7,restaurant.getProvince());
            preparedStmt.setString(8,restaurant.getlinkImage());
            preparedStmt.setInt(9, id);
            
            preparedStmt.executeUpdate();
           

        } catch (SQLException ex) {

        }

    }

    @Override
    public void dalate(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



   

        

    }
   

 


