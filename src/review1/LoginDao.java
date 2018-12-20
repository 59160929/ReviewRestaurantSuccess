package review1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import review1.db;
import review1.db;


public class LoginDao {
    static PreparedStatement pst;
    static Connection connection;

    public static User getUser(String username, String password) throws SQLException {
        try{
        User user=null;
           // System.out.println("555");
        connection = DriverManager.getConnection(db.url, db.username, db.password);
        connection.createStatement();
        pst = connection.prepareStatement("Select * from User where Name = '"+username+"' AND Password= '"+password+"'");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            user = new User(rs.getInt("idUser"),rs.getString("Username"),rs.getString("Password"),rs.getString("session"));  
        }
        connection.close();

        return user;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
        
    
    }

    static int getUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
