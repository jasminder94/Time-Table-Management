package timetablegenerate;

/**
 *
 * @author RamanJeetSinghProjects
 */

import javax.swing.JOptionPane;
import java.sql.*;

public class frmRegister extends javax.swing.JFrame {
Statement st=null;
ResultSet rs=null;
frmConnection frm=new frmConnection();
    public frmRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbSelect = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtSem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSession = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Module");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registration Panel"));
        jPanel1.setLayout(null);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(180, 160, 210, 30);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 170, 80, 19);
        jPanel1.add(txtUserName);
        txtUserName.setBounds(180, 120, 210, 30);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 130, 90, 19);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.gif"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(250, 410, 130, 40);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Registration Panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 30, 185, 24);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register_icon.jpg"))); // NOI18N
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(80, 410, 143, 39);

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 250, 80, 19);

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel8.setText("mobile");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 290, 80, 19);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 210, 80, 19);
        jPanel1.add(txtMobile);
        txtMobile.setBounds(180, 280, 210, 30);
        jPanel1.add(txtAddress);
        txtAddress.setBounds(180, 200, 210, 30);
        jPanel1.add(txtEmail);
        txtEmail.setBounds(180, 240, 210, 30);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setText("User type");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 80, 90, 30);

        cmbSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Teacher" }));
        jPanel1.add(cmbSelect);
        cmbSelect.setBounds(180, 80, 210, 30);

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel9.setText("Sem");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 330, 60, 19);
        jPanel1.add(txtSem);
        txtSem.setBounds(180, 320, 210, 30);

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel10.setText("Session");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 370, 60, 19);
        jPanel1.add(txtSession);
        txtSession.setBounds(180, 360, 210, 30);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setText("Registration module");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try
        {
            st=frm.getCon().createStatement();
            rs=st.executeQuery("select * from users where uname='"+txtUserName.getText()+"'");
            if(rs.next())
            {
                JOptionPane.showMessageDialog(rootPane,"User name is already Registered ... Try Again");
                txtUserName.setText("");
            }
            else
            {
                st.execute("insert into users(uname,passw,addr,email,mobile,sem,session,utype) values('"+txtUserName.getText()+"','"
                    +txtPassword.getText()+"','"+txtAddress.getText()+"','"+txtEmail.getText()
                    +"','"+txtMobile.getText()
                    +"','"+txtSem.getText()+"','"+txtSession.getText()
                    +"','"+cmbSelect.getSelectedItem().toString()
                    +"')");
            
            JOptionPane.showMessageDialog(rootPane,"You are Registered Successfully");
            this.dispose();
            new frmLogin().setVisible(true);
            }
            frm.closeCon();
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception : "+ex.getMessage());
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbSelect;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSem;
    private javax.swing.JTextField txtSession;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}
