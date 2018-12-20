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
import review1.db;

/**
 *
 * @author ADMIN
 */
public class CommentDaoImpl implements CommentDao<Comment> {

    ArrayList<Comment> comment = new ArrayList<>();

    @Override
    public void insert(Comment comment) {
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String query = "insert into comment (id_comment,id_user,id_Restaurant,comment) values (NULL,?,?,?)";
            PreparedStatement preparedStmt = connection.prepareStatement(query);

            preparedStmt.setInt(1, comment.getIduser());
            preparedStmt.setInt(2, comment.getIdrestaurant());
            preparedStmt.setString(3, comment.getComment());
            preparedStmt.executeUpdate();
            preparedStmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(CommentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Comment comment, int idComment) {
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String query1 = "UPDATE comment SET comment= ? WHERE id_comment= ?  ";
            try (PreparedStatement preparedStmt = connection.prepareStatement(query1)) {
                preparedStmt.setString(1, comment.getComment());
                preparedStmt.setInt(2, idComment);

                preparedStmt.executeUpdate();
                preparedStmt.close();

            } catch (SQLException ex) {
                Logger.getLogger(CommentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CommentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(int idComment) {
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String query = "DELETE FROM comment WHERE id_comment = ?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, idComment);

            preparedStmt.executeUpdate();
            preparedStmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(CommentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<Comment> getAll() {

        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String countfromdatabase = "Select * From comment";
            ResultSet rs = st.executeQuery(countfromdatabase);

            while (rs.next()) {
                comment.add(new Comment(rs.getInt("id_comment"), rs.getInt("id_user"), rs.getInt("id_Restaurant"), rs.getString("comment")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CommentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comment;
    }

}
