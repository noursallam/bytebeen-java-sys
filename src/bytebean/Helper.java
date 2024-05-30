package bytebean;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CompuSoft
 */
public class Helper {
    private DefaultTableModel model;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTable Table;


    public Helper(DefaultTableModel model, JTextField name, JTextField phone, JTextField email, JTextField address,JTable table) {
        this.model = model;
        this.tfName = name;
        this.tfPhone = phone;
        this.tfEmail = email;
        this.tfAddress = address;
        this.Table = table;
    }
    
    private void setModel() {
        model = (DefaultTableModel) Table.getModel();// Allows to Control table 
    }
    public void deleteRow() {
        setModel();
        int selectedRowIndex = Table.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to delete !", "Error", JOptionPane.ERROR_MESSAGE);
        } else { //Table.getSelectedRow()= index
            model.removeRow(Table.getSelectedRow());  // recieve num of selected row

        }
    }

    public void updateValues(Client c, int indexOfRow) {
        model.setValueAt(c.getFullName(), indexOfRow, 0);
        model.setValueAt(c.getPhoneNumber(), indexOfRow, 1);
        model.setValueAt(c.getGmail(), indexOfRow, 2);
        model.setValueAt(c.getCity(), indexOfRow, 3);
    }

    public void displayInfo(int index) {
        tfName.setText(Table.getValueAt(index, 0).toString());
        tfPhone.setText(Table.getValueAt(index, 1).toString());
        tfEmail.setText(Table.getValueAt(index, 2).toString());
        tfAddress.setText(Table.getValueAt(index, 3).toString());
    }

    public void clearAll() {
        tfName.setText("");
        tfAddress.setText("");
        tfEmail.setText("");
        tfPhone.setText("");
    }

    /* 
    This Method Checks if you Entered non Optional Information
     */
    public boolean CheckInformation() {
        if (tfName.getText().isEmpty() || tfPhone.getText().isEmpty() || tfEmail.getText().isEmpty() || tfAddress.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    // Adding the client object properties to the table
    public void addToTable(Client obj) {
        setModel();    // Allows to Control table 
        model.addRow(new Object[]{obj.getFullName(), obj.getPhoneNumber(), obj.getGmail(), obj.getCity()});
    }
    


}
