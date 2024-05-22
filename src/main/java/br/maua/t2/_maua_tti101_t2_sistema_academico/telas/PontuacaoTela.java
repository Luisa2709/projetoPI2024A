/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.maua.t2._maua_tti101_t2_sistema_academico.telas;

import br.maua.t2._maua_tti101_t2_sistema_academico.modelo.Usuario;


/**
 *
 * @author luisa
 */
public class PontuacaoTela extends javax.swing.JFrame {

    /**
     * Creates new form PontuacaoTela
     */
    public PontuacaoTela() {
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
        jLabel3 = new javax.swing.JLabel();
        fimButton = new javax.swing.JButton();
        pontuaçãoUsuário = new javax.swing.JLabel();
        imagemCrianças = new javax.swing.JLabel();
        parabéns = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        fimButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fimButton.setText("FIM");
        fimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fimButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fimButton);
        fimButton.setBounds(250, 350, 130, 70);

        pontuaçãoUsuário.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pontuaçãoUsuário.setText(String.valueOf(Usuario.pontuacao));
        getContentPane().add(pontuaçãoUsuário);
        pontuaçãoUsuário.setBounds(290, 280, 110, 16);

        imagemCrianças.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/criancas novas.png"))); // NOI18N
        getContentPane().add(imagemCrianças);
        imagemCrianças.setBounds(210, 140, 230, 110);

        parabéns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/parabens.png"))); // NOI18N
        getContentPane().add(parabéns);
        parabéns.setBounds(110, 20, 420, 150);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela azul.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(-10, 0, 610, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fimButtonActionPerformed
        new LoginTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fimButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PontuacaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PontuacaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PontuacaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PontuacaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PontuacaoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fimButton;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel imagemCrianças;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel parabéns;
    private javax.swing.JLabel pontuaçãoUsuário;
    // End of variables declaration//GEN-END:variables
}
