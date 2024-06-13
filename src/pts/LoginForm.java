/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pts;

import User.UserDash;
import admin.AdminDash;
import config.dcConnector;
import config.passwordHash;
import config.session;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC-
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrom
     */
    public LoginForm() {
        initComponents();
    }
    
    Color navcolor = new Color(7,46,51);
    Color hovercolor = new Color(41,77,97);
    
    static String status;
    static String type;
    
      public static boolean loginAcc(String username, String password){
        dcConnector connector = new dcConnector();
        try{
            String query = "SELECT * FROM  ttb  WHERE u_Username = '" + username + "'";
            ResultSet resultSet = connector.getData(query);
            if(resultSet.next()){
               
            String hashedPass = resultSet.getString("u_Password");
            String rehashedPass = passwordHash.hashPassword(password);
            
         if(hashedPass.equals(rehashedPass)){
             
            status = resultSet.getString("u_status");
            type = resultSet.getString("u_type");
            
                session sess = session.getInstance();
                sess.setId(resultSet.getInt("u_id"));
                sess.setEmail(resultSet.getString("u_Email"));  
                sess.setName(resultSet.getString("u_Fname"));
                sess.setLname(resultSet.getString("u_Lname"));
                sess.setUsername(resultSet.getString("u_Username"));
                sess.setType(resultSet.getString("u_type"));
                sess.setStatus(resultSet.getString("u_status"));
                
            return true;
           
         }else{
            return false;
         }      
            }else{ 
            return false;
            }
        }catch (SQLException | NoSuchAlgorithmException ex) {
            return false;   
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sp = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(5, 22, 26));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(7, 46, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(41, 41, 41));
        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 165, 192));
        jLabel1.setText("LOGIN");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(95, 13, 49, 19);

        jLabel2.setBackground(new java.awt.Color(41, 41, 41));
        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(109, 165, 192));
        jLabel2.setText("Password");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(29, 107, 52, 13);

        jLabel3.setBackground(new java.awt.Color(41, 41, 41));
        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 165, 192));
        jLabel3.setText("Username");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(29, 50, 54, 13);
        jPanel3.add(user);
        user.setBounds(39, 74, 168, 27);
        jPanel3.add(pass);
        pass.setBounds(39, 131, 168, 28);

        jButton1.setBackground(new java.awt.Color(7, 46, 51));
        jButton1.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(109, 165, 192));
        jButton1.setText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(142, 195, 71, 23);

        jLabel4.setBackground(new java.awt.Color(41, 41, 41));
        jLabel4.setFont(new java.awt.Font("Sitka Small", 3, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(15, 150, 144));
        jLabel4.setText("Create a account!");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4);
        jLabel4.setBounds(84, 229, 92, 13);

        sp.setBackground(new java.awt.Color(7, 46, 51));
        sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spActionPerformed(evt);
            }
        });
        jPanel3.add(sp);
        sp.setBounds(39, 166, 21, 21);

        jLabel5.setBackground(new java.awt.Color(41, 41, 41));
        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(109, 165, 192));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Show password");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(60, 170, 83, 13);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(350, 110, 240, 256);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Borcelle CAR wash (1) (1).png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 60, 250, 350);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        SigninForm sif = new SigninForm();
        sif.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        if(loginAcc(user.getText(),pass.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null, "In-Active Account, Contact the Admin!");
            }else{
                if(type.equals("Admin")){
                    JOptionPane.showMessageDialog(null,"Admin Login Success!");
                    AdminDash ads = new AdminDash(); 
                    ads.setVisible(true);
                    this.dispose();
                }else if(type.equals("User")){
                    JOptionPane.showMessageDialog(null,"User Login Success!");
                    UserDash uds = new UserDash(); 
                    uds.setVisible(true);
                    this.dispose();
       
                }else{
                    JOptionPane.showMessageDialog(null,"No Account Type Found, Contact the Admin!");
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Account!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spActionPerformed
        if(sp.isSelected()){
            pass.setEchoChar((char)0);
        }else{
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_spActionPerformed

    
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JCheckBox sp;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}