package bytebean;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NOURALDEENSALLAM in Byte Bean team
 */
public class Mainframe extends javax.swing.JFrame {

    private DefaultTableModel model;   // Allows to Control table 
    Helper helper;

    public Mainframe() {
        ImageIcon img = new ImageIcon("src/icons/Bytebean2.png");
        setIconImage(img.getImage());
        initComponents();
        helper = new Helper(model, tfName, tfPhone, tfEmail, tfAddress, Table);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        labelListOfContacts = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        panelInput = new javax.swing.JPanel();
        javax.swing.JLabel labelNewClient = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        labelAddress = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        javax.swing.JLabel labelEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        labelPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnLogout = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        labelPanelLogo = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bytebean contact table");
        setResizable(false);

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelListOfContacts.setBackground(new java.awt.Color(0, 0, 0));
        labelListOfContacts.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N
        labelListOfContacts.setForeground(new java.awt.Color(255, 255, 255));
        labelListOfContacts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListOfContacts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list32.png"))); // NOI18N
        labelListOfContacts.setText("List of contacts");
        background.add(labelListOfContacts, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 307, 58));

        labelIcon.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bytebean-removebg-preview.png"))); // NOI18N
        background.add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 257, 48));

        panelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelInput.setOpaque(false);

        labelNewClient.setBackground(new java.awt.Color(0, 0, 0));
        labelNewClient.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N
        labelNewClient.setForeground(new java.awt.Color(255, 255, 255));
        labelNewClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNewClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/newClient32.png"))); // NOI18N
        labelNewClient.setText("New client");

        labelName.setBackground(new java.awt.Color(0, 0, 0));
        labelName.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user32.png"))); // NOI18N
        labelName.setText("Name");

        tfName.setBackground(new java.awt.Color(204, 204, 204));
        tfName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        labelAddress.setBackground(new java.awt.Color(0, 0, 0));
        labelAddress.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        labelAddress.setForeground(new java.awt.Color(255, 255, 255));
        labelAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/location32.png"))); // NOI18N
        labelAddress.setText("Address");

        tfAddress.setBackground(new java.awt.Color(204, 204, 204));
        tfAddress.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        labelEmail.setBackground(new java.awt.Color(0, 0, 0));
        labelEmail.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail32.png"))); // NOI18N
        labelEmail.setText("Email");

        tfEmail.setBackground(new java.awt.Color(204, 204, 204));
        tfEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        labelPhone.setBackground(new java.awt.Color(0, 0, 0));
        labelPhone.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        labelPhone.setForeground(new java.awt.Color(255, 255, 255));
        labelPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/telephone32.png"))); // NOI18N
        labelPhone.setText("Phone");

        tfPhone.setBackground(new java.awt.Color(204, 204, 204));
        tfPhone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eraser32.png"))); // NOI18N
        btnClear.setText("clear");
        btnClear.setIconTextGap(10);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add32.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setIconTextGap(10);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 0, 0));
        btnEdit.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/write32.png"))); // NOI18N
        btnEdit.setText("Modify");
        btnEdit.setIconTextGap(10);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                            .addComponent(tfEmail)
                            .addComponent(tfName)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(labelNewClient, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNewClient, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(labelName)
                .addGap(18, 18, 18)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(labelPhone)
                .addGap(18, 18, 18)
                .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(labelEmail)
                .addGap(18, 18, 18)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(labelAddress)
                .addGap(18, 18, 18)
                .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        background.add(panelInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, -1, 570));

        Table.setAutoCreateRowSorter(true);
        Table.setBackground(new java.awt.Color(204, 204, 204));
        Table.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setGridColor(new java.awt.Color(0, 0, 0));
        scrollPane.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
        }

        background.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 87, 778, 505));

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout32.png"))); // NOI18N
        btnLogout.setText("logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        background.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 190, 50));

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete32.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        background.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 610, 182, 62));

        btnDisplay.setBackground(new java.awt.Color(0, 0, 0));
        btnDisplay.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnDisplay.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh-page-option.png"))); // NOI18N
        btnDisplay.setText("Display");
        btnDisplay.setIconTextGap(10);
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        background.add(btnDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 200, 60));

        labelPanelLogo.setBackground(new java.awt.Color(0, 0, 0));
        labelPanelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/newjk.png"))); // NOI18N
        background.add(labelPanelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1530, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        helper.clearAll();
    }//GEN-LAST:event_btnClearActionPerformed


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Client client;
        if (helper.CheckInformation()) { 
            // calling Client Class by Creating Instance( Object ) 

            client = new Client(tfName.getText(), tfPhone.getText(), tfEmail.getText(), tfAddress.getText());

            // to show error message if Main info Are Invalid according to Constraints
            if (client.getMessage().isEmpty()) {//excutes if there is not a Problem
                helper.addToTable(client);
                helper.clearAll();

            } else {
                /* it excutes if there is a Problem*/
                JOptionPane.showMessageDialog(this, client.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(this, "Please Enter all Information !", "Error Message", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        helper.deleteRow();
    }//GEN-LAST:event_btnDeleteActionPerformed


    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // to logout
        this.dispose();
        loginFrame loginFrame = new loginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed


    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Client client;
        if (helper.CheckInformation()) {
            // calling Client Class by Creating Instance( Object ) 

            client = new Client(tfName.getText(), tfPhone.getText(), tfEmail.getText(), tfAddress.getText());

            if (client.getMessage().isEmpty()) {//excutes if there is not a Problem
                helper.updateValues(client, indexOfRow);
                helper.clearAll();

            } else {
                /* it excutes if there is a Problem*/
                JOptionPane.showMessageDialog(this, client.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(this, "Please Enter all Information !", "Error Message", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setForeground(Color.red);
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setForeground(Color.white);
    }//GEN-LAST:event_btnDeleteMouseExited

    int indexOfRow;
    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        indexOfRow = Table.getSelectedRow();
        helper.displayInfo(indexOfRow);
    }//GEN-LAST:event_btnDisplayActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelListOfContacts;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPanelLogo;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JPanel panelInput;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhone;
    // End of variables declaration//GEN-END:variables
}
