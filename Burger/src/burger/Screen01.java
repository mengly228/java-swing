package burger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Screen01 extends javax.swing.JFrame {

    public Screen01() {
        initComponents();
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        bt_register = new burger.MyButton();
        bt_login1 = new burger.MyButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1215, 835));
        setMinimumSize(new java.awt.Dimension(1215, 835));
        getContentPane().setLayout(null);

        text.setBackground(new java.awt.Color(255, 255, 255));
        text.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setText("FAQ");
        getContentPane().add(text);
        text.setBounds(950, 60, 70, 40);

        text1.setBackground(new java.awt.Color(255, 255, 255));
        text1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setText("Home");
        getContentPane().add(text1);
        text1.setBounds(450, 60, 80, 40);

        text2.setBackground(new java.awt.Color(255, 255, 255));
        text2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setText("Menu");
        getContentPane().add(text2);
        text2.setBounds(550, 60, 80, 40);

        text3.setBackground(new java.awt.Color(255, 255, 255));
        text3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.setText("About us");
        getContentPane().add(text3);
        text3.setBounds(650, 60, 160, 40);

        text4.setBackground(new java.awt.Color(255, 255, 255));
        text4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        text4.setForeground(new java.awt.Color(255, 255, 255));
        text4.setText("Contact us");
        getContentPane().add(text4);
        text4.setBounds(790, 60, 160, 40);

        bt_register.setBackground(new java.awt.Color(255, 0, 0));
        bt_register.setForeground(new java.awt.Color(255, 255, 255));
        bt_register.setText("Register");
        bt_register.setBorderColor(new java.awt.Color(255, 0, 0));
        bt_register.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bt_register.setRadius(30);
        bt_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registerMouseClicked(evt);
            }
        });
        bt_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registerActionPerformed(evt);
            }
        });
        getContentPane().add(bt_register);
        bt_register.setBounds(120, 530, 310, 50);

        bt_login1.setBackground(new java.awt.Color(255, 0, 0));
        bt_login1.setForeground(new java.awt.Color(255, 255, 255));
        bt_login1.setText("LOGIN");
        bt_login1.setBorderColor(new java.awt.Color(255, 0, 0));
        bt_login1.setRadius(30);
        bt_login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_login1MouseClicked(evt);
            }
        });
        bt_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_login1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_login1);
        bt_login1.setBounds(1030, 60, 100, 40);

        bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\simple\\Untitled-1.jpg")); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(-5, 0, 1210, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection connection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase29", "root", "");
            System.out.println("Succecefull.....");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Screen01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Screen01.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }


    private void bt_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_registerActionPerformed

    private void bt_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_login1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_login1ActionPerformed

    private void bt_login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_login1MouseClicked
        // TODO add your handling code here:
        Screen02 sc2 = new Screen02();
        sc2.show();
        dispose();
    }//GEN-LAST:event_bt_login1MouseClicked

    private void bt_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registerMouseClicked
        // TODO add your handling code here:
        Screen02 sc2 = new Screen02();
        sc2.show();
        dispose();
    }//GEN-LAST:event_bt_registerMouseClicked

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
            java.util.logging.Logger.getLogger(Screen01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private burger.MyButton bt_login1;
    private burger.MyButton bt_register;
    private javax.swing.JLabel text;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    // End of variables declaration//GEN-END:variables
}
