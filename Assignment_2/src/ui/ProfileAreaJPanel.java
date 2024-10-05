/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.PersonDirectory;

/**
 *
 * @author Dwaraka Deepika vadd
 */
public class ProfileAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
PersonDirectory personDirectory;

    /**
     * Creates new form ProfileAreaJPanel
     */
    public ProfileAreaJPanel(JPanel container,PersonDirectory directory) {
        initComponents();
        userProcessContainer=container;
        personDirectory=directory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreatePerson = new javax.swing.JButton();
        btnManagePerson = new javax.swing.JButton();

        btnCreatePerson.setText("Create Account");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });

        btnManagePerson.setText("Manage Account");
        btnManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreatePerson, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManagePerson, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(474, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreatePerson, btnManagePerson});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnCreatePerson)
                .addGap(18, 18, 18)
                .addComponent(btnManagePerson)
                .addContainerGap(443, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
        CreateJPanel panel= new CreateJPanel(userProcessContainer,personDirectory);
        
        userProcessContainer.add("CreateAccountJPanel",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreatePersonActionPerformed

    private void btnManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonActionPerformed
        // TODO add your handling code here:
        ManagePersonJPanel panel= new ManagePersonJPanel(userProcessContainer,personDirectory);

        userProcessContainer.add("ManageAccountJPanel",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JButton btnManagePerson;
    // End of variables declaration//GEN-END:variables
}
