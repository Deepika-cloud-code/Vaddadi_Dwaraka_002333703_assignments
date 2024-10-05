/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.mainJFrame;

import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Dwaraka Deepika vadd
 */
public class MainJFrame extends javax.swing.JFrame {
    private PersonDirectory personDirectory;
    
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.personDirectory=new PersonDirectory();
        generateDemoDate();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topJPanel = new javax.swing.JPanel();
        btnManageOrCreate = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnManageOrCreate.setText("Manage or Create from here!!");
        btnManageOrCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topJPanelLayout = new javax.swing.GroupLayout(topJPanel);
        topJPanel.setLayout(topJPanelLayout);
        topJPanelLayout.setHorizontalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topJPanelLayout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(btnManageOrCreate)
                .addGap(245, 245, 245))
        );
        topJPanelLayout.setVerticalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnManageOrCreate)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(topJPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageOrCreateActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrCreate;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel topJPanel;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

    private void generateDemoDate() {
        
         Person newPerson =personDirectory.addPerson();
        newPerson.setFirstName("Rachel");
        newPerson.setLastName("Green");
        newPerson.setAge(21);
        newPerson.setGender('F');
        newPerson.setSSN("784676374576");
        
        newPerson.getWorkAddress().setCity("Boston");
        newPerson.getWorkAddress().setState("MA");
        newPerson.getWorkAddress().setStreetAddress("123 tremont st");
        newPerson.getWorkAddress().setZipCode(21130L);
        newPerson.getWorkAddress().setPhoneNumber("1234567890");
        
        newPerson.getHomeAddress().setCity("Boston");
        newPerson.getHomeAddress().setState("MA");
        newPerson.getHomeAddress().setStreetAddress("103 Huntington Ave");
        newPerson.getHomeAddress().setZipCode(21340L);
        newPerson.getHomeAddress().setPhoneNumber("9837765763");
        
        
        
        
         Person NewPerson1 =personDirectory.addPerson();
        NewPerson1.setFirstName("Monica");
        NewPerson1.setLastName("Geller");
        NewPerson1.setAge(23);
        NewPerson1.setGender('F');
        NewPerson1.setSSN("284675474579");
        
        NewPerson1.getWorkAddress().setCity("Boston");
        NewPerson1.getWorkAddress().setState("MA");
        NewPerson1.getWorkAddress().setStreetAddress("123 tremont st");
        NewPerson1.getWorkAddress().setZipCode(21030L);
        NewPerson1.getWorkAddress().setPhoneNumber("1234567890");
        
        NewPerson1.getHomeAddress().setCity("Boston");
        NewPerson1.getHomeAddress().setState("MA");
        NewPerson1.getHomeAddress().setStreetAddress("204 Huntington Ave");
        NewPerson1.getHomeAddress().setZipCode(21350L);
        NewPerson1.getHomeAddress().setPhoneNumber("7637765763");
        
    }
}