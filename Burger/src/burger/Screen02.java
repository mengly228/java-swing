package burger;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Screen02 extends javax.swing.JFrame {

    private PreparedStatement ps;
    private ResultSet r;
    private String sql;

    public Screen02() {
        initComponents();
        connection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        open = new javax.swing.JLabel();
        hint = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Email1 = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        Email2 = new javax.swing.JLabel();
        Email3 = new javax.swing.JLabel();
        bt_signin = new burger.MyButton();
        myButton4 = new burger.MyButton();
        Email4 = new javax.swing.JLabel();
        Email5 = new javax.swing.JLabel();
        myButton7 = new burger.MyButton();
        myButton8 = new burger.MyButton();
        Register = new javax.swing.JPanel();
        open2 = new javax.swing.JLabel();
        hint2 = new javax.swing.JLabel();
        open1 = new javax.swing.JLabel();
        hint1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Email6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Email7 = new javax.swing.JLabel();
        pf_pass = new javax.swing.JPasswordField();
        Email8 = new javax.swing.JLabel();
        pf_cpass = new javax.swing.JPasswordField();
        bt_Register = new burger.MyButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 830));
        setMinimumSize(new java.awt.Dimension(1100, 830));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("H O U S E");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 210, 250, 80);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 75)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 70, 360, 80);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("To BURGUER ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 140, 340, 80);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\f7b344dfacc17592843eed987205d172.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 400, 510, 370);

        bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\HD-wallpaper-red-and-black-iphone-top-red-and-black-iphone-background-cool-for-phones-iphone-6s-poster-background-design-black-white-red.png")); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 500, 800);

        body.setLayout(new java.awt.CardLayout());

        Login.setLayout(null);

        open.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        open.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\360_F_355004293_hVBcuqDqpthKjhdc1ZGSIkesKZBxAX0i.png")); // NOI18N
        open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMouseClicked(evt);
            }
        });
        Login.add(open);
        open.setBounds(460, 350, 50, 50);

        hint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hint.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\f.png")); // NOI18N
        hint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hintMouseClicked(evt);
            }
        });
        Login.add(hint);
        hint.setBounds(460, 350, 50, 50);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\av2ea632ff425acf36dbb.png")); // NOI18N
        Login.add(jLabel8);
        jLabel8.setBounds(70, 350, 50, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\email-icon-free-vector.png")); // NOI18N
        Login.add(jLabel9);
        jLabel9.setBounds(80, 260, 50, 50);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOGIN");
        Login.add(jLabel5);
        jLabel5.setBounds(199, 133, 166, 87);

        Email.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Email.setText("Password");
        Login.add(Email);
        Email.setBounds(64, 317, 104, 28);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Enter your Email");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Login.add(jTextField1);
        jTextField1.setBounds(64, 260, 448, 51);

        Email1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Email1.setText("Email");
        Login.add(Email1);
        Email1.setBounds(64, 226, 104, 28);

        pf_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pf_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pf_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pf_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pf_passwordFocusLost(evt);
            }
        });
        pf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_passwordActionPerformed(evt);
            }
        });
        Login.add(pf_password);
        pf_password.setBounds(64, 351, 448, 51);

        Email2.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        Email2.setText("Or continuce with");
        Login.add(Email2);
        Email2.setBounds(235, 531, 123, 28);

        Email3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Email3.setForeground(new java.awt.Color(0, 0, 255));
        Email3.setText("Forget password?");
        Login.add(Email3);
        Email3.setBounds(403, 408, 109, 28);

        bt_signin.setForeground(new java.awt.Color(255, 255, 255));
        bt_signin.setText("SIGN IN");
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
        Login.add(bt_signin);
        bt_signin.setBounds(64, 454, 448, 59);

        myButton4.setForeground(new java.awt.Color(255, 255, 255));
        myButton4.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\mac-21.png")); // NOI18N
        myButton4.setBorderColor(new java.awt.Color(255, 255, 255));
        myButton4.setBorderPainted(false);
        myButton4.setFont(new java.awt.Font("Segoe UI Semibold", 2, 10)); // NOI18N
        myButton4.setRadius(30);
        Login.add(myButton4);
        myButton4.setBounds(390, 590, 122, 50);

        Email4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Email4.setForeground(new java.awt.Color(51, 51, 255));
        Email4.setText("Register now");
        Email4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Email4MouseClicked(evt);
            }
        });
        Login.add(Email4);
        Email4.setBounds(345, 658, 80, 28);

        Email5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Email5.setText("Don't have an account yet ? ");
        Login.add(Email5);
        Email5.setBounds(161, 658, 178, 28);

        myButton7.setForeground(new java.awt.Color(255, 255, 255));
        myButton7.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\images (1).png")); // NOI18N
        myButton7.setBorderColor(new java.awt.Color(255, 255, 255));
        myButton7.setBorderPainted(false);
        myButton7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 10)); // NOI18N
        myButton7.setRadius(30);
        Login.add(myButton7);
        myButton7.setBounds(64, 590, 122, 50);

        myButton8.setForeground(new java.awt.Color(255, 255, 255));
        myButton8.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\google-mail-gmail-icon-logo-symbol-free-png.png")); // NOI18N
        myButton8.setBorderColor(new java.awt.Color(255, 255, 255));
        myButton8.setBorderPainted(false);
        myButton8.setFont(new java.awt.Font("Segoe UI Semibold", 2, 10)); // NOI18N
        myButton8.setRadius(30);
        Login.add(myButton8);
        myButton8.setBounds(226, 590, 122, 50);

        body.add(Login, "card2");

        Register.setLayout(null);

        open2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        open2.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\360_F_355004293_hVBcuqDqpthKjhdc1ZGSIkesKZBxAX0i.png")); // NOI18N
        open2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                open2MouseClicked(evt);
            }
        });
        Register.add(open2);
        open2.setBounds(460, 480, 60, 60);

        hint2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hint2.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\f.png")); // NOI18N
        hint2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hint2MouseClicked(evt);
            }
        });
        Register.add(hint2);
        hint2.setBounds(460, 480, 60, 60);

        open1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        open1.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\360_F_355004293_hVBcuqDqpthKjhdc1ZGSIkesKZBxAX0i.png")); // NOI18N
        open1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                open1MouseClicked(evt);
            }
        });
        Register.add(open1);
        open1.setBounds(460, 390, 60, 60);

        hint1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hint1.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\f.png")); // NOI18N
        hint1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hint1MouseClicked(evt);
            }
        });
        Register.add(hint1);
        hint1.setBounds(460, 390, 60, 60);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\av2ea632ff425acf36dbb.png")); // NOI18N
        Register.add(jLabel12);
        jLabel12.setBounds(70, 480, 50, 60);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\av2ea632ff425acf36dbb.png")); // NOI18N
        Register.add(jLabel11);
        jLabel11.setBounds(70, 390, 50, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\IT\\java\\e_shopjava\\image\\email-icon-free-vector.png")); // NOI18N
        Register.add(jLabel10);
        jLabel10.setBounds(80, 300, 50, 60);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGiSTER");
        Register.add(jLabel6);
        jLabel6.setBounds(137, 149, 309, 87);

        Email6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Email6.setText("Email");
        Register.add(Email6);
        Email6.setBounds(69, 270, 104, 28);

        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        Register.add(email);
        email.setBounds(69, 304, 448, 51);

        Email7.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Email7.setText("Password");
        Register.add(Email7);
        Email7.setBounds(69, 361, 104, 28);

        pf_pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pf_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Register.add(pf_pass);
        pf_pass.setBounds(69, 395, 448, 51);

        Email8.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Email8.setText("Comfirm Password");
        Register.add(Email8);
        Email8.setBounds(69, 452, 164, 28);

        pf_cpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pf_cpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Register.add(pf_cpass);
        pf_cpass.setBounds(69, 486, 448, 51);

        bt_Register.setForeground(new java.awt.Color(255, 255, 255));
        bt_Register.setText("Register");
        bt_Register.setBorderColor(new java.awt.Color(255, 0, 51));
        bt_Register.setBorderPainted(false);
        bt_Register.setFont(new java.awt.Font("Segoe UI Semibold", 2, 30)); // NOI18N
        bt_Register.setRadius(50);
        bt_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_RegisterMouseClicked(evt);
            }
        });
        Register.add(bt_Register);
        bt_Register.setBounds(69, 598, 448, 59);

        jCheckBox1.setText("I agree with privacy policy");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        Register.add(jCheckBox1);
        jCheckBox1.setBounds(69, 549, 448, 31);

        body.add(Register, "card3");

        getContentPane().add(body);
        body.setBounds(500, 0, 580, 800);

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
            Logger.getLogger(Screen02.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Screen02.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    void FetchData() {
        try {
            ps = connection().prepareStatement("SELECT * FROM login_create");
            r = ps.executeQuery();
            while (r.next() == true) {
                list_api01.list_api02.add(new list_api01(r.getString("email"), r.getString("password")));
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }

    void Clear() {
        jTextField1.setText("");
        pf_password.setText("");

    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void bt_signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_signinMouseClicked
        // TODO add your handling code here:
        try {
            String email_0 = jTextField1.getText();
            String password_0 = pf_password.getText();
            sql = "SELECT * FROM login_create WHERE email=? AND password=?";
            ps = connection().prepareStatement(sql);
            ps.setString(1, email_0);
            ps.setString(2, password_0);
            r = ps.executeQuery();
            Clear();
            if (r.next() == true) {
                JOptionPane.showConfirmDialog(null, "Welcome to Join ", "Burger House", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                Screen04 home = new Screen04();
                home.show();
            } else {
                JOptionPane.showConfirmDialog(null, "Invilid username or password !!! ", "Burger House", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }//GEN-LAST:event_bt_signinMouseClicked

    private void bt_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_signinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_signinActionPerformed

    private void Email4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Email4MouseClicked
        // TODO add your handling code here:
        body.removeAll();
        body.add(Register);
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_Email4MouseClicked

    private void bt_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_RegisterMouseClicked
        // TODO add your handling code here:
        try {
            boolean b = false;
            String email01 = email.getText();
            String pass = pf_pass.getText();
            String conf = pf_cpass.getText();
            if (email01.equals("") || pass.equals("") || conf.equals("")) {
                JOptionPane.showConfirmDialog(null, "Enter your information...!", "Register from", JOptionPane.WARNING_MESSAGE);
            } else {
                if (pass.equals(conf)) {
//                    for (int i = 0; i < list_api01.list_api.size(); i++) {
//                        if (email.equals(list_api01.list_api.get(i).getEmail())) {
                    b = true;
                    try {
                        sql = "INSERT INTO `login_create`(`email`, `password`, `comfirm_password`) VALUES (?,?,?)";
                        ps = connection().prepareStatement(sql);
                        ps.setString(1, email01);
                        ps.setString(2, pass);
                        ps.setString(3, conf);
                        int index = ps.executeUpdate();

                        System.out.println("Create Comlated........");
                    } catch (Exception e) {
                    }

                    JOptionPane.showConfirmDialog(null, "Account have already...!", "Register", JOptionPane.INFORMATION_MESSAGE);

                    body.removeAll();
                    body.add(Login);
                    SwingUtilities.updateComponentTreeUI(this);
                } else {
                    if (b = false) {
                        ps = connection().prepareStatement("INSERT INTO login_create (email, password) VALUES(?,?)");
                        ps.setString(1, email01);
                        ps.setString(2, pass);
                        int index = ps.executeUpdate();
                        if (index > 0) {
                            JOptionPane.showConfirmDialog(this, "Account create");
                            FetchData();
                            Clear();
                        } else {
                            JOptionPane.showConfirmDialog(this, "Erorr!", "Register", JOptionPane.ERROR_MESSAGE);

                        }
                    } else {
                        JOptionPane.showConfirmDialog(null, "Incorect comfirm password", "Register", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }//GEN-LAST:event_bt_RegisterMouseClicked

    private void open1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_open1MouseClicked
        // TODO add your handling code here:
        open1.setVisible(false);
        hint1.setVisible(true);
        pf_pass.setEchoChar((char) 0);
    }//GEN-LAST:event_open1MouseClicked

    private void hint1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hint1MouseClicked
        // TODO add your handling code her
        open1.setVisible(true);
        hint1.setVisible(false);
        pf_pass.setEchoChar('*');
    }//GEN-LAST:event_hint1MouseClicked

    private void open2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_open2MouseClicked
        // TODO add your handling code here:
        open2.setVisible(false);
        hint2.setVisible(true);
        pf_cpass.setEchoChar((char) 0);
    }//GEN-LAST:event_open2MouseClicked

    private void hint2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hint2MouseClicked
        // TODO add your handling code here:
        open2.setVisible(true);
        hint2.setVisible(false);
        pf_cpass.setEchoChar('*');
    }//GEN-LAST:event_hint2MouseClicked

    private void openMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMouseClicked
        // TODO add your handling code here:
        open.setVisible(false);
        hint.setVisible(true);
        pf_password.setEchoChar((char) 0);
    }//GEN-LAST:event_openMouseClicked

    private void hintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hintMouseClicked
        // TODO add your handling code here:
        open.setVisible(true);
        hint.setVisible(false);
        pf_password.setEchoChar('*');
    }//GEN-LAST:event_hintMouseClicked

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if (jTextField1.getText().equals("Enter your Email")) {
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if (jTextField1.getText().equals("")) {
            jTextField1.setText("Enter your Email");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_emailFocusLost

    private void pf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_passwordActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_pf_passwordActionPerformed

    private void pf_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_passwordFocusGained

    }//GEN-LAST:event_pf_passwordFocusGained

    private void pf_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_passwordFocusLost

    }//GEN-LAST:event_pf_passwordFocusLost

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
            java.util.logging.Logger.getLogger(Screen02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JLabel Email2;
    private javax.swing.JLabel Email3;
    private javax.swing.JLabel Email4;
    private javax.swing.JLabel Email5;
    private javax.swing.JLabel Email6;
    private javax.swing.JLabel Email7;
    private javax.swing.JLabel Email8;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Register;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel body;
    private burger.MyButton bt_Register;
    private burger.MyButton bt_signin;
    private javax.swing.JTextField email;
    private javax.swing.JLabel hint;
    private javax.swing.JLabel hint1;
    private javax.swing.JLabel hint2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private burger.MyButton myButton4;
    private burger.MyButton myButton7;
    private burger.MyButton myButton8;
    private javax.swing.JLabel open;
    private javax.swing.JLabel open1;
    private javax.swing.JLabel open2;
    private javax.swing.JPasswordField pf_cpass;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JPasswordField pf_password;
    // End of variables declaration//GEN-END:variables
}
