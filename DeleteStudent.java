/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;
import static project.Student.student;
import static project.Student.counter;

/**
 *
 * @author Star Goh
 */
public class DeleteStudent extends javax.swing.JFrame {

    public static int i = 0;

    /**
     * Creates new form DeleteStudent
     */
    public DeleteStudent() {
        initComponents();
        setLocationRelativeTo(null);
        SV.setEnabled(false);
        Matric.setEnabled(false);
        Name.setEnabled(false);
        CW.setEnabled(false);
        Final.setEnabled(false);
        SV.setEnabled(false);
        TypeCB.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        LabelName = new javax.swing.JLabel();
        SearchBTN = new javax.swing.JToggleButton();
        Name = new javax.swing.JTextField();
        LabelCWMark = new javax.swing.JLabel();
        TypeCB = new javax.swing.JComboBox<>();
        CW = new javax.swing.JTextField();
        DeleteBTN = new javax.swing.JButton();
        LabelCWMark1 = new javax.swing.JLabel();
        Final = new javax.swing.JTextField();
        LabelStudentType = new javax.swing.JLabel();
        LabelMatric = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Matric = new javax.swing.JTextField();
        MatricField = new javax.swing.JTextField();
        SV = new javax.swing.JTextField();
        comment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Student Data");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Delete Student Data");

        LabelName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelName.setText("Name: ");

        SearchBTN.setText("Search");
        SearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBTNActionPerformed(evt);
            }
        });

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        LabelCWMark.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCWMark.setText("Coursework Mark:");

        TypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Undergraduate", "Postgraduate" }));
        TypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeCBActionPerformed(evt);
            }
        });

        DeleteBTN.setText("Delete");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        LabelCWMark1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCWMark1.setText("Final Mark:");

        Final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalActionPerformed(evt);
            }
        });

        LabelStudentType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelStudentType.setText("Student Type:");

        LabelMatric.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelMatric.setText("Matric Number:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Supervisor Name:");

        jLabel1.setText("Enter Matric Number:");

        Matric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatricActionPerformed(evt);
            }
        });

        SV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(LabelMatric)
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Matric)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LabelCWMark)
                                            .addComponent(LabelCWMark1)
                                            .addComponent(LabelStudentType))
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Final)
                                    .addComponent(SV)
                                    .addComponent(CW, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(TypeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MatricField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(DeleteBTN)))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(comment, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MatricField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMatric, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Matric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCWMark)
                    .addComponent(CW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCWMark1)
                    .addComponent(Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelStudentType)
                    .addComponent(TypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(SV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comment, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteBTN)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBTNActionPerformed
        try {
            int flag = 0;
            String search = MatricField.getText().trim();
            int MatricSrch = Integer.parseInt(search);
            for (i = 0; i < student.size(); i++) {
                if (MatricSrch == student.get(i).getMatric()) {

                    setStudentData();
                    flag = 1;
                }

            }
            if (flag != 1) {
                flag = 2;

            }
            if (flag == 2) {
                JOptionPane.showMessageDialog(null, "Student Not Found!");
            }
        } catch (NumberFormatException ee) {
            JOptionPane.showMessageDialog(null, "Please enter valid Information!");

        }

    }//GEN-LAST:event_SearchBTNActionPerformed


    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void TypeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeCBActionPerformed

        int index = TypeCB.getSelectedIndex();
        if (index == 2) {
            SV.setEnabled(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_TypeCBActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        try {
            String search = MatricField.getText().trim();
            int MatricSrch = Integer.parseInt(search);
            for (i = 0; i < student.size(); i++) {
                if (MatricSrch == student.get(i).getMatric()) {

                    DeleteStudentData();
                }
            }
        } catch (NumberFormatException ee) {
            JOptionPane.showMessageDialog(null, "Please enter valid Information!");

        }

    }//GEN-LAST:event_DeleteBTNActionPerformed
    public void setStudentData() {

        if (i == 0) {
            i = 0;
        }

        Matric.setText("" + student.get(i).getMatric());
        Name.setText("" + student.get(i).getName());
        CW.setText("" + student.get(i).getcwMark());
        Final.setText("" + student.get(i).getFinalMark());

        if (student.get(i).getType().equals("Undergraduate")) {
            TypeCB.setSelectedIndex(1);
            SV.setEnabled(false);
        } else if (student.get(i).getType().equals("Postgraduate")) {
            TypeCB.setSelectedIndex(2);
            SV.setEnabled(false);
            SV.setText("" + student.get(i).getSVName());

        }
        comment.setText("Are you sure to delete this student?");
    }
    private void FinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FinalActionPerformed

    private void MatricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatricActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatricActionPerformed

    private void SVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SVActionPerformed
    public void DeleteStudentData() {
        int save = 1, flag = 1;

        if (i == 0) {
            i = 0;
        }

        student.remove(i);
        JOptionPane.showMessageDialog(null, "Data Was Sucessfully Deleted!");
        Name.setText("");
        Matric.setText("");
        CW.setText("");
        Final.setText("");
        SV.setText("");
        TypeCB.setSelectedIndex(0);
        comment.setText("");
        MatricField.setText("");

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
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CW;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JTextField Final;
    private javax.swing.JLabel LabelCWMark;
    private javax.swing.JLabel LabelCWMark1;
    private javax.swing.JLabel LabelMatric;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelStudentType;
    private javax.swing.JTextField Matric;
    private javax.swing.JTextField MatricField;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField SV;
    private javax.swing.JToggleButton SearchBTN;
    private javax.swing.JComboBox<String> TypeCB;
    private javax.swing.JLabel comment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}