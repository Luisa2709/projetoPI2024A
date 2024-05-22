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
private int getUsuarioID(Usuario u) throws Exception {
    // Specify the SQL command
    String sql = "SELECT ID_USUARIO FROM USUARIOS WHERE NOME LIKE ?";
    System.out.println(u.getLogin());

    // Establish a connection with the database
    Connection conexao = new ConnectionFactory().obterConexao();

    // Prepare the command
    PreparedStatement ps = conexao.prepareStatement(sql);
    
    // Replace the placeholders
    ps.setString(1, u.getLogin());

    // Execute the query
    ResultSet rs = ps.executeQuery();

    // Handle the result
    int ID = -1;
    if (rs.next()) {
        ID = rs.getInt("ID_USUARIO");
    } else {
        throw new Exception("Usuario não encontrado: " + u.getLogin());
    }

    // Close the connection
    rs.close();
    ps.close();
    conexao.close();

    // Return the user ID
    return ID;
}

public void pontuar(Usuario u) throws Exception {
    // Retrieve the user ID
    int ID = getUsuarioID(u);

    // Specify the SQL command
    String sql = "INSERT INTO PONTUACAO (PONTUACAO, ID_USUARIO) VALUES (?, ?)";

    // Establish a connection with the database
    Connection conexao = new ConnectionFactory().obterConexao();

    // Prepare the command
    PreparedStatement ps = conexao.prepareStatement(sql);
    
    // Replace the placeholders
    ps.setInt(1, Usuario.pontuacao);  // Assuming u.getPontuacao() returns the user's score
    ps.setInt(2, ID);

    // Execute the update
    ps.executeUpdate();

    // Close the connection
    ps.close();
    conexao.close();
}
    public boolean verificaProfessor(Usuario u){//verifica se eh professor
        return u.getLogin().contains("PROFESSOR");
    }
    public String[] getTurmas() throws Exception{
        //1. Especificar o comando SQL (SELECT)
        String sql = "SELECT DISTINCT SENHA FROM USUARIOS WHERE PROFESSOR = 0 ORDER BY SENHA ASC;";
        //2. Estabelecer uma conexao com o banco
        Connection conexao = new ConnectionFactory().obterConexao();
        //3. Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Executar o comando SQL
        ResultSet rs = ps.executeQuery();
        //5. Inicia array(lista) String 
        String[] turmas = new String[1000];
        //6. Contagem
        int i = 0;
        //7. Laço que vai adicionar cada senha a lista
        while (rs.next()){
            String turma = rs.getString("SENHA");
            turmas[i] = turma;
            i++;
        }
        //8. Fecha as conexoes 
        rs.close();
        conexao.close(); 
        //9. Devolve as turmas
        return turmas;
    }
    
    public int buscarTamanhoTurma (String Turma) throws Exception{
         //1. Especificar o comando SQL (SELECT)
        String sql = "SELECT COUNT(ID_USUARIO) FROM PONTUACAO;";
        //2. Estabelecer uma conexao com o banco
        Connection conexao = new ConnectionFactory().obterConexao();
        //3. Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Executar o comando SQL
        ResultSet rs = ps.executeQuery();
        //5. avanca para o primeiro resultado e retorna a quantidde de pessoas da turma
        rs.next();
        return rs.getInt(1);
    }
    public String[][] buscarTurma(String turma) throws Exception{
        String[][] todaTurma = new String[buscarTamanhoTurma(turma)][3];
        
        String sql = "SELECT U.NOME, P.PONTUACAO, P.DIA_HORARIO FROM USUARIOS AS U INNER JOIN PONTUACAO AS P ON U.ID_USUARIO = P.ID_USUARIO WHERE U.SENHA = '"+turma+"' ORDER BY P.PONTUACAO DESC;";
        //2. Estabelecer uma conexao com o banco
        Connection conexao = new ConnectionFactory().obterConexao();
        //3. Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Executar o comando SQL
        ResultSet rs = ps.executeQuery();
        //6. Contagem
        int i = 0;
        //7. Laço que vai adicionar cada nome, pontuacao e data/hora a lista
        while (rs.next()){
            String nome =  rs.getString(1);
            String pontuacao = Integer.toString(rs.getInt(2));
            String data =  rs.getDate(3).toString();
            todaTurma[i][0] = nome;
            todaTurma[i][1] = pontuacao;
            todaTurma[i][2] = data;
        }
        return todaTurma;
    }
}
