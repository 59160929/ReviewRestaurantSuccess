/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

/**
 *
 * @author 59160929
 */
public final class Status {

    int idStatus;
    int idUser;
    int idRestaurant;
    int status;

    public Status() {

    }

    public Status(int idStatus, int idUser, int idRestaurant, int status) {
        this.idStatus = idStatus;
        this.idUser = idUser;
        this.idRestaurant = idRestaurant;
        this.status = status;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getIdRestaurant() {
        return idRestaurant;
    }

    public int getStatus() {
        return status;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setIdRestaurant(int idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
