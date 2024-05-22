
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
public class Fase4 extends javax.swing.JFrame {
    private javax.swing.JToggleButton botãoAnteriorPressionado;

    private boolean temDoisBotõesPressionados() {
        javax.swing.JToggleButton[] buttons = {
            botaoCoracaoButton, 
            botaoCButton, 
            botaoMacaButton, 
            botaoMButton, 
            botaoElefanteButton, 
            botaoEButton, 
            botaoGataButton, 
            botaoGButton
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
            botaoCoracaoButton, 
            botaoCButton, 
            botaoMacaButton, 
            botaoMButton, 
            botaoElefanteButton, 
            botaoEButton, 
            botaoGataButton, 
            botaoGButton
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
            if ((botãoPressionado == botaoCoracaoButton && botãoAnteriorPressionado == botaoCButton) || (botãoAnteriorPressionado == botaoCoracaoButton && botãoPressionado == botaoCButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botaoMacaButton && botãoAnteriorPressionado == botaoMButton) || (botãoAnteriorPressionado == botaoMacaButton && botãoPressionado == botaoMButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botaoElefanteButton && botãoAnteriorPressionado == botaoEButton) || (botãoAnteriorPressionado == botaoElefanteButton && botãoPressionado == botaoEButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botaoGataButton && botãoAnteriorPressionado == botaoGButton) || (botãoAnteriorPressionado == botaoGataButton && botãoPressionado == botaoGButton)) {
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
                Usuario.Fase4 = true;
                if (!Usuario.Fase1) {
                    new Fase1().setVisible(true);
                    this.dispose();
                } else if (!Usuario.Fase2) {
                    new Fase2().setVisible(true);
                    this.dispose();
                } else if (!Usuario.Fase3) {
                    new Fase3().setVisible(true);
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
     * Creates new form Fase4
     */
    public Fase4() {
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

        botaoCoracaoButton = new javax.swing.JToggleButton();
        botaoMacaButton = new javax.swing.JToggleButton();
        botaoElefanteButton = new javax.swing.JToggleButton();
        botaoGataButton = new javax.swing.JToggleButton();
        botaoMButton = new javax.swing.JToggleButton();
        botaoGButton = new javax.swing.JToggleButton();
        botaoCButton = new javax.swing.JToggleButton();
        botaoEButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoCoracaoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coracao.png"))); // NOI18N
        botaoCoracaoButton.setText("jToggleButton1");
        botaoCoracaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCoracaoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCoracaoButton);
        botaoCoracaoButton.setBounds(453, 75, 129, 122);

        botaoMacaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/maça.png"))); // NOI18N
        botaoMacaButton.setText("jToggleButton1");
        botaoMacaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMacaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMacaButton);
        botaoMacaButton.setBounds(306, 75, 129, 122);

        botaoElefanteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/elefante.png"))); // NOI18N
        botaoElefanteButton.setText("jToggleButton1");
        botaoElefanteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoElefanteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoElefanteButton);
        botaoElefanteButton.setBounds(159, 75, 129, 122);

        botaoGataButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gato.png"))); // NOI18N
        botaoGataButton.setText("jToggleButton1");
        botaoGataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoGataButton);
        botaoGataButton.setBounds(18, 74, 129, 123);

        botaoMButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/letram.png"))); // NOI18N
        botaoMButton.setText("jToggleButton1");
        botaoMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMButton);
        botaoMButton.setBounds(455, 242, 129, 122);

        botaoGButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/letrag.png"))); // NOI18N
        botaoGButton.setText("jToggleButton1");
        botaoGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoGButton);
        botaoGButton.setBounds(308, 242, 129, 122);

        botaoCButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/letraC.png"))); // NOI18N
        botaoCButton.setText("jToggleButton1");
        botaoCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCButton);
        botaoCButton.setBounds(159, 242, 129, 122);

        botaoEButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/letraE.png"))); // NOI18N
        botaoEButton.setText("jToggleButton1");
        botaoEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEButton);
        botaoEButton.setBounds(18, 242, 129, 122);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/branco fundo.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCoracaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCoracaoButtonActionPerformed
        verifica_fase(botaoCoracaoButton);
    }//GEN-LAST:event_botaoCoracaoButtonActionPerformed

    private void botaoMacaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMacaButtonActionPerformed
        verifica_fase(botaoMacaButton);
    }//GEN-LAST:event_botaoMacaButtonActionPerformed

    private void botaoElefanteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoElefanteButtonActionPerformed
        verifica_fase(botaoElefanteButton);
    }//GEN-LAST:event_botaoElefanteButtonActionPerformed

    private void botaoGataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGataButtonActionPerformed
        verifica_fase(botaoGataButton);
    }//GEN-LAST:event_botaoGataButtonActionPerformed

    private void botaoMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMButtonActionPerformed
        verifica_fase(botaoMButton);
    }//GEN-LAST:event_botaoMButtonActionPerformed

    private void botaoGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGButtonActionPerformed
        verifica_fase(botaoGButton);
    }//GEN-LAST:event_botaoGButtonActionPerformed

    private void botaoCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCButtonActionPerformed
        verifica_fase(botaoCButton);
    }//GEN-LAST:event_botaoCButtonActionPerformed

    private void botaoEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEButtonActionPerformed
        verifica_fase(botaoEButton);
    }//GEN-LAST:event_botaoEButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Fase4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoCButton;
    private javax.swing.JToggleButton botaoCoracaoButton;
    private javax.swing.JToggleButton botaoEButton;
    private javax.swing.JToggleButton botaoElefanteButton;
    private javax.swing.JToggleButton botaoGButton;
    private javax.swing.JToggleButton botaoGataButton;
    private javax.swing.JToggleButton botaoMButton;
    private javax.swing.JToggleButton botaoMacaButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
