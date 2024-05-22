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
public class Fase1 extends javax.swing.JFrame {

    private javax.swing.JToggleButton botãoAnteriorPressionado;

    private boolean temDoisBotõesPressionados() {
        javax.swing.JToggleButton[] buttons = {
            botãoAmareloButton, 
            botãoAzulButton, 
            botãoBananaButton, 
            botãoMorangoButton, 
            botãoNuvemButton, 
            botãoPlantaButton, 
            botãoVerdeButton, 
            botãoVermelhoButton
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
            botãoAmareloButton, 
            botãoAzulButton, 
            botãoBananaButton, 
            botãoMorangoButton, 
            botãoNuvemButton, 
            botãoPlantaButton, 
            botãoVerdeButton, 
            botãoVermelhoButton
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
            if ((botãoPressionado == botãoAmareloButton && botãoAnteriorPressionado == botãoBananaButton) || (botãoAnteriorPressionado == botãoAmareloButton && botãoPressionado == botãoBananaButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botãoAzulButton && botãoAnteriorPressionado == botãoNuvemButton) || (botãoAnteriorPressionado == botãoAzulButton && botãoPressionado == botãoNuvemButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botãoVerdeButton && botãoAnteriorPressionado == botãoPlantaButton) || (botãoAnteriorPressionado == botãoVerdeButton && botãoPressionado == botãoPlantaButton)) {
                botãoPressionado.setEnabled(false);
                botãoPressionado.setSelected(false);
                botãoAnteriorPressionado.setSelected(false);
                botãoAnteriorPressionado = null;
            } else if ((botãoPressionado == botãoVermelhoButton && botãoAnteriorPressionado == botãoMorangoButton) || (botãoAnteriorPressionado == botãoVermelhoButton && botãoPressionado == botãoMorangoButton)) {
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
                Usuario.Fase1 = true;
                if (!Usuario.Fase2) {
                    new Fase2().setVisible(true);
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
     * Creates new form Fase1
     */
    public Fase1() {
        initComponents();
    }

    /**
     * This me
     * thod is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botãoVermelhoButton = new javax.swing.JToggleButton();
        botãoVerdeButton = new javax.swing.JToggleButton();
        botãoAzulButton = new javax.swing.JToggleButton();
        botãoAmareloButton = new javax.swing.JToggleButton();
        botãoPlantaButton = new javax.swing.JToggleButton();
        botãoMorangoButton = new javax.swing.JToggleButton();
        botãoNuvemButton = new javax.swing.JToggleButton();
        botãoBananaButton = new javax.swing.JToggleButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        botãoVermelhoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vermelho.png"))); // NOI18N
        botãoVermelhoButton.setText("jToggleButton1");
        botãoVermelhoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoVermelhoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botãoVermelhoButton);
        botãoVermelhoButton.setBounds(450, 70, 129, 122);

        botãoVerdeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/verde.png"))); // NOI18N
        botãoVerdeButton.setText("jToggleButton1");
        botãoVerdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoVerdeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botãoVerdeButton);
        botãoVerdeButton.setBounds(310, 70, 129, 122);

        botãoAzulButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/azul.png"))); // NOI18N
        botãoAzulButton.setText("jToggleButton1");
        botãoAzulButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoAzulButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botãoAzulButton);
        botãoAzulButton.setBounds(170, 70, 129, 122);

        botãoAmareloButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/amarelo.png"))); // NOI18N
        botãoAmareloButton.setText("jToggleButton1");
        botãoAmareloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoAmareloButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botãoAmareloButton);
        botãoAmareloButton.setBounds(30, 70, 129, 122);

        botãoPlantaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planta.png"))); // NOI18N
        botãoPlantaButton.setText("jToggleButton1");
        botãoPlantaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoPlantaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botãoPlantaButton);
        botãoPlantaButton.setBounds(30, 220, 129, 122);

        botãoMorangoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/m2.png"))); // NOI18N
        botãoMorangoButton.setText("jToggleButton1");
        botãoMorangoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoMorangoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botãoMorangoButton);
        botãoMorangoButton.setBounds(170, 220, 129, 122);

        botãoNuvemButton.setForeground(new java.awt.Color(255, 255, 255));
        botãoNuvemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nuvem.png"))); // NOI18N
        botãoNuvemButton.setText("jToggleButton1");
        botãoNuvemButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botãoNuvemButton.setBorderPainted(false);
        botãoNuvemButton.setContentAreaFilled(false);
        botãoNuvemButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botãoNuvemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoNuvemButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botãoNuvemButton);
        botãoNuvemButton.setBounds(310, 220, 129, 120);

        botãoBananaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/banana.png"))); // NOI18N
        botãoBananaButton.setText("jToggleButton1");
        botãoBananaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoBananaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botãoBananaButton);
        botãoBananaButton.setBounds(450, 220, 129, 122);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/branco fundo.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 600, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botãoVermelhoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoVermelhoButtonActionPerformed
        verifica_fase(botãoVermelhoButton);
    }//GEN-LAST:event_botãoVermelhoButtonActionPerformed

    private void botãoVerdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoVerdeButtonActionPerformed
        verifica_fase(botãoVerdeButton);
    }//GEN-LAST:event_botãoVerdeButtonActionPerformed

    private void botãoAzulButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoAzulButtonActionPerformed
        verifica_fase(botãoAzulButton);
    }//GEN-LAST:event_botãoAzulButtonActionPerformed

    private void botãoAmareloButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoAmareloButtonActionPerformed
        verifica_fase(botãoAmareloButton);
    }//GEN-LAST:event_botãoAmareloButtonActionPerformed

    private void botãoPlantaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoPlantaButtonActionPerformed
        verifica_fase(botãoPlantaButton);
    }//GEN-LAST:event_botãoPlantaButtonActionPerformed

    private void botãoMorangoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoMorangoButtonActionPerformed
        verifica_fase(botãoMorangoButton);
    }//GEN-LAST:event_botãoMorangoButtonActionPerformed

    private void botãoNuvemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoNuvemButtonActionPerformed
        verifica_fase(botãoNuvemButton);
    }//GEN-LAST:event_botãoNuvemButtonActionPerformed

    private void botãoBananaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoBananaButtonActionPerformed
        verifica_fase(botãoBananaButton);
    }//GEN-LAST:event_botãoBananaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JToggleButton botãoAmareloButton;
    private javax.swing.JToggleButton botãoAzulButton;
    private javax.swing.JToggleButton botãoBananaButton;
    private javax.swing.JToggleButton botãoMorangoButton;
    private javax.swing.JToggleButton botãoNuvemButton;
    private javax.swing.JToggleButton botãoPlantaButton;
    private javax.swing.JToggleButton botãoVerdeButton;
    private javax.swing.JToggleButton botãoVermelhoButton;
    // End of variables declaration//GEN-END:variables
}
