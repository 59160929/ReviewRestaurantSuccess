package review1;

import java.sql.SQLException;

public interface LoginService {
    public static User getUser(String username, String password) throws SQLException{
        
        return LoginDao.getUser(username, password);
    }
    public static int getidUser(String username,String password) throws SQLException{
       
        return   LoginDao.getUser(username,password).getidUser();

    }

}
