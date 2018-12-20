/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public  interface UserDao<User> {
     
    ArrayList<User> getAll();

    void insert(User user);

    void update(User user, int idUser);

    void delete(int idUser);

    String getById(String idUser);
}
