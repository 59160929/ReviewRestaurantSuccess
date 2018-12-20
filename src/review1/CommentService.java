/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.util.ArrayList;
import review1.User;

/**
 *
 * @author ADMIN
 */
public class CommentService {

    private static CommentDao commentDAO;
    private static UserDao userADo;

    public static ArrayList<Comment> getComment() {
        commentDAO = new CommentDaoImpl();

        return commentDAO.getAll();
    }

//    public static String getUserById(int idUser) throws SQLException {
//
//        String keepIDUser = "" + idUser;
//        String name;
//        name = userADo.getById(keepIDUser);
//        return name;
//
//    }
    public static String getUserName(int idUser) {
        userADo = new UserDaoImpl();
        ArrayList<User> listUser = userADo.getAll();

        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getIdUser() == idUser) {
                return listUser.get(i).getName();
            }
        }
        return "";
    }

    public void addComment(Comment comment) {
        commentDAO = new CommentDaoImpl();
        commentDAO.insert(comment);
    }

    public void updateComment(Comment comment, int idcomment) {
        commentDAO = new CommentDaoImpl();
        commentDAO.update(comment, idcomment);
    }

    public void deleteComment(int idcomment) {
        commentDAO = new CommentDaoImpl();
        commentDAO.delete(idcomment);

    }

    public boolean checkFieldCommentNull(String text) {
        if (text.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean checkIdUserMatchWithRow(String User, int idUser) {
        if (User.equals(getUserName(idUser))) {
            return true;
        } else {
            return false;
        }
    }

}
