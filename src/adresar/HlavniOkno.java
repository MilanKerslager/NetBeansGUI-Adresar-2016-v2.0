/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adresar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ke
 */
public class HlavniOkno extends javax.swing.JFrame {

    private ArrayList<Záznam> seznam = new ArrayList<Záznam>();
    private int index;
    private DefaultListModel emailseznam;
    // regulární výraz, který ověřuje korektní zápis e-mailové adresy
    Pattern rexEmail = Pattern.compile("\\b[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}\\b");
    /**
     * Creates new form HlavniOkno
     */
    public HlavniOkno() {
        initComponents();
        index = 0;
        seznam.add(new Záznam());
        // vytvoření modelu a propojení s jList
        emailseznam = new DefaultListModel();
        jListAdresy.setModel(emailseznam);
    }

    private void zapisDoZaznamu(int index) {
        seznam.get(index).setJmeno(jTextFieldJmeno.getText());
        seznam.get(index).setPrijmeni(jTextFieldPrijmeni.getText());
        if (jRadioButtonMuz.isSelected()) {
            seznam.get(index).setJemuz(true);
        } else {
            seznam.get(index).setJemuz(false);
        }
        seznam.get(index).setStav(jComboBoxStav.getSelectedIndex());
        // zápis e-mailů do záznamu
        seznam.get(index).setSeznamemailu(Collections.list(emailseznam.elements()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldJmeno = new javax.swing.JTextField();
        jTextFieldPrijmeni = new javax.swing.JTextField();
        jRadioButtonMuz = new javax.swing.JRadioButton();
        jRadioButtonZena = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxStav = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAdresy = new javax.swing.JList<>();
        jButtonPridatE = new javax.swing.JButton();
        jButtonSmazatE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Osobní údaje"));

        jLabel1.setText("Jméno:");

        jLabel2.setText("Příjmení:");

        buttonGroup1.add(jRadioButtonMuz);
        jRadioButtonMuz.setSelected(true);
        jRadioButtonMuz.setText("muž");
        jRadioButtonMuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMuzActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonZena);
        jRadioButtonZena.setText("žena");
        jRadioButtonZena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonZenaActionPerformed(evt);
            }
        });

        jLabel3.setText("Stav:");

        jComboBoxStav.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "svobodný", "ženatý/vdaná", "rozvedený" }));

        jLabel4.setText("Fotka:");

        jLabel5.setText("Pohlaví:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldJmeno)
                            .addComponent(jTextFieldPrijmeni)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonMuz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonZena)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(73, 73, 73))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxStav, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldJmeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPrijmeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMuz)
                    .addComponent(jRadioButtonZena)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxStav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("E-maily"));

        jListAdresy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAdresyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListAdresy);

        jButtonPridatE.setText("Přidat");
        jButtonPridatE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPridatEActionPerformed(evt);
            }
        });

        jButtonSmazatE.setText("Smazat");
        jButtonSmazatE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSmazatEActionPerformed(evt);
            }
        });

        jButton1.setText("Debug!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmail)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPridatE)
                    .addComponent(jButton1)
                    .addComponent(jButtonSmazatE, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButtonPridatE, jButtonSmazatE});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPridatE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSmazatE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMuzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMuzActionPerformed

    private void jRadioButtonZenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonZenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonZenaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        zapisDoZaznamu(index);
        seznam.get(index).predstavSe();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPridatEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPridatEActionPerformed
        jTextFieldEmail.setText(jTextFieldEmail.getText().toLowerCase());
        Matcher isEmail = rexEmail.matcher(jTextFieldEmail.getText());
        if (! isEmail.find()) {
            JOptionPane.showMessageDialog(this,
                    "Zadaný řetězec není e-mailová adresa!", "Chyba",
                    JOptionPane.ERROR_MESSAGE);
        } else { 
            if (! jTextFieldEmail.getText().isEmpty() &&
                    ! emailseznam.contains(jTextFieldEmail.getText()))
                emailseznam.addElement(jTextFieldEmail.getText());
            jListAdresy.setSelectedIndex(emailseznam.lastIndexOf(jTextFieldEmail.getText()));
        }
    }//GEN-LAST:event_jButtonPridatEActionPerformed

    private void jListAdresyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAdresyMouseClicked
        jTextFieldEmail.setText(jListAdresy.getSelectedValue());
    }//GEN-LAST:event_jListAdresyMouseClicked

    private void jButtonSmazatEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSmazatEActionPerformed
        jTextFieldEmail.setText(jListAdresy.getSelectedValue());
        emailseznam.remove(jListAdresy.getSelectedIndex());
    }//GEN-LAST:event_jButtonSmazatEActionPerformed

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
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HlavniOkno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPridatE;
    private javax.swing.JButton jButtonSmazatE;
    private javax.swing.JComboBox<String> jComboBoxStav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListAdresy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonMuz;
    private javax.swing.JRadioButton jRadioButtonZena;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldJmeno;
    private javax.swing.JTextField jTextFieldPrijmeni;
    // End of variables declaration//GEN-END:variables
}
