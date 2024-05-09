/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua.t2._maua_tti101_t2_sistema_academico.db;

/**
 *
 * @author luisa
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class ConnectionFactory {
    private String host = "mysql-30cc60ec-semeadorturma.b.aivencloud.com";
    private String port = "17523";
    private String db = "mydb";
    private String user = "avnadmin";
    private String password = "AVNS_NSvJq2VI5POBJ-NYZ_Z";
    
    //4 partes: tpo de retorno, nome, lista de parametros, corpo
    public Connection obterConexao(){
     try{
        //https://ww.google.com:80
        //jbdc:mysql://host:port/db
        String stringConexao = String.format(
            "jdbc:mysql://%s:%s/%s", host, port, db
        );
        var conexao = DriverManager.getConnection(stringConexao, user, password);
        return conexao;
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
         return null;
     }
   } 
   
   public static void main(String[] args) {
       var conexao = new ConnectionFactory().obterConexao();
       if (conexao != null)
           System.out.println("Conectou! :) ");
       else
           System.out.println("Coiss ruins aconteceram...:( ");
   }
}
