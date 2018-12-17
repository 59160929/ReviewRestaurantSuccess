/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author KirkThunder
 */
public class Review extends javax.swing.JFrame {

    ReviewPostService Reviewdao = new ReviewPostService();

    /**
     * Creates new form Review
     */
    private int IDRestaurant;
    private int user=0;
     String userid =null;
    public Review(int user,int x) {
        
        if(user == 1 ){
             userid = "golf";
        }
        else 
            userid = "michel";
        
        IDRestaurant = x;

        initComponents();
    }

    public Review() {

        initComponents();
    }

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        point1 = new javax.swing.JButton();
        point2 = new javax.swing.JButton();
        point3 = new javax.swing.JButton();
        point4 = new javax.swing.JButton();
        point5 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        userlbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Namelbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnNearby1 = new javax.swing.JButton();
        btnNearby2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        NameRestaurant = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Addresslbl1 = new javax.swing.JLabel();
        Reviewlbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1070, 690));
        setMinimumSize(new java.awt.Dimension(1070, 690));
        setPreferredSize(new java.awt.Dimension(1070, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(231, 231, 252));
        jPanel2.setMinimumSize(new java.awt.Dimension(1070, 690));

        jLabel7.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ให้คะเเนนร้านอาหาร");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("point");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel12AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        point1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        point1.setText("1");
        point1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point1ActionPerformed(evt);
            }
        });

        point2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        point2.setText("2");
        point2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point2ActionPerformed(evt);
            }
        });

        point3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        point3.setText("3");
        point3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point3ActionPerformed(evt);
            }
        });

        point4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        point4.setText("4");
        point4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point4ActionPerformed(evt);
            }
        });

        point5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        point5.setText("5");
        point5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point5ActionPerformed(evt);
            }
        });

        jProgressBar1.setMaximum(5);
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        userlbl.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                userlblAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(point1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(point2)
                                .addGap(24, 24, 24)
                                .addComponent(point3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(point4)
                                .addGap(18, 18, 18)
                                .addComponent(point5))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(userlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(708, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(userlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(point5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(point2)
                        .addComponent(point3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(point4))
                    .addComponent(point1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(506, 506, 506))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 0, 370, 200));

        jPanel1.setBackground(new java.awt.Color(247, 251, 247));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("http://do9.xyz/upload/images/2018/12/10/review2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel16.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel16AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 290, 50));

        jPanel3.setBackground(new java.awt.Color(247, 251, 247));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("Address");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(198, 75, 160, 48);

        jLabel15.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        jLabel15.setText("get address restaurant");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(58, 141, 652, 38);

        jLabel17.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        jLabel17.setText("get review restaurant");
        jLabel17.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel17ComponentAdded(evt);
            }
        });
        jLabel17.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel17AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(jLabel17);
        jLabel17.setBounds(58, 0, 1204, 44);

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("Address");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(717, 158, 135, 48);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, 180, -1, 240));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 153));
        jLabel19.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("http://do9.xyz/upload/images/2018/12/10/address.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 300, 40));

        Namelbl.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        Namelbl.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                NamelblAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(Namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 680, 50));

        jPanel4.setBackground(new java.awt.Color(251, 229, 229));

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 153));
        jLabel20.setText("        Comment");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("เเสดงความคิดเห็น");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 153));
        jLabel22.setText("Lasted Comment");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 187, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 670, 350));

        jPanel5.setBackground(new java.awt.Color(251, 229, 229));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 153));
        jLabel21.setText("Restaurant Nearby");

        btnNearby1.setText("A");

        btnNearby2.setText("C");

        jButton13.setText("B");

        NameRestaurant.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        NameRestaurant.setForeground(new java.awt.Color(255, 0, 153));
        NameRestaurant.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                NameRestaurantAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNearby1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNearby2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNearby1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNearby2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 370, 220));

        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 370, 220));

        Addresslbl1.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        Addresslbl1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Addresslbl1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(Addresslbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 680, 50));

        Reviewlbl1.setFont(new java.awt.Font("Angsana New", 0, 20)); // NOI18N
        Reviewlbl1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Reviewlbl1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(Reviewlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 680, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   ReviewPostService reviewPostService = new ReviewPostService();

    //private int idRestaurant = Index.x ;
    private int count = 1;
    private int point = 0;
  

    
    
    public void showAvarage() {
        
        double average = reviewPostService.getAverage(IDRestaurant);
        
        String getaverage= average+"";

        getaverage = String.format("%.2f", average+0.00);

        jLabel12.setText(getaverage);
        
    }

    public void showNameRestaurant() {
        Namelbl.setText("" + reviewPostService.getNameRestaurant(IDRestaurant));

    }

    public void showDescribtion() {
        Reviewlbl1.setText("" + reviewPostService.getDescribtionRestaurant(IDRestaurant));

    }

    public void showAddressRestaurant() {
        Addresslbl1.setText("" + reviewPostService.getAddressRestaurant(IDRestaurant));

    }

    public void point(int x) throws SQLException {
        point = x;

        
        
        if (reviewPostService.updatePointAndCount(IDRestaurant, 1, point) == true) {
            
            
            if(reviewPostService.updateRating(IDRestaurant) == true){

               if(reviewPostService.addStatus(IDRestaurant,user) == true){ 
            JOptionPane.showMessageDialog(this, "ให้คะเเนนเรียบร้อยเเล้ว");

               }
               else if(reviewPostService.addStatus(IDRestaurant,user) == false){ 
                JOptionPane.showMessageDialog(this, "คุณให้คะเเนนเเล้ว");

               }

            }
        }
    }


    private void jLabel17AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel17AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17AncestorAdded

    private void jLabel17ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel17ComponentAdded

        //เเสดง

    }//GEN-LAST:event_jLabel17ComponentAdded

    private void NameRestaurantAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_NameRestaurantAncestorAdded
        showNameRestaurant();
    }//GEN-LAST:event_NameRestaurantAncestorAdded

    private void jLabel12AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel12AncestorAdded

        showAvarage();


    }//GEN-LAST:event_jLabel12AncestorAdded

    private void point1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point1ActionPerformed

        try {
            // 1 point
            point(1);
                    showAvarage();

        } catch (SQLException ex) {
            Logger.getLogger(Review.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_point1ActionPerformed

    private void point2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point2ActionPerformed

        try {
            // 2 point
            point(2);
                    showAvarage();

        } catch (SQLException ex) {
            Logger.getLogger(Review.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_point2ActionPerformed

    private void point3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point3ActionPerformed

        try {
            // 3 point
            point(3);
                  showAvarage();

        } catch (SQLException ex) {
            Logger.getLogger(Review.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_point3ActionPerformed

    private void point4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point4ActionPerformed

        try {
            // 4 point
            point(4);
                 showAvarage();

        } catch (SQLException ex) {
            Logger.getLogger(Review.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_point4ActionPerformed

    private void point5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point5ActionPerformed

        try {
            // 5 point
            point(5);
              showAvarage();

        } catch (SQLException ex) {
            Logger.getLogger(Review.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_point5ActionPerformed

    private void NamelblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_NamelblAncestorAdded
        showNameRestaurant();
    }//GEN-LAST:event_NamelblAncestorAdded

    private void jLabel16AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel16AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded

        Image image = null;
        try {
            String link;
            link = ReviewPostService.getLink(IDRestaurant);
            URL url = new URL(link);
            image = ImageIO.read(url);
            ImageIcon image3 = new ImageIcon(image);
            jLabel2.setIcon(image3);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jLabel2AncestorAdded

    private void Addresslbl1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Addresslbl1AncestorAdded
        showAddressRestaurant();
    }//GEN-LAST:event_Addresslbl1AncestorAdded

    private void Reviewlbl1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Reviewlbl1AncestorAdded
        showDescribtion();


    }//GEN-LAST:event_Reviewlbl1AncestorAdded

    private void userlblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_userlblAncestorAdded
                userlbl.setText(userid);


    }//GEN-LAST:event_userlblAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Review().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addresslbl1;
    private javax.swing.JLabel NameRestaurant;
    private javax.swing.JLabel Namelbl;
    private javax.swing.JLabel Reviewlbl1;
    private javax.swing.JButton btnNearby1;
    private javax.swing.JButton btnNearby2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton point1;
    private javax.swing.JButton point2;
    private javax.swing.JButton point3;
    private javax.swing.JButton point4;
    private javax.swing.JButton point5;
    private javax.swing.JLabel userlbl;
    // End of variables declaration//GEN-END:variables
}
