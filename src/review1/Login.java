package review1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import review1.User;

public class Login extends javax.swing.JFrame {

    private RegisterService service = new RegisterService();

    public Login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logintxt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        loginbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        buttonRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1106, 856));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(null);

        logintxt.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        logintxt.setText("Login");
        jPanel1.add(logintxt);
        logintxt.setBounds(460, 0, 250, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 170);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);

        loginbtn.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginbtn);
        loginbtn.setBounds(490, 380, 230, 60);

        clearbtn.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        clearbtn.setText("clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearbtn);
        clearbtn.setBounds(790, 380, 200, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Username");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(270, 130, 150, 70);

        usernamefield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(usernamefield);
        usernamefield.setBounds(500, 120, 430, 80);
        jPanel2.add(passwordfield);
        passwordfield.setBounds(500, 220, 430, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(270, 240, 170, 50);

        buttonRegister.setBackground(new java.awt.Color(255, 153, 51));
        buttonRegister.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        buttonRegister.setText("Register");
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(buttonRegister);
        buttonRegister.setBounds(210, 380, 230, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 170, 1120, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkNull(String username, String password) {

        if (username == "" || password == "") {
            return false;
        }
        return true;
    }


    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        User user = new User();
        String User = usernamefield.getText();

        String Password = new String(passwordfield.getPassword());
        int idUser = 16;
        if (checkNull(User, Password)) {
            /*     try {
                if(LoginService.getUser(User, Password)==null){
                    JOptionPane.showMessageDialog(this, "ลงชื่อเข้าใจสำเร็จ");
             
                    
                    if(User.equals("admingolf")){
        setVisible(false);
       
        AdminForm change = new AdminForm();
        change.setVisible(true);}
                    else{
                        
                        //admin swap
                        setVisible(false);
       
        allRestaurant change = new allRestaurant(idUser,User);
        change.setVisible(true);
                    }
                    
             */

            if (service.checkFieldNull(usernamefield.getText())) {
                JOptionPane.showMessageDialog(this, "กรุณากรอก Username");
            } else if (service.checkFieldNull(passwordfield.getText())) {
                JOptionPane.showMessageDialog(this, "กรุณากรอก Password");
            } else if (!service.checkUsernameExist(usernamefield.getText())) {
                JOptionPane.showMessageDialog(this, "Username นี้ไม่มีในระบบ");
            } else if (!service.checkPasswordExist(passwordfield.getText())) {
                JOptionPane.showMessageDialog(this, "Password ไม่ถูกต้อง");
            } else {

                if (usernamefield.getText().equals("admingolf")) {
                    setVisible(false);

                    AdminForm change = null;
                    try {
                        change = new AdminForm();
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    change.setVisible(true);

                }else if(usernamefield.getText().equals("golf"))  {

                    //admin swap
                    setVisible(false);

                    allRestaurant change = new allRestaurant(idUser, User);
                    change.setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        usernamefield.setText("");
        passwordfield.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        RegisterFrom register = new RegisterFrom();

        register.setVisible(true);
        register.pack();
        register.setLocationRelativeTo(null);
        register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_buttonRegisterActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegister;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel logintxt;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables

}
