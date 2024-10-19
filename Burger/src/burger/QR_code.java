package burger;

import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DecimalFormat;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class QR_code extends javax.swing.JFrame {

    List<product_food> api = new ArrayList<>();

    private PreparedStatement ps;
    private ResultSet r;
    private String sql;
    private DefaultTableModel model;

    public QR_code() {
        initComponents();
        model = (DefaultTableModel) table_t.getModel();
        Show();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dollar = new javax.swing.JLabel();
        riel = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        aba = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        aclyda = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        khqr = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_t = new javax.swing.JTable();
        tax_t = new javax.swing.JTextField();
        total_t = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bt_signin = new burger.MyButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(471, 790));
        setMinimumSize(new java.awt.Dimension(471, 790));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\360_F_530791557_T8hNharBQQJqmw0R2FRjCrC9CgNwaeui.png")); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(-10, 20, 80, 60);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 30, 450, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bank");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 220, 450, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Total Dollars");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 106, 160, 40);

        dollar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dollar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dollar.setText("0.00");
        getContentPane().add(dollar);
        dollar.setBounds(210, 110, 160, 30);

        riel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        riel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        riel.setText("0.00");
        getContentPane().add(riel);
        riel.setBounds(240, 150, 130, 40);

        body.setLayout(new java.awt.CardLayout());

        aba.setLayout(null);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\QR\\Untitled-1.png")); // NOI18N
        aba.add(jLabel4);
        jLabel4.setBounds(0, 0, 430, 270);

        body.add(aba, "card4");

        aclyda.setLayout(null);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\QR\\deed.png")); // NOI18N
        aclyda.add(jLabel8);
        jLabel8.setBounds(0, 0, 430, 270);

        body.add(aclyda, "card3");

        khqr.setLayout(null);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\QR\\sssd.png")); // NOI18N
        khqr.add(jLabel11);
        jLabel11.setBounds(0, 0, 430, 270);

        body.add(khqr, "card2");

        jPanel2.setLayout(null);

        table_t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Qty", "Price"
            }
        ));
        jScrollPane1.setViewportView(table_t);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 10, 400, 130);
        jPanel2.add(tax_t);
        tax_t.setBounds(110, 210, 190, 40);
        jPanel2.add(total_t);
        total_t.setBounds(110, 160, 190, 40);

        body.add(jPanel2, "card5");

        getContentPane().add(body);
        body.setBounds(10, 380, 430, 270);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Total Riel");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 150, 130, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 33)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("៛");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(360, 150, 40, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("$");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(360, 110, 40, 30);

        bt_signin.setForeground(new java.awt.Color(255, 255, 255));
        bt_signin.setText("Print");
        bt_signin.setBorderColor(new java.awt.Color(255, 0, 51));
        bt_signin.setBorderPainted(false);
        bt_signin.setFont(new java.awt.Font("Segoe UI Semibold", 2, 30)); // NOI18N
        bt_signin.setRadius(50);
        bt_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_signinMouseClicked(evt);
            }
        });
        bt_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_signinActionPerformed(evt);
            }
        });
        jPanel1.add(bt_signin);
        bt_signin.setBounds(150, 670, 150, 60);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\1200x630wa.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 280, 90, 80);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\logo-white.png")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(180, 280, 90, 80);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\7736ae2399f3c7c51519425a7c2e4e14.png")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 280, 90, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 790);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection connection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase29", "root", "");
            System.out.println("Succecefull.....");
        } catch (ClassNotFoundException e) {
            System.err.println("Handle Error by ClassNotFoundException -> " + e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(Screen04.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public void ShowData() {
        DecimalFormat df = new DecimalFormat("#.00");
        double to2 = Double.parseDouble(total_t.getText());
        double tt1 = Double.parseDouble(tax_t.getText());

//        String formattedTotal = df.format(to2);
//        String formattedTax = df.format(tt1);
        // Check if api is empty
        if (api.isEmpty()) {
            System.out.println("No data available for the report.");
            return; // Exit if no data
        }

        // Prepare parameters for the report
        HashMap<String, Object> pr = new HashMap<>();
        pr.put("total", to2);
        pr.put("tax", tt1);

        // Use an Iterator to safely remove elements if needed
        try {
            Iterator<product_food> iterator = api.iterator();
            while (iterator.hasNext()) {
                product_food item = iterator.next();
                // Example: Remove if certain condition is met
                if (item.getQty() < 1) {
                    iterator.remove(); // Safe removal
                }
            }
            // After ensuring no modifications during reporting, create the report
            JasperReport jp = JasperCompileManager.compileReport("src/burger/r29_2.jrxml");
            JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(api);
            JasperPrint print = JasperFillManager.fillReport(jp, pr, jcd);

            // View the report
            JasperViewer.viewReport(print);
        } catch (JRException e) {
            System.err.println("Handle Error by JRException -> " + e.getMessage());
        }
    }

    public void Show() {
        try {
            sql = "SELECT * FROM my_order";
            ps = connection().prepareStatement(sql);
            r = ps.executeQuery();
            while (r.next() == true) {
                int id = r.getInt(1);
                String name = r.getString(2);
                int qty = r.getInt(3);
                double price = r.getDouble(4);
                Object row[] = {id, name, qty, price};
                model.addRow(row);
                product_food obj = new product_food(id, name, qty, price);
                api.add(obj);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }

    public void format_AutoIncrement() {
        try {
            String sql = "ALTER TABLE my_order AUTO_INCREMENT = 1";
            ps = connection().prepareStatement(sql);
            int result = ps.executeUpdate();  // No ResultSet here, just an int
            System.out.println("AUTO_INCREMENT value has been reset.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void bt_signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_signinMouseClicked
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM my_order";
            ps = connection().prepareStatement(sql);

            // Use executeUpdate() for DELETE statements
            int rowsDeleted = ps.executeUpdate();

            System.out.println("Total rows deleted: " + rowsDeleted);
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace to understand the error
        } finally {
            try {
                if (ps != null) {
                    ps.close();  // Close the PreparedStatement
                }
                if (connection() != null) {
                    connection().close();  // Close the connection
                }
            } catch (Exception ex) {
                ex.printStackTrace();  // Handle any exception that occurs during closing
            }
        }
        format_AutoIncrement();
    }//GEN-LAST:event_bt_signinMouseClicked

    private void bt_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_signinActionPerformed
        // TODO add your handling code here:
        ShowData();
    }//GEN-LAST:event_bt_signinActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        body.removeAll();
        body.add(aba);
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        body.removeAll();
        body.add(aclyda);
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        body.removeAll();
        body.add(khqr);
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            sql = "SELECT * FROM total";
            ps = connection().prepareStatement(sql);
            r = ps.executeQuery();
            while (r.next() == true) {
                double total = r.getDouble("total");
                double tax = r.getDouble("tax");
                total_t.setText(String.valueOf(total));
                tax_t.setText(String.valueOf(tax));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        body.removeAll();
        body.add(jPanel2);
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(QR_code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QR_code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QR_code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QR_code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QR_code().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aba;
    private javax.swing.JPanel aclyda;
    private javax.swing.JPanel body;
    private burger.MyButton bt_signin;
    public static javax.swing.JLabel dollar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel khqr;
    public static javax.swing.JLabel riel;
    private javax.swing.JTable table_t;
    private javax.swing.JTextField tax_t;
    private javax.swing.JTextField total_t;
    // End of variables declaration//GEN-END:variables
}
