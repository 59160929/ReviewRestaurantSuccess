/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;


 public final class  User {
    private int id;
    private String name;
    private String password;
    private String session;
    Object getSession;
    public User(){
 
    }
    public User(int id,String name,String password, String session){
            this.name = name;
            this.password = password;
            this.session = session;
            
    }
     public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

   
    User(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public int getIdUser() {
        return id;
    }
   public String getName() {
        return name;
   }
    public String getPassword() {
        return password;
   }
      public int getidUser() {
        return id;
   }
       public String getSession() {
        return session;
   }
        public void setIdUser(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     public void setSession(String session) {
        this.session = session;
    }
 }