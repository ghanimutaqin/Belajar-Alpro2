package fix;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        buttonlogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setText("Form Login");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(61, 61, 61))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        user.setBackground(new java.awt.Color(204, 204, 204));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        pass.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\Capture.PNG")); // NOI18N

        buttonlogin.setBackground(new java.awt.Color(0, 153, 153));
        buttonlogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonlogin.setText("Login");
        buttonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonloginActionPerformed(evt);
            }
        });
        buttonlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonloginKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(47, 47, 47)
                        .addComponent(buttonlogin)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(132, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(70, 70, 70)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed

    }//GEN-LAST:event_userActionPerformed

    private void buttonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonloginActionPerformed
        String Usernamearrazi = "10009";
        String Usernameghazali = "1009";
        String Usernameghazali1 = "1007";
        String Usernamesina = "2009";
        String Usernamekhaldun = "3009";
        String Usernamerusydi = "4009";
        String Usernamefaraby = "5009";
        String Usernamefaza = "6009";
        String Usernameusa = "7009";
        String Usernameaba = "8009";
        String Usernamekd = "9009";

        String Passarrazi = "1010";
        String Passghazali = "1111";
        String Passghazali1 = "1212";
        String Passsina = "2222";
        String Passkhaldun = "3333";
        String Passrusydi = "4444";
        String Passfaraby = "5555";

        String Passfaza = "6666";
        String Passusa = "7777";
        String Passaba = "8888";
        String Passkd = "9999";

        if (Usernamearrazi.equals(user.getText()) && Passarrazi.equals(pass.getText())) {
            ar_razi call = new ar_razi();//manggil kelas
            call.setVisible(true);//set menampilkan, true akan tampil, false tak tzmpil
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            //this.visible(false);
           this.dispose();//untuk ngilangin pas login
        } else if (Usernameghazali.equals(user.getText()) && Passghazali.equals(pass.getText())) {
            ghazali call = new ghazali();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
        } else if (Usernameghazali1.equals(user.getText()) && Passghazali1.equals(pass.getText())) {
            ghazali call = new ghazali();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
        } else if (Usernamesina.equals(user.getText()) && Passsina.equals(pass.getText())) {
            sina call = new sina();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
        } else if (Usernamekhaldun.equals(user.getText()) && Passkhaldun.equals(pass.getText())) {
            khaldun call = new khaldun();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
        } else if (Usernamerusydi.equals(user.getText()) && Passrusydi.equals(pass.getText())) {
            rusydi call = new rusydi();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
        } else if (Usernamefaraby.equals(user.getText()) && Passfaraby.equals(pass.getText())) {
            faraby call = new faraby();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
        } else if (Usernamefaza.equals(user.getText()) && Passfaza.equals(pass.getText())) {
            faza call = new faza();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
        } else if (Usernameusa.equals(user.getText()) && Passusa.equals(pass.getText())) {
            usa call = new usa();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
        } else if (Usernameaba.equals(user.getText()) && Passaba.equals(pass.getText())) {
            aba call = new aba();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
        } else if (Usernamekd.equals(user.getText()) && Passkd.equals(pass.getText())) {
            kd call = new kd();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
        } else {
            JOptionPane.showMessageDialog(null, "Masukan Username dan Password Yang Benar");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonloginActionPerformed

    private void buttonloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonloginKeyPressed
       String Usernameghazali = "1009";
       String Passghazali = "1111";
       
       if (Usernameghazali.equals(user.getText()) && Passghazali.equals(pass.getText())) {
            ghazali call = new ghazali();
            call.setVisible(true);
            call.pack();
            call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            call.setLocationRelativeTo(null);
            this.dispose();//untuk ngilangin pas login
            
            } else {
            JOptionPane.showMessageDialog(null, "Masukan Username dan Password Yang Benar");
        }
    }//GEN-LAST:event_buttonloginKeyPressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonlogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    private void visible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
