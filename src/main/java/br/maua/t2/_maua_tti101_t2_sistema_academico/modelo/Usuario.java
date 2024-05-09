/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua.t2._maua_tti101_t2_sistema_academico.modelo;

/**
 *
 * @author luisa
 */
public class Usuario {
    private String login;
    private String senha;
    private boolean professor;
    
   

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getProfessor() {
        return professor;
    }

    public void setProfessor(boolean professor) {
        this.professor = professor;
    }
    
}
