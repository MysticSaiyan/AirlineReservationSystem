/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author PRAGUN
 */
public class AddFlight extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
ResultSet rs = null;

    /**
     * Creates new form AddFlight
     */
    public AddFlight() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scb = new javax.swing.JComboBox<>();
        dcb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        chargesf = new javax.swing.JTextField();
        datef = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        hd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        md = new javax.swing.JTextField();
        ha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ma = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(710, 419));
        setSize(new java.awt.Dimension(710, 419));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Flights");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 643, 39));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Flight ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 121, 43));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Flight Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 68, 150, 43));
        getContentPane().add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 68, 150, 43));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 68, 180, 43));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Source :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, 121, 46));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Destination :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 129, 138, 42));

        scb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        scb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Gurgaon", "Mumbai", "Kolkata", "Chennai", "Bengaluru", "Amritsar", " " }));
        getContentPane().add(scb, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 129, 150, 46));

        dcb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New York", "London", "New Jersey", "Sydney", "Melbourne", "Paris", "Rome", "Moscow", "Toronto" }));
        getContentPane().add(dcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 129, 194, 46));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Departure :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, 121, 45));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Arrival Time :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 193, 138, 45));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Flight Charges :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 256, -1, 59));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Date of Departure :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 256, 209, 59));
        getContentPane().add(chargesf, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 256, 120, 59));
        getContentPane().add(datef, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 256, 133, 59));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ADD FLIGHT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 333, 222, 62));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 333, 203, 62));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("RETURN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 333, 192, 62));
        getContentPane().add(hd, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 193, 49, 45));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(":");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 193, 18, 45));

        md.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdActionPerformed(evt);
            }
        });
        getContentPane().add(md, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 193, 49, 45));
        getContentPane().add(ha, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 193, 51, 45));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(":");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 193, 15, 45));
        getContentPane().add(ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 193, 47, 45));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int id = Integer.parseInt(fid.getText());
String name = fname.getText();
String source = (String) scb.getSelectedItem();
String destination = (String) dcb.getSelectedItem();
String HD = hd.getText();
String MD = md.getText();
String HA = ha.getText();
String MA = ma.getText();


String departure  = HD + " : " + MD;
String arrival = HA + " : " + MA;
int charges = Integer.parseInt(chargesf.getText());
String date = datef.getText();
try{
   Class.forName("java.sql.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost/airline_reservation?verifyServerCertificate=false&useSSL=true","root","pragun");
   stmt = con.createStatement();
   String query = "Insert into flights values(" + id + ",'" + name + "','" + source + "','" + destination + "','" + departure + "','" + arrival + "'," + charges + ",'" + date + "');";
   stmt.executeUpdate(query);
   JOptionPane.showMessageDialog(null,"Flight added successfully");
   }
catch(Exception e) {
    JOptionPane.showMessageDialog(null,"Flight couldn't be added");
                   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
fid.setText("");
fname.setText("");
md.setText("");
hd.setText("");
ma.setText("");
ha.setText("");
chargesf.setText("");
datef.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Dashboard d = new Dashboard();
d.setVisible(true);
close();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private void close(){
        this.setVisible(false);
        this.dispose();
    }
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
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chargesf;
    private javax.swing.JTextField datef;
    private javax.swing.JComboBox<String> dcb;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField ha;
    private javax.swing.JTextField hd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField ma;
    private javax.swing.JTextField md;
    private javax.swing.JComboBox<String> scb;
    // End of variables declaration//GEN-END:variables
}