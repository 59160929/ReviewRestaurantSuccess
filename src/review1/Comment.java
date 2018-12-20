/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

/**
 *
 * @author ADMIN
 */
public class Comment {

    private int idcomment;
    private int iduser;
    private int idrestaurant;
    private String comment;

    public Comment(int idcomment, int iduser, int idrestaurant, String comment) {
        this.idcomment = idcomment;
        this.iduser = iduser;
        this.idrestaurant = idrestaurant;
        this.comment = comment;
    }

    Comment() {

    }

    @Override
    public String toString() {
        return "Comment{" + "idcomment=" + idcomment + ", iduser=" + iduser + ", idrestaurant=" + idrestaurant + ", comment=" + comment + '}';
    }

    public int getIdcomment() {
        return idcomment;
    }

    public int getIduser() {
        return iduser;
    }

    public int getIdrestaurant() {
        return idrestaurant;
    }

    public String getComment() {
        return comment;
    }

    public void setIdcomment(int idcomment) {
        this.idcomment = idcomment;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setIdrestaurant(int idrestaurant) {
        this.idrestaurant = idrestaurant;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
