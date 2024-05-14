/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua.t2._maua_tti101_t2_sistema_academico.db;

import br.maua.t2._maua_tti101_t2_sistema_academico.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author luisa
 */
public class UsuarioDAO {
    
    //clausula catch or declare
    public boolean existe(Usuario u) throws Exception{//verifica o usuario
        //1. Especificar o comando SQL (SELECT)   
        String sql = "SELECT * FROM USUARIOS WHERE NOME = ? AND SENHA = ?";
        //2. Estabelecer uma conexao com o banco
        Connection conexao = new ConnectionFactory().obterConexao();
        //3. Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        //5. Executar
        ResultSet rs = ps.executeQuery();
        //6. Lidar com o resultado
        boolean achou =rs.next();
        //7. Fechar a conexao
        rs.close();
        ps.close();
        conexao.close();
        //8.Responder se existe ou nao
        return achou;
    }
    public void cadastrar (Usuario u) throws Exception{//cria o usuario
        String sql = "INSERT INTO USUARIOS (NOME, SENHA, PROFESSOR) VALUES (?, ?, ?);";
        //2. Estabelecer uma conexao com o banco
        Connection conexao = new ConnectionFactory().obterConexao();
        //3. Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        boolean professor = u.getLogin().contains("PROFESSOR");
        ps.setBoolean(3, professor);
        //5. Executar
        ps.executeUpdate();
        //7. Fechar a conexao
        ps.close();
        conexao.close();  
    }
    public boolean verificaProfessor(Usuario u){//verifica se eh professor
        return u.getLogin().contains("PROFESSOR");
    }
}
