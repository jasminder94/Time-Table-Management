package timetablegenerate;

/**
 *
 * @author RamanJeetSinghProjects
 */

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class frmViewTimeTableTeacher extends javax.swing.JFrame {
frmConnection frm=new frmConnection();
Statement st=null;
ResultSet rs=null;
String[][] rows;
String[] columns=new String[]{"Day","8:00-9:00","9:00-10:00","10:00-11:00","11:00-12:00","12:00-12:30","12:30-1:30","BatchA-1:30-3:30","BatchB-1:30-3:30"};

    DefaultTableModel tableData;
        
        String sem="";
        String session="";
       
    public frmViewTimeTableTeacher(String sem,String session) {
        initComponents();
        this.sem=sem;
        this.session=session;
                try
                {
                    tableData=new DefaultTableModel(rows, columns);
                    st=frm.getCon().createStatement();
                    rs=st.executeQuery("select * from time_table_teacher where sem='"+sem+"' and session='"+session+"'");
                    while(rs.next())
                    {
                         Object[] x={rs.getString("day1"),rs.getString("p1"),
                    rs.getString("p2"),rs.getString("p3"),
                    rs.getString("p4"),"RECESS",rs.getString("p5"),
                    rs.getString("lab1"),rs.getString("lab2"),
                    };
                tableData.addRow(x);
                    }
                }
                catch(Exception ex)
                {
                    System.out.println();
                }
                jTable1.setModel(tableData);
             
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Time Table");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 70, 710, 360);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setText("College Time table");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 30, 200, 24);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.gif"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(590, 460, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmTeacherAccount(sem, session).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
