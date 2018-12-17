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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 59160929
 */
public class StatusDao implements DaoStatus<Status> {


    public ArrayList<Status> getStatus() {
        ArrayList<Status> status = new ArrayList<>();
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String countfromdatabase = "Select * From Status";
            ResultSet rs = st.executeQuery(countfromdatabase);

            while (rs.next()) {
                status.add(new Status(rs.getInt("idStatus"), rs.getInt("idUser"), rs.getInt("isREstaurant"),rs.getInt("Status")));
            }
              
               connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(RestaurantDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

   

}

    

