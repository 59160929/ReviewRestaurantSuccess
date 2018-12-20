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
import javax.persistence.EntityManager;
import review1.User;
import review1.db;

/**
 *
 * @author ADMIN
 */
public class UserDaoImpl implements UserDao<User> {

    private EntityManager entityManager;

    @Override
    public void insert(User t) {
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String query = "insert into User (Username,Password,session) values (?,?,'user')";
            PreparedStatement preparedStmt = connection.prepareStatement(query);

            preparedStmt.setString(1, t.getName());
            preparedStmt.setString(2, t.getPassword());

            preparedStmt.executeUpdate();
            preparedStmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(CommentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(User t, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getById(String idUser) {
        String userName = null;
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();

            String keepIDUser = "" + idUser;
            String countfromdatabase = "Select Name From User WHERE idUser= " + keepIDUser;
            ResultSet rs = st.executeQuery(countfromdatabase);
            if (rs.next()) {

                userName = rs.getString("Name");

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userName;
    }

    @Override
    public ArrayList<User> getAll() {
        ArrayList<User> user = new ArrayList<>();
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String countfromdatabase = "Select * From User";
            ResultSet rs = st.executeQuery(countfromdatabase);

            while (rs.next()) {
                user.add(new User(rs.getInt("idUser"), rs.getString("Username"), rs.getString("Password"),rs.getString("Session")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CommentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

}
