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
public class Fase3 extends javax.swing.JFrame{
    private javax.swing.JToggleButton botãoAnteriorPressionado;

    private boolean temDoisBotõesPressionados() {
        javax.swing.JToggleButton[] buttons = {
            botaoMacacoButton, 
            botaoFlorestaButton, 
            botaoLeaoButton, 
            botaoSelvaButton, 
            botaoPeixeButton, 
            botaoMarButton, 
            botaoColmeiaButton, 
            botaoAbelhaButton
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
            botaoMacacoButton, 
            botaoFlorestaButton, 
            botaoLeaoButton, 
            botaoSelvaButton, 
            botaoPeixeButton, 
            botaoMarButton, 
            botaoColmeiaButton, 
            botaoAbelhaButton
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
            if ((botãoPressionado == botaoMacacoButton && botãoAnteriorPressionado == botaoFlorestaButton) || (botãoAnteriorPressionado == botaoMacacoButton && botãoPressionado == botaoFlorestaButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botaoLeaoButton && botãoAnteriorPressionado == botaoSelvaButton) || (botãoAnteriorPressionado == botaoLeaoButton && botãoPressionado == botaoSelvaButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botaoPeixeButton && botãoAnteriorPressionado == botaoMarButton) || (botãoAnteriorPressionado == botaoPeixeButton && botãoPressionado == botaoMarButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botaoColmeiaButton && botãoAnteriorPressionado == botaoAbelhaButton) || (botãoAnteriorPressionado == botaoColmeiaButton && botãoPressionado == botaoAbelhaButton)) {
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
                Usuario.Fase3 = true;
                if (!Usuario.Fase1) {
                    new Fase1().setVisible(true);
                    this.dispose();
                } else if (!Usuario.Fase2) {
                    new Fase2().setVisible(true);
                    this.dispose();
                } else if (!Usuario.Fase4) {
                    new Fase4().setVisible(true);
                    this.dispose();
                } else {
                    var usuario = new Usuario();
                    usuario.setLogin(Usuario.login);
                    usuario.setSenha(Usuario.senha);
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
     * Creates new form Fase3
     */
    public Fase3(){
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

        botaoMacacoButton = new javax.swing.JToggleButton();
        botaoLeaoButton = new javax.swing.JToggleButton();
        botaoSelvaButton = new javax.swing.JToggleButton();
        botaoPeixeButton = new javax.swing.JToggleButton();
        botaoColmeiaButton = new javax.swing.JToggleButton();
        botaoFlorestaButton = new javax.swing.JToggleButton();
        botaoMarButton = new javax.swing.JToggleButton();
        botaoAbelhaButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoMacacoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/macaco.png"))); // NOI18N
        botaoMacacoButton.setText("jToggleButton1");
        botaoMacacoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMacacoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMacacoButton);
        botaoMacacoButton.setBounds(460, 80, 129, 123);

        botaoLeaoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/leao.png"))); // NOI18N
        botaoLeaoButton.setText("jToggleButton1");
        botaoLeaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLeaoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLeaoButton);
        botaoLeaoButton.setBounds(310, 80, 129, 123);

        botaoSelvaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/selva.png"))); // NOI18N
        botaoSelvaButton.setText("jToggleButton1");
        botaoSelvaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelvaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSelvaButton);
        botaoSelvaButton.setBounds(10, 220, 129, 122);

        botaoPeixeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peixe.png"))); // NOI18N
        botaoPeixeButton.setText("jToggleButton1");
        botaoPeixeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPeixeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPeixeButton);
        botaoPeixeButton.setBounds(10, 80, 129, 122);

        botaoColmeiaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/colmeia.png"))); // NOI18N
        botaoColmeiaButton.setText("jToggleButton1");
        botaoColmeiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoColmeiaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoColmeiaButton);
        botaoColmeiaButton.setBounds(460, 220, 129, 118);

        botaoFlorestaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arvore.png"))); // NOI18N
        botaoFlorestaButton.setText("jToggleButton1");
        botaoFlorestaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFlorestaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoFlorestaButton);
        botaoFlorestaButton.setBounds(310, 220, 129, 122);

        botaoMarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mar.png"))); // NOI18N
        botaoMarButton.setText("jToggleButton1");
        botaoMarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMarButton);
        botaoMarButton.setBounds(160, 220, 129, 122);

        botaoAbelhaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/abelha.png"))); // NOI18N
        botaoAbelhaButton.setText("jToggleButton1");
        botaoAbelhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbelhaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAbelhaButton);
        botaoAbelhaButton.setBounds(160, 80, 129, 122);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/branco fundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMacacoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMacacoButtonActionPerformed
        verifica_fase(botaoMacacoButton);
    }//GEN-LAST:event_botaoMacacoButtonActionPerformed

    private void botaoLeaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLeaoButtonActionPerformed
        verifica_fase(botaoLeaoButton);
    }//GEN-LAST:event_botaoLeaoButtonActionPerformed

    private void botaoSelvaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelvaButtonActionPerformed
        verifica_fase(botaoSelvaButton);
    }//GEN-LAST:event_botaoSelvaButtonActionPerformed

    private void botaoPeixeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPeixeButtonActionPerformed
        verifica_fase(botaoPeixeButton);
    }//GEN-LAST:event_botaoPeixeButtonActionPerformed

    private void botaoColmeiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoColmeiaButtonActionPerformed
         verifica_fase(botaoColmeiaButton);
    }//GEN-LAST:event_botaoColmeiaButtonActionPerformed

    private void botaoFlorestaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFlorestaButtonActionPerformed
        verifica_fase(botaoFlorestaButton);
    }//GEN-LAST:event_botaoFlorestaButtonActionPerformed

    private void botaoMarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMarButtonActionPerformed
        verifica_fase(botaoMarButton);
    }//GEN-LAST:event_botaoMarButtonActionPerformed

    private void botaoAbelhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbelhaButtonActionPerformed
        verifica_fase(botaoAbelhaButton);
    }//GEN-LAST:event_botaoAbelhaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Fase3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoAbelhaButton;
    private javax.swing.JToggleButton botaoColmeiaButton;
    private javax.swing.JToggleButton botaoFlorestaButton;
    private javax.swing.JToggleButton botaoLeaoButton;
    private javax.swing.JToggleButton botaoMacacoButton;
    private javax.swing.JToggleButton botaoMarButton;
    private javax.swing.JToggleButton botaoPeixeButton;
    private javax.swing.JToggleButton botaoSelvaButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

