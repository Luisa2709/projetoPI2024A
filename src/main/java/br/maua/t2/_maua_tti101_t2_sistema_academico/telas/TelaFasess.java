/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.maua.t2._maua_tti101_t2_sistema_academico.telas;

/**
 *
 * @author luisa
 */
public class TelaFasess extends javax.swing.JFrame {

    /**
     * Creates new form TelaFasess
     */
    public TelaFasess() {
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

        botaoLetrasButton = new javax.swing.JButton();
        botaoAnimaisButton = new javax.swing.JButton();
        botaoNumerosButton = new javax.swing.JButton();
        botaoCoresButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoLetrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/letras botao.png"))); // NOI18N
        botaoLetrasButton.setText("jButton1");
        botaoLetrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetrasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLetrasButton);
        botaoLetrasButton.setBounds(320, 250, 232, 104);

        botaoAnimaisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/animais botao.png"))); // NOI18N
        botaoAnimaisButton.setText("jButton1");
        botaoAnimaisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAnimaisButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAnimaisButton);
        botaoAnimaisButton.setBounds(40, 250, 232, 103);

        botaoNumerosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros botao.png"))); // NOI18N
        botaoNumerosButton.setText("jButton1");
        botaoNumerosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNumerosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNumerosButton);
        botaoNumerosButton.setBounds(320, 80, 232, 102);

        botaoCoresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cores botao.png"))); // NOI18N
        botaoCoresButton.setText("jButton1");
        botaoCoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCoresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCoresButton);
        botaoCoresButton.setBounds(40, 80, 232, 102);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/branco fundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-445, 0, 1135, 540);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 210, 38, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCoresButtonActionPerformed
        dispose();
            new Fase1().setVisible(true);
    }//GEN-LAST:event_botaoCoresButtonActionPerformed

    private void botaoLetrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLetrasButtonActionPerformed
        dispose();
            new Fase4().setVisible(true);
    }//GEN-LAST:event_botaoLetrasButtonActionPerformed

    private void botaoNumerosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNumerosButtonActionPerformed
        dispose();
            new Fase2().setVisible(true);
    }//GEN-LAST:event_botaoNumerosButtonActionPerformed

    private void botaoAnimaisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAnimaisButtonActionPerformed
        dispose();
            new Fase3().setVisible(true);
    }//GEN-LAST:event_botaoAnimaisButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFasess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFasess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFasess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFasess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFasess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAnimaisButton;
    private javax.swing.JButton botaoCoresButton;
    private javax.swing.JButton botaoLetrasButton;
    private javax.swing.JButton botaoNumerosButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
