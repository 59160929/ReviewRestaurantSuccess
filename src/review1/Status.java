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
    
    public Status(){
    
    }
     public Status(int idStatus,int idUser,int idRestaurant,int status) {
                  this.idStatus = idStatus;

         this.idUser = idUser;
        this.idRestaurant = idRestaurant;
        this.status = status;

    }
     
      public void idStatus(int idStatus) {
        this.idStatus = idStatus;
    }
   public void setidUser(int idUser) {
        this.idUser = idUser;
    }
   
     public void setidRestaurant(int idUser) {
        this.idRestaurant = idRestaurant;
    }
    public void setstatus(int status) {
        this.status = status;
    }


    public int getidUser() {
        return idUser;
    }
     public int getidRestaurant() {
        return idRestaurant;
    }
        public int getStatus() {
        return status;
    }


   

}
