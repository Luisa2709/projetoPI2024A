/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.maua.t2._maua_tti101_t2_sistema_academico.telas;

import br.maua.t2._maua_tti101_t2_sistema_academico.modelo.Usuario;
import br.maua.t2._maua_tti101_t2_sistema_academico.db.UsuarioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
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

        loginTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        convidadoButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        cadastrarButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LoginTela");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(null);

        loginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Digite seu Login:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField);
        loginTextField.setBounds(20, 20, 560, 70);

        senhaPasswordField.setForeground(new java.awt.Color(0, 142, 246));
        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Digite sua senha:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaPasswordField);
        senhaPasswordField.setBounds(20, 100, 560, 70);

        convidadoButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        convidadoButton.setText("Convidado");
        convidadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convidadoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(convidadoButton);
        convidadoButton.setBounds(300, 300, 270, 80);

        okButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);
        okButton.setBounds(20, 200, 550, 70);

        cadastrarButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cadastrarButton1.setText("Não tem login: Criar conta");
        cadastrarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarButton1);
        cadastrarButton1.setBounds(20, 300, 260, 80);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 260, 300, 210);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, -80, 300, 210);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, 30, 410, 270);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-20, -40, 270, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/maua/t2/_maua_tti101_t2_sistema_academico/telas/imagens/tela azul.jpg"))); // NOI18N
        jLabel1.setName(""); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 460);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, 190, 10, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        
      try{
        //1. pegar o login digitado pelo usuario
        var login = loginTextField.getText();
        //2. pegar a senha digitada pelo usuario
        var senha = new String(senhaPasswordField.getPassword());
        //3. verificar se ele digitou admin/admin
        var usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);
        var dao = new UsuarioDAO();
        if(dao.existe(usuario)){//verifica se existe o usuario
            if (dao.verificaProfessor(usuario)){
                dispose();
                new PontuacaoProfessor().setVisible(true);
            } 
            else{
                dispose();
                new TelaFasess().setVisible(true);
            }
        
        }
        else{
        JOptionPane.showMessageDialog(null, "Este usuário não existe");       
        }
            
      }
      catch(Exception e){
            System.out.println(e);
      }
        
        
    try {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Windows".equals(info.getName())) {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    // Lidar com exceções, se necessário
    e.printStackTrace();
}
    }//GEN-LAST:event_okButtonActionPerformed

    private void convidadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convidadoButtonActionPerformed
        dispose();
        new TelaFasess().setVisible(true);
        
    }//GEN-LAST:event_convidadoButtonActionPerformed

    private void cadastrarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButton1ActionPerformed
        var ctt = new CadastroTurmaTela();
        ctt.setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastrarButton1ActionPerformed

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton1;
    private javax.swing.JButton convidadoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
