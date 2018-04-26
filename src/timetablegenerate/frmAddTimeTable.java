package timetablegenerate;

/**
 *
 * @author RamanJeetSinghProjects
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class frmAddTimeTable extends javax.swing.JFrame {
Statement st=null;
ResultSet rs=null;
frmConnection frm=new frmConnection();
    
public frmAddTimeTable() 
    {
        initComponents();
        txtFirstSubject.setVisible(false);
        txtSecondSubject.setVisible(false);
        txtThirdSubject.setVisible(false);
        txtFourthSubject.setVisible(false);
        txtFifthSubject.setVisible(false);
        txtSixthSubject.setVisible(false);
        
        txtFirstTeacher.setVisible(false);
        txtSecondTeacher.setVisible(false);
        txtThirdTeacher.setVisible(false);
        txtFourthTeacher.setVisible(false);
        txtFifthTeacher.setVisible(false);
        txtSixthTeacher.setVisible(false);
        
        cb1.setVisible(false);
        cb2.setVisible(false);
        cb3.setVisible(false);
        cb4.setVisible(false);
        cb5.setVisible(false);
        cb6.setVisible(false);
        
        lblSub1.setVisible(false);
        lblSub2.setVisible(false);
        lblSub3.setVisible(false);
        lblSub4.setVisible(false);
        lblSub5.setVisible(false);
        lblSub6.setVisible(false);
        
        lblTeach1.setVisible(false);
        lblTeach2.setVisible(false);
        lblTeach3.setVisible(false);
        lblTeach4.setVisible(false);
        lblTeach5.setVisible(false);
        lblTeach6.setVisible(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtFirstTeacher = new javax.swing.JTextField();
        txtFirstSubject = new javax.swing.JTextField();
        txtSecondTeacher = new javax.swing.JTextField();
        lblSub5 = new javax.swing.JLabel();
        txtSecondSubject = new javax.swing.JTextField();
        txtThirdTeacher = new javax.swing.JTextField();
        txtThirdSubject = new javax.swing.JTextField();
        txtFourthTeacher = new javax.swing.JTextField();
        txtFourthSubject = new javax.swing.JTextField();
        txtFifthTeacher = new javax.swing.JTextField();
        txtFifthSubject = new javax.swing.JTextField();
        lblTeach5 = new javax.swing.JLabel();
        lblSub2 = new javax.swing.JLabel();
        lblSub3 = new javax.swing.JLabel();
        lblSub4 = new javax.swing.JLabel();
        lblTeach1 = new javax.swing.JLabel();
        lblTeach2 = new javax.swing.JLabel();
        lblTeach3 = new javax.swing.JLabel();
        lblTeach4 = new javax.swing.JLabel();
        txtSem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSession = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblTeach6 = new javax.swing.JLabel();
        txtSixthTeacher = new javax.swing.JTextField();
        lblSub6 = new javax.swing.JLabel();
        txtSixthSubject = new javax.swing.JTextField();
        lblSub1 = new javax.swing.JLabel();
        cb6 = new javax.swing.JCheckBox();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Time Table");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Schedule Addition Panel"));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Add Schedule panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 30, 200, 24);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create-icon.png"))); // NOI18N
        jButton3.setText("Generate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(220, 580, 143, 39);
        jPanel1.add(txtFirstTeacher);
        txtFirstTeacher.setBounds(140, 160, 210, 30);
        jPanel1.add(txtFirstSubject);
        txtFirstSubject.setBounds(500, 160, 210, 30);
        jPanel1.add(txtSecondTeacher);
        txtSecondTeacher.setBounds(140, 230, 210, 30);

        lblSub5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblSub5.setText("subject");
        jPanel1.add(lblSub5);
        lblSub5.setBounds(400, 410, 70, 30);
        jPanel1.add(txtSecondSubject);
        txtSecondSubject.setBounds(500, 230, 210, 30);
        jPanel1.add(txtThirdTeacher);
        txtThirdTeacher.setBounds(140, 290, 210, 30);
        jPanel1.add(txtThirdSubject);
        txtThirdSubject.setBounds(500, 290, 210, 30);
        jPanel1.add(txtFourthTeacher);
        txtFourthTeacher.setBounds(140, 350, 210, 30);
        jPanel1.add(txtFourthSubject);
        txtFourthSubject.setBounds(500, 350, 210, 30);
        jPanel1.add(txtFifthTeacher);
        txtFifthTeacher.setBounds(140, 410, 210, 30);
        jPanel1.add(txtFifthSubject);
        txtFifthSubject.setBounds(500, 410, 210, 30);

        lblTeach5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblTeach5.setText("teacher");
        jPanel1.add(lblTeach5);
        lblTeach5.setBounds(40, 410, 70, 30);

        lblSub2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblSub2.setText("subject");
        jPanel1.add(lblSub2);
        lblSub2.setBounds(400, 230, 70, 30);

        lblSub3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblSub3.setText("subject");
        jPanel1.add(lblSub3);
        lblSub3.setBounds(400, 290, 70, 30);

        lblSub4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblSub4.setText("subject");
        jPanel1.add(lblSub4);
        lblSub4.setBounds(400, 350, 70, 30);

        lblTeach1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblTeach1.setText("teacher");
        jPanel1.add(lblTeach1);
        lblTeach1.setBounds(40, 160, 70, 30);

        lblTeach2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblTeach2.setText("teacher");
        jPanel1.add(lblTeach2);
        lblTeach2.setBounds(40, 230, 70, 30);

        lblTeach3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblTeach3.setText("teacher");
        jPanel1.add(lblTeach3);
        lblTeach3.setBounds(40, 290, 70, 30);

        lblTeach4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblTeach4.setText("teacher");
        jPanel1.add(lblTeach4);
        lblTeach4.setBounds(40, 350, 70, 30);
        jPanel1.add(txtSem);
        txtSem.setBounds(80, 90, 80, 30);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setText("Session");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 90, 60, 30);
        jPanel1.add(txtSession);
        txtSession.setBounds(280, 90, 110, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.gif"))); // NOI18N
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(380, 580, 130, 40);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create-icon.png"))); // NOI18N
        jButton6.setText("Show");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(670, 80, 120, 40);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setText("Sem");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 90, 50, 30);

        lblTeach6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblTeach6.setText("teacher");
        jPanel1.add(lblTeach6);
        lblTeach6.setBounds(40, 480, 70, 30);
        jPanel1.add(txtSixthTeacher);
        txtSixthTeacher.setBounds(140, 480, 210, 30);

        lblSub6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblSub6.setText("subject");
        jPanel1.add(lblSub6);
        lblSub6.setBounds(400, 480, 70, 30);
        jPanel1.add(txtSixthSubject);
        txtSixthSubject.setBounds(500, 480, 210, 30);

        lblSub1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        lblSub1.setText("subject");
        jPanel1.add(lblSub1);
        lblSub1.setBounds(400, 160, 70, 30);

        cb6.setText("Lab");
        jPanel1.add(cb6);
        cb6.setBounds(720, 480, 80, 30);

        cb1.setText("Lab");
        jPanel1.add(cb1);
        cb1.setBounds(720, 160, 80, 30);

        cb2.setText("Lab");
        jPanel1.add(cb2);
        cb2.setBounds(720, 230, 80, 30);

        cb3.setText("Lab");
        jPanel1.add(cb3);
        cb3.setBounds(720, 290, 80, 30);

        cb4.setText("Lab");
        jPanel1.add(cb4);
        cb4.setBounds(720, 350, 80, 30);

        cb5.setText("Lab");
        jPanel1.add(cb5);
        cb5.setBounds(720, 410, 80, 30);

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setText("No. of subjects");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(420, 90, 120, 30);
        jPanel1.add(txtInput);
        txtInput.setBounds(550, 90, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int input=0;
        if(txtInput.getText().isEmpty())
        {
            input=0;
        }
        else
        {
            input=Integer.parseInt(txtInput.getText());
        }
       
       if(input==4)
       {
           
        txtFirstSubject.setVisible(true);
        txtSecondSubject.setVisible(true);
        txtThirdSubject.setVisible(true);
        txtFourthSubject.setVisible(true);
        
        txtFirstTeacher.setVisible(true);
        txtSecondTeacher.setVisible(true);
        txtThirdTeacher.setVisible(true);
        txtFourthTeacher.setVisible(true);
        
        cb1.setVisible(true);
        cb2.setVisible(true);
        cb3.setVisible(true);
        cb4.setVisible(true);
        
        lblSub1.setVisible(true);
        lblSub2.setVisible(true);
        lblSub3.setVisible(true);
        lblSub4.setVisible(true);
        
        lblTeach1.setVisible(true);
        lblTeach2.setVisible(true);
        lblTeach3.setVisible(true);
        lblTeach4.setVisible(true);
        
           
       }
       
       
       else if(input==5)
       {
           
        txtFirstSubject.setVisible(true);
        txtSecondSubject.setVisible(true);
        txtThirdSubject.setVisible(true);
        txtFourthSubject.setVisible(true);
        txtFifthSubject.setVisible(true);
        
        txtFirstTeacher.setVisible(true);
        txtSecondTeacher.setVisible(true);
        txtThirdTeacher.setVisible(true);
        txtFourthTeacher.setVisible(true);
        txtFifthTeacher.setVisible(true);
        
        cb1.setVisible(true);
        cb2.setVisible(true);
        cb3.setVisible(true);
        cb4.setVisible(true);
        cb5.setVisible(true);
        
        lblSub1.setVisible(true);
        lblSub2.setVisible(true);
        lblSub3.setVisible(true);
        lblSub4.setVisible(true);
        lblSub5.setVisible(true);
        
        lblTeach1.setVisible(true);
        lblTeach2.setVisible(true);
        lblTeach3.setVisible(true);
        lblTeach4.setVisible(true);
        lblTeach5.setVisible(true);
           
       }
       
       
       else if(input==6)
       {
           
        txtFirstSubject.setVisible(true);
        txtSecondSubject.setVisible(true);
        txtThirdSubject.setVisible(true);
        txtFourthSubject.setVisible(true);
        txtFifthSubject.setVisible(true);
        txtSixthSubject.setVisible(true);
        
        txtFirstTeacher.setVisible(true);
        txtSecondTeacher.setVisible(true);
        txtThirdTeacher.setVisible(true);
        txtFourthTeacher.setVisible(true);
        txtFifthTeacher.setVisible(true);
        txtSixthTeacher.setVisible(true);
        
        cb1.setVisible(true);
        cb2.setVisible(true);
        cb3.setVisible(true);
        cb4.setVisible(true);
        cb5.setVisible(true);
        cb6.setVisible(true);
        
        lblSub1.setVisible(true);
        lblSub2.setVisible(true);
        lblSub3.setVisible(true);
        lblSub4.setVisible(true);
        lblSub5.setVisible(true);
        lblSub6.setVisible(true);
        
        lblTeach1.setVisible(true);
        lblTeach2.setVisible(true);
        lblTeach3.setVisible(true);
        lblTeach4.setVisible(true);
        lblTeach5.setVisible(true);
        lblTeach6.setVisible(true);
           
       }
       else
       {
        txtFirstSubject.setVisible(false);
        txtSecondSubject.setVisible(false);
        txtThirdSubject.setVisible(false);
        txtFourthSubject.setVisible(false);
        txtFifthSubject.setVisible(false);
        txtSixthSubject.setVisible(false);
        
        txtFirstTeacher.setVisible(false);
        txtSecondTeacher.setVisible(false);
        txtThirdTeacher.setVisible(false);
        txtFourthTeacher.setVisible(false);
        txtFifthTeacher.setVisible(false);
        txtSixthTeacher.setVisible(false);
        
        cb1.setVisible(false);
        cb2.setVisible(false);
        cb3.setVisible(false);
        cb4.setVisible(false);
        cb5.setVisible(false);
        cb6.setVisible(false);
        
        lblSub1.setVisible(false);
        lblSub2.setVisible(false);
        lblSub3.setVisible(false);
        lblSub4.setVisible(false);
        lblSub5.setVisible(false);
        lblSub6.setVisible(false);
        
        lblTeach1.setVisible(false);
        lblTeach2.setVisible(false);
        lblTeach3.setVisible(false);
        lblTeach4.setVisible(false);
        lblTeach5.setVisible(false);
        lblTeach6.setVisible(false);
        
        JOptionPane.showMessageDialog(rootPane, "Input Value must be 4-6 .... Try Again .....");
        
       }
       
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String sem=txtSem.getText();
        String input=txtInput.getText();
        String session=txtSession.getText();
        String[] days={"MON","TUE","WED","THU","FRI"};
        String[] batches={"Batch-A","Batch-B"};
        int max_labs=4;
        int max_theory=4;
        ArrayList<String> subjects=new ArrayList<>();
        ArrayList<String> labs=new ArrayList<>();
        String[] lab1=new String[max_labs+1];
        String[] lab2=new String[max_labs+1];
        String[] lab1_teacher=new String[max_labs+1];
        String[] lab2_teacher=new String[max_labs+1];
        ArrayList<String> teachers=new ArrayList<>();
        ArrayList<String> labs_teachers=new ArrayList<>();
        Random rand=new Random();
        int count1=0;
        int count=0;
        
        try
            {
                if(input.equalsIgnoreCase("4"))
                {
                    
                    subjects.add(txtFirstSubject.getText());
                    subjects.add(txtSecondSubject.getText());
                    subjects.add(txtThirdSubject.getText());
                    subjects.add(txtFourthSubject.getText());
                    teachers.add(txtFirstTeacher.getText());
                    teachers.add(txtSecondTeacher.getText());
                    teachers.add(txtThirdTeacher.getText());
                    teachers.add(txtFourthTeacher.getText());
                    count=4;
                }
                
                else if(input.equalsIgnoreCase("5"))
                {
                    subjects.add(txtFirstSubject.getText());
                    subjects.add(txtSecondSubject.getText());
                    subjects.add(txtThirdSubject.getText());
                    subjects.add(txtFourthSubject.getText());
                    subjects.add(txtFifthSubject.getText());
                    teachers.add(txtFirstTeacher.getText());
                    teachers.add(txtSecondTeacher.getText());
                    teachers.add(txtThirdTeacher.getText());
                    teachers.add(txtFourthTeacher.getText());
                    teachers.add(txtFifthTeacher.getText());
                    count=5;
                    
                }
                
                
                else if(input.equalsIgnoreCase("6"))
                {
                    subjects.add(txtFirstSubject.getText());
                    subjects.add(txtSecondSubject.getText());
                    subjects.add(txtThirdSubject.getText());
                    subjects.add(txtFourthSubject.getText());
                    subjects.add(txtFifthSubject.getText());
                    subjects.add(txtSixthSubject.getText());
                    teachers.add(txtFirstTeacher.getText());
                    teachers.add(txtSecondTeacher.getText());
                    teachers.add(txtThirdTeacher.getText());
                    teachers.add(txtFourthTeacher.getText());
                    teachers.add(txtFifthTeacher.getText());
                    teachers.add(txtSixthTeacher.getText());
                    count=6;
                    
                }
                int[] rand1=new int[5];
                int[][] array=new int[5][5];
                
                
                rand1[0]=rand.nextInt((count - 1) + 1);
                rand1[1]=rand.nextInt((count - 1) + 1);
                rand1[2]=rand.nextInt((count - 1) + 1);
                rand1[3]=rand.nextInt((count - 1) + 1);
                rand1[4]=rand.nextInt((count - 1) + 1);
                
                ArrayList<Integer> rands=new ArrayList<>();
                rands.add(rand1[0]);
                rands.add(rand1[1]);
                rands.add(rand1[2]);
                rands.add(rand1[3]);
                rands.add(rand1[4]);
                
                int counter=0;
                int k=0;
                
                Map<Integer, Integer> m = new HashMap<Integer, Integer>();
                
                for(int ii:rands)
                {
                 
                    for(int jj:rands)
                    {
                        if(ii==jj)
                        {
                            counter++;
                            
                        }
                    }
                    m.put(k, counter);
                    counter=0;
                    k++;
                    
                }
                int status=0;
                for (Map.Entry<Integer, Integer> e : m.entrySet()) 
                {
                    if (e.getValue() > 2) 
                    {
                        
                        for (Map.Entry<Integer, Integer> e1 : m.entrySet()) 
                        {
                            if (e1.getValue() <= 1) 
                            {
                                rand1[e.getKey()]=rand1[e1.getKey()];
                                status=1;
                                break;
                            }
                        }
                        
                    }
                    if(status==1)
                        {
                            break;
                        }
                }
                 
                     array[0][0]=rand1[0];
                     array[0][1]=rand1[1];
                     array[0][2]=rand1[2];
                     array[0][3]=rand1[3];
                     array[0][4]=rand1[4];
                        
                rand1[0]=rand.nextInt((count - 1) + 1);
                rand1[1]=rand.nextInt((count - 1) + 1);
                rand1[2]=rand.nextInt((count - 1) + 1);
                rand1[3]=rand.nextInt((count - 1) + 1);
                rand1[4]=rand.nextInt((count - 1) + 1);
                
                rands=new ArrayList<>();
                rands.add(rand1[0]);
                rands.add(rand1[1]);
                rands.add(rand1[2]);
                rands.add(rand1[3]);
                rands.add(rand1[4]);
                
                counter=0;
                k=0;
                m = new HashMap<Integer, Integer>();
                
                for(int ii:rands)
                {
                 
                    for(int jj:rands)
                    {
                        if(ii==jj)
                        {
                            counter++;
                            
                        }
                    }
                    m.put(k, counter);
                    counter=0;
                    k++;
                    
                }
                status=0;
                for (Map.Entry<Integer, Integer> e : m.entrySet()) 
                {
                    if (e.getValue() > 2) 
                    {
                        
                        for (Map.Entry<Integer, Integer> e1 : m.entrySet()) 
                        {
                            if (e1.getValue() <= 1) 
                            {
                                rand1[e.getKey()]=rand1[e1.getKey()];
                                status=1;
                                break;
                            }
                        }
                        
                        
                    }
                    if(status==1)
                        {
                            break;
                        }
                }
                
                     array[1][0]=rand1[0];
                     array[1][1]=rand1[1];
                     array[1][2]=rand1[2];
                     array[1][3]=rand1[3];
                     array[1][4]=rand1[4];
                     
                rand1[0]=rand.nextInt((count - 1) + 1);
                rand1[1]=rand.nextInt((count - 1) + 1);
                rand1[2]=rand.nextInt((count - 1) + 1);
                rand1[3]=rand.nextInt((count - 1) + 1);
                rand1[4]=rand.nextInt((count - 1) + 1);
                
                rands=new ArrayList<>();
                rands.add(rand1[0]);
                rands.add(rand1[1]);
                rands.add(rand1[2]);
                rands.add(rand1[3]);
                rands.add(rand1[4]);
                
                counter=0;
                k=0;
                m = new HashMap<Integer, Integer>();
                
                for(int ii:rands)
                {
                 
                    for(int jj:rands)
                    {
                        if(ii==jj)
                        {
                            counter++;
                            
                        }
                    }
                    m.put(k, counter);
                    counter=0;
                    k++;
                    
                }
                
                status=0;
                for (Map.Entry<Integer, Integer> e : m.entrySet()) 
                {
                    if (e.getValue() > 2) 
                    {
                        
                        for (Map.Entry<Integer, Integer> e1 : m.entrySet()) 
                        {
                            if (e1.getValue() <= 1) 
                            {
                                rand1[e.getKey()]=rand1[e1.getKey()];
                                status=1;
                                break;
                            }
                        }
                        
                        
                    }
                    if(status==1)
                        {
                            break;
                        }
                }
                
                     array[2][0]=rand1[0];
                     array[2][1]=rand1[1];
                     array[2][2]=rand1[2];
                     array[2][3]=rand1[3];
                     array[2][4]=rand1[4];
                
                rand1[0]=rand.nextInt((count - 1) + 1);
                rand1[1]=rand.nextInt((count - 1) + 1);
                rand1[2]=rand.nextInt((count - 1) + 1);
                rand1[3]=rand.nextInt((count - 1) + 1);
                rand1[4]=rand.nextInt((count - 1) + 1);
                
                rands=new ArrayList<>();
                rands.add(rand1[0]);
                rands.add(rand1[1]);
                rands.add(rand1[2]);
                rands.add(rand1[3]);
                rands.add(rand1[4]);
                
                counter=0;
                k=0;
                m = new HashMap<Integer, Integer>();
                
                for(int ii:rands)
                {
                 
                    for(int jj:rands)
                    {
                        if(ii==jj)
                        {
                            counter++;
                            
                        }
                    }
                    m.put(k, counter);
                    counter=0;
                    k++;
                    
                }
                status=0;
                for (Map.Entry<Integer, Integer> e : m.entrySet()) 
                {
                    if (e.getValue() > 2) 
                    {
                        
                        for (Map.Entry<Integer, Integer> e1 : m.entrySet()) 
                        {
                            if (e1.getValue() <= 1) 
                            {
                                rand1[e.getKey()]=rand1[e1.getKey()];
                                status=1;
                                break;
                            }
                        }
                       
                    }
                    if(status==1)
                        {
                            break;
                        }
                }
                
                     array[3][0]=rand1[0];
                     array[3][1]=rand1[1];
                     array[3][2]=rand1[2];
                     array[3][3]=rand1[3];
                     array[3][4]=rand1[4];
                
                rand1[0]=rand.nextInt((count - 1) + 1);
                rand1[1]=rand.nextInt((count - 1) + 1);
                rand1[2]=rand.nextInt((count - 1) + 1);
                rand1[3]=rand.nextInt((count - 1) + 1);
                rand1[4]=rand.nextInt((count - 1) + 1);
                
                rands=new ArrayList<>();
                rands.add(rand1[0]);
                rands.add(rand1[1]);
                rands.add(rand1[2]);
                rands.add(rand1[3]);
                rands.add(rand1[4]);
                
                counter=0;
                k=0;
                m = new HashMap<Integer, Integer>();
                
                for(int ii:rands)
                {
                 
                    for(int jj:rands)
                    {
                        if(ii==jj)
                        {
                            counter++;
                            
                        }
                    }
                    m.put(k, counter);
                    counter=0;
                    k++;
                    
                }
                
               status=0;
                for (Map.Entry<Integer, Integer> e : m.entrySet()) 
                {
                    if (e.getValue() > 2) 
                    {
                        
                        for (Map.Entry<Integer, Integer> e1 : m.entrySet()) 
                        {
                            if (e1.getValue() <= 1) 
                            {
                                rand1[e.getKey()]=rand1[e1.getKey()];
                                status=1;
                                break;
                            }
                        }
                        
                        
                    }
                    if(status==1)
                        {
                            break;
                        }
                }
                
                     array[4][0]=rand1[0];
                     array[4][1]=rand1[1];
                     array[4][2]=rand1[2];
                     array[4][3]=rand1[3];
                     array[4][4]=rand1[4];
                
                st=frm.getCon().createStatement();
                Statement st1=frm.getCon().createStatement();
                Statement st2=frm.getCon().createStatement();
                rs=st.executeQuery("select * from time_table_student where sem='"+sem+"' and session='"+session+"'");
                if(rs.next())
                {
                 JOptionPane.showMessageDialog(rootPane, "Duplicate Value of Sem and Session...");
                }
                else
                {
                   count1=0;
                    if(cb1.isSelected() && count1<=max_labs) 
        {
            count1++;
            labs.add(txtFirstSubject.getText());
            labs_teachers.add(txtFirstTeacher.getText());
        }
        if(cb2.isSelected() && count1<=max_labs) 
        {
            count1++;
            labs.add(txtSecondSubject.getText());
            labs_teachers.add(txtSecondTeacher.getText());
        }
        if(cb3.isSelected() && count1<=max_labs) 
        {
            count1++;
            labs.add(txtThirdSubject.getText());
            labs_teachers.add(txtThirdTeacher.getText());
        }
        if(cb4.isSelected() && count1<=max_labs) 
        {
            count1++;
            labs.add(txtFourthSubject.getText());
            labs_teachers.add(txtFourthTeacher.getText());
        }
        if(cb5.isSelected() && count1<=max_labs) 
        {
            count1++;
            labs.add(txtFifthSubject.getText());
            labs_teachers.add(txtFifthTeacher.getText());
        }
        if(cb6.isSelected() && count1<=max_labs) 
        {
            count1++;
            labs.add(txtSixthSubject.getText());
            labs_teachers.add(txtSixthTeacher.getText());
        }
                    
        
                    
                    if(input.equalsIgnoreCase("4"))
                    {
                        
                        lab1[0]=labs.get(0);
        lab1[1]=labs.get(1);
        lab1[2]="NA";
        lab1[3]="NA";
        lab1[4]="NA";
        lab2[0]=labs.get(1);
        lab2[1]=labs.get(0);
        lab2[2]="NA";
        lab2[3]="NA";
        lab2[4]="NA";
        lab1_teacher[0]=labs_teachers.get(0);
        lab1_teacher[1]=labs_teachers.get(1);
        lab1_teacher[2]="NA";
        lab1_teacher[3]="NA";
        lab1_teacher[4]="NA";
        lab2_teacher[0]=labs_teachers.get(1);
        lab2_teacher[1]=labs_teachers.get(0);
        lab2_teacher[2]="NA";
        lab2_teacher[3]="NA";
        lab2_teacher[4]="NA";
                        st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtFirstTeacher.getText()+"','"+txtFirstSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtSecondTeacher.getText()+"','"+txtSecondSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtThirdTeacher.getText()+"','"+txtThirdSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtFourthTeacher.getText()+"','"+txtFourthSubject.getText()+"','"
                    +sem
                    +"')");
                    
                    }
                    
                    else if(input.equalsIgnoreCase("5"))
                    {
                        st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtFirstTeacher.getText()+"','"+txtFirstSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtSecondTeacher.getText()+"','"+txtSecondSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtThirdTeacher.getText()+"','"+txtThirdSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtFourthTeacher.getText()+"','"+txtFourthSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtFifthTeacher.getText()+"','"+txtFifthSubject.getText()+"','"
                    +sem
                    +"')");
                    
                    lab1[0]=labs.get(0);
        lab1[1]=labs.get(1);
        lab1[2]="NA";
        lab1[3]="NA";
        lab1[4]="NA";
        lab2[0]=labs.get(1);
        lab2[1]=labs.get(0);
        lab2[2]="NA";
        lab2[3]="NA";
        lab2[4]="NA";
        lab1_teacher[0]=labs_teachers.get(0);
        lab1_teacher[1]=labs_teachers.get(1);
        lab1_teacher[2]="NA";
        lab1_teacher[3]="NA";
        lab1_teacher[4]="NA";
        lab2_teacher[0]=labs_teachers.get(1);
        lab2_teacher[1]=labs_teachers.get(0);
        lab2_teacher[2]="NA";
        lab2_teacher[3]="NA";
        lab2_teacher[4]="NA";
        
                    
                    }
                    
                    else if(input.equalsIgnoreCase("6"))
                    {
                        st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtFirstTeacher.getText()+"','"+txtFirstSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtSecondTeacher.getText()+"','"+txtSecondSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtThirdTeacher.getText()+"','"+txtThirdSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtFourthTeacher.getText()+"','"+txtFourthSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtFifthTeacher.getText()+"','"+txtFifthSubject.getText()+"','"
                    +sem
                    +"')");
                    st1.execute("insert into teachers(tname,sname,sem"
                    + ") values('"
                    +txtSixthTeacher.getText()+"','"+txtSixthSubject.getText()+"','"
                    +sem
                    +"')");
                    lab1[0]=labs.get(0);
        lab1[1]=labs.get(1);
        lab1[2]=labs.get(2);
        lab1[3]=labs.get(3);
        lab1[4]="NA";
        lab2[0]=labs.get(1);
        lab2[1]=labs.get(0);
        lab2[2]=labs.get(3);
        lab2[3]=labs.get(2);
        lab2[4]="NA";
        lab1_teacher[0]=labs_teachers.get(0);
        lab1_teacher[1]=labs_teachers.get(1);
        lab1_teacher[2]=labs_teachers.get(2);
        lab1_teacher[3]=labs_teachers.get(3);
        lab1_teacher[4]="NA";
        lab2_teacher[0]=labs_teachers.get(1);
        lab2_teacher[1]=labs_teachers.get(0);
        lab2_teacher[2]=labs_teachers.get(3);
        lab2_teacher[3]=labs_teachers.get(2);
        lab2_teacher[4]="NA";
        
                    }
                    
                    
                    File file = new File("Time_Table_"+sem+"_"+session+".csv");  
                FileWriter fw = new FileWriter(file);
                BufferedWriter writer = new BufferedWriter(fw); 
                writer.write("Guru Tegh Bahadur Institute of Technology");
                writer.newLine();
                writer.write("Time Table");
                writer.newLine();
                writer.write(sem+","+session);
                writer.newLine();
                writer.write("Days/Time");
              writer.write(",");
              writer.write("8:00-9:00"); 
              writer.write(",");
              writer.write("9:00-10:00"); 
              writer.write(",");
              writer.write("10:00-11:00"); 
              writer.write(",");
              writer.write("11:00-12:00"); 
              writer.write(",");
              writer.write("12:00-12:30"); 
              writer.write(",");
              writer.write("12:30-1:30"); 
              writer.write(",");
              writer.write("BatchA-1:30-3:30"); 
              writer.write(",");
              writer.write("BatchB-1:30-3:30"); 
                    
                    for(int i=0;i<5;i++)
                {
                  
                    
                st2.execute("insert into time_table_student(day1,p1,p2,p3,p4"
                    + ",p5,lab1,lab2,sem,session) values('"
                    +days[i]+"','"
                    +subjects.get(array[i][0])+"','"
                    +subjects.get(array[i][1])+"','"
                    +subjects.get(array[i][2])+"','"
                    +subjects.get(array[i][3])+"','"
                    +subjects.get(array[i][4])+"','"
                    +lab1[i]+"','"
                    +lab2[i]+"','"
                    +sem+"','"
                    +session
                    +"')");
                st2.execute("insert into time_table_teacher(day1,p1,p2,p3,p4"
                    + ",p5,lab1,lab2,sem,session) values('"
                    +days[i]+"','"
                    +teachers.get(array[i][0])+"','"
                    +teachers.get(array[i][1])+"','"
                    +teachers.get(array[i][2])+"','"
                    +teachers.get(array[i][3])+"','"
                    +teachers.get(array[i][4])+"','"
                    +lab1_teacher[i]+"','"
                    +lab2_teacher[i]+"','"
                    +sem+"','"
                    +session
                    +"')");
                writer.newLine();
                writer.write(days[i]);
              writer.write(",");
              writer.write(subjects.get(array[i][0])+"_"+teachers.get(array[i][0])); 
              writer.write(",");
              writer.write(subjects.get(array[i][1])+"_"+teachers.get(array[i][1])); 
              writer.write(",");
              writer.write(subjects.get(array[i][2])+"_"+teachers.get(array[i][2])); 
              writer.write(",");
              writer.write(subjects.get(array[i][3])+"_"+teachers.get(array[i][3])); 
              writer.write(",");
              writer.write("RECESS"); 
              writer.write(",");
              writer.write(subjects.get(array[i][4])+"_"+teachers.get(array[i][4])); 
              writer.write(",");
              writer.write(lab1[i]+"_"+lab1_teacher[i]); 
              writer.write(",");
              writer.write(lab2[i]+"_"+lab2_teacher[i]); 
                    
                }
                    writer.flush();
        writer.close();
        fw.close();            
        
                frm.closeCon();
                JOptionPane.showMessageDialog(rootPane, "Time Schedule is Generated Successfully.");
                this.dispose();
                new frmViewTimeTableAdmin(sem, session).setVisible(true);
                }

            }
            catch(Exception ex)
            {
                
            }

    }//GEN-LAST:event_jButton3ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JCheckBox cb6;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSub1;
    private javax.swing.JLabel lblSub2;
    private javax.swing.JLabel lblSub3;
    private javax.swing.JLabel lblSub4;
    private javax.swing.JLabel lblSub5;
    private javax.swing.JLabel lblSub6;
    private javax.swing.JLabel lblTeach1;
    private javax.swing.JLabel lblTeach2;
    private javax.swing.JLabel lblTeach3;
    private javax.swing.JLabel lblTeach4;
    private javax.swing.JLabel lblTeach5;
    private javax.swing.JLabel lblTeach6;
    private javax.swing.JTextField txtFifthSubject;
    private javax.swing.JTextField txtFifthTeacher;
    private javax.swing.JTextField txtFirstSubject;
    private javax.swing.JTextField txtFirstTeacher;
    private javax.swing.JTextField txtFourthSubject;
    private javax.swing.JTextField txtFourthTeacher;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtSecondSubject;
    private javax.swing.JTextField txtSecondTeacher;
    private javax.swing.JTextField txtSem;
    private javax.swing.JTextField txtSession;
    private javax.swing.JTextField txtSixthSubject;
    private javax.swing.JTextField txtSixthTeacher;
    private javax.swing.JTextField txtThirdSubject;
    private javax.swing.JTextField txtThirdTeacher;
    // End of variables declaration//GEN-END:variables

}
