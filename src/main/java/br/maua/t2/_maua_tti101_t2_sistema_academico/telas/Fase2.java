/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.maua.t2._maua_tti101_t2_sistema_academico.telas;

import br.maua.t2._maua_tti101_t2_sistema_academico.db.UsuarioDAO;
import br.maua.t2._maua_tti101_t2_sistema_academico.modelo.Usuario;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JToggleButton;

/**
 *
 * @author luisa
 */
public class Fase2 extends javax.swing.JFrame {
    private javax.swing.JToggleButton botãoAnteriorPressionado;

    private boolean temDoisBotõesPressionados() {
        javax.swing.JToggleButton[] buttons = {
            botaoLivrosButton, 
            botaoTresButton, 
            botaoDoisButton, 
            botaoLapisButton, 
            botaoUmButton, 
            botaoMochilaButton, 
            botaoBorrachasButton, 
            botaoQuatroButton
        };


        for (int i = 0; i < buttons.length; i++) {
            for (int j = i + 1; j < buttons.length; j++) {
                if (buttons[i].isSelected() && buttons[j].isSelected()) {
                    return true;
                }
            }
        }

        return false;
    }
    
    private boolean todosBotoõesEstãoDesativados() {
        javax.swing.JToggleButton[] buttons = {
            botaoLivrosButton, 
            botaoTresButton, 
            botaoDoisButton, 
            botaoLapisButton, 
            botaoUmButton, 
            botaoMochilaButton, 
            botaoBorrachasButton, 
            botaoQuatroButton
        };
        
        for (JToggleButton button : buttons) {
            if (button.isEnabled()) {
                return false;
            }
        }

        return true;
    }

    private void verifica_fase(javax.swing.JToggleButton botãoPressionado){
        if (temDoisBotõesPressionados()) {
            if ((botãoPressionado == botaoLivrosButton && botãoAnteriorPressionado == botaoTresButton) || (botãoAnteriorPressionado == botaoLivrosButton && botãoPressionado == botaoTresButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botaoDoisButton && botãoAnteriorPressionado == botaoLapisButton) || (botãoAnteriorPressionado == botaoDoisButton && botãoPressionado == botaoLapisButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botaoUmButton && botãoAnteriorPressionado == botaoMochilaButton) || (botãoAnteriorPressionado == botaoUmButton && botãoPressionado == botaoMochilaButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botaoBorrachasButton && botãoAnteriorPressionado == botaoQuatroButton) || (botãoAnteriorPressionado == botaoBorrachasButton && botãoPressionado == botaoQuatroButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else {
                Usuario.pontuacao = Usuario.pontuacao - 25;
                botãoAnteriorPressionado.setEnabled(true);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
                botãoPressionado.setSelected(false);
            }
            
            if (todosBotoõesEstãoDesativados()) {
                Usuario.Fase2 = true;
                if (!Usuario.Fase1) {
                    new Fase1().setVisible(true);
                    this.dispose();
                } else if (!Usuario.Fase3) {
                    new Fase3().setVisible(true);
                    this.dispose();
                } else if (!Usuario.Fase4) {
                    new Fase4().setVisible(true);
                    this.dispose();
                } else {
                    var usuario = new Usuario();
                    usuario.setLogin(Usuario.login);
                    var dao = new UsuarioDAO();
                    try {
                        dao.pontuar(usuario);
                    } catch (Exception ex) {
                        Logger.getLogger(Fase1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    new PontuacaoTela().setVisible(true);
                    this.dispose();
                }
            }
        } else {
            botãoPressionado.setEnabled(false);
            botãoAnteriorPressionado = botãoPressionado;
        }
    }
    
    /**
     * Creates new form Fase2
     */
    public Fase2() {
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

        botaoLivrosButton = new javax.swing.JToggleButton();
        botaoTresButton = new javax.swing.JToggleButton();
        botaoDoisButton = new javax.swing.JToggleButton();
        botaoUmButton = new javax.swing.JToggleButton();
        botaoMochilaButton = new javax.swing.JToggleButton();
        botaoLapisButton = new javax.swing.JToggleButton();
        botaoBorrachasButton = new javax.swing.JToggleButton();
        botaoQuatroButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoLivrosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/treslivros.png"))); // NOI18N
        botaoLivrosButton.setText("jToggleButton1");
        botaoLivrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLivrosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLivrosButton);
        botaoLivrosButton.setBounds(450, 240, 129, 122);

        botaoTresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numero3.png"))); // NOI18N
        botaoTresButton.setText("jToggleButton1");
        botaoTresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoTresButton);
        botaoTresButton.setBounds(310, 60, 130, 122);

        botaoDoisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numero2.png"))); // NOI18N
        botaoDoisButton.setText("jToggleButton1");
        botaoDoisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDoisButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoDoisButton);
        botaoDoisButton.setBounds(160, 60, 129, 122);

        botaoUmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numero1.png"))); // NOI18N
        botaoUmButton.setText("jToggleButton1");
        botaoUmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoUmButton);
        botaoUmButton.setBounds(20, 60, 129, 122);

        botaoMochilaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mochila.png"))); // NOI18N
        botaoMochilaButton.setText("jToggleButton1");
        botaoMochilaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMochilaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMochilaButton);
        botaoMochilaButton.setBounds(160, 240, 129, 122);

        botaoLapisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/doislapis.png"))); // NOI18N
        botaoLapisButton.setText("jToggleButton1");
        botaoLapisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLapisButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLapisButton);
        botaoLapisButton.setBounds(310, 240, 129, 120);

        botaoBorrachasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quatroborrachas.png"))); // NOI18N
        botaoBorrachasButton.setText("jToggleButton1");
        botaoBorrachasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBorrachasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoBorrachasButton);
        botaoBorrachasButton.setBounds(10, 240, 129, 122);

        botaoQuatroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeoro4.png"))); // NOI18N
        botaoQuatroButton.setText("jToggleButton1");
        botaoQuatroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoQuatroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoQuatroButton);
        botaoQuatroButton.setBounds(450, 60, 129, 122);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/branco fundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLivrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLivrosButtonActionPerformed
        verifica_fase(botaoLivrosButton);
    }//GEN-LAST:event_botaoLivrosButtonActionPerformed

    private void botaoTresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTresButtonActionPerformed
        verifica_fase(botaoTresButton);
    }//GEN-LAST:event_botaoTresButtonActionPerformed

    private void botaoDoisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDoisButtonActionPerformed
        verifica_fase(botaoDoisButton);
    }//GEN-LAST:event_botaoDoisButtonActionPerformed

    private void botaoUmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUmButtonActionPerformed
        verifica_fase(botaoUmButton);
    }//GEN-LAST:event_botaoUmButtonActionPerformed

    private void botaoMochilaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMochilaButtonActionPerformed
        verifica_fase(botaoMochilaButton);
    }//GEN-LAST:event_botaoMochilaButtonActionPerformed

    private void botaoLapisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLapisButtonActionPerformed
        verifica_fase(botaoLapisButton);
    }//GEN-LAST:event_botaoLapisButtonActionPerformed

    private void botaoBorrachasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBorrachasButtonActionPerformed
        verifica_fase(botaoBorrachasButton);
    }//GEN-LAST:event_botaoBorrachasButtonActionPerformed

    private void botaoQuatroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQuatroButtonActionPerformed
        verifica_fase(botaoQuatroButton);
    }//GEN-LAST:event_botaoQuatroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoBorrachasButton;
    private javax.swing.JToggleButton botaoDoisButton;
    private javax.swing.JToggleButton botaoLapisButton;
    private javax.swing.JToggleButton botaoLivrosButton;
    private javax.swing.JToggleButton botaoMochilaButton;
    private javax.swing.JToggleButton botaoQuatroButton;
    private javax.swing.JToggleButton botaoTresButton;
    private javax.swing.JToggleButton botaoUmButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
