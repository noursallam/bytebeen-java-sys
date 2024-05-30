package bytebean;

import bytebean.Mainframe;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class loginFrame extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public loginFrame() {
        initComponents();
    }

    ///////////////////// to run this page frist //////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loginbtm = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        panel2 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(0, 153, 102));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 48)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user32.png"))); // NOI18N
        jLabel3.setText("Login");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 280, 140));

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        usernameField.setForeground(new java.awt.Color(0, 0, 0));
        usernameField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFieldKeyPressed(evt);
            }
        });
        panel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 500, 50));

        jTextField2.setBorder(null);
        panel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 500, 50));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jLabel4.setText("Username");
        jLabel4.setToolTipText("");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password24.png"))); // NOI18N
        jLabel5.setText("Password");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        loginbtm.setBackground(new java.awt.Color(0, 0, 0));
        loginbtm.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        loginbtm.setForeground(new java.awt.Color(0, 204, 153));
        loginbtm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enter32.png"))); // NOI18N
        loginbtm.setText("login");
        loginbtm.setBorder(null);
        loginbtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtmActionPerformed(evt);
            }
        });
        panel1.add(loginbtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 150, 50));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setForeground(new java.awt.Color(0, 0, 0));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        panel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 500, 50));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 620, 700));

        panel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bytebean2.png"))); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtmActionPerformed

        String enteredUsername = usernameField.getText();
        String enteredPassword = pass.getText();

        String correctUsername = "admin";
        String correctPassword = "pass123";

        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            Mainframe mainFrame = new Mainframe();
            mainFrame.setVisible(true);

            // Close the login frame if needed
            this.dispose();
        } else {
            // If the username or password is incorrect, show an error message
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);

            // Clear the password field 
            pass.setText("");
        }


    }//GEN-LAST:event_loginbtmActionPerformed

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldKeyPressed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
      
    }//GEN-LAST:event_passActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loginbtm;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
