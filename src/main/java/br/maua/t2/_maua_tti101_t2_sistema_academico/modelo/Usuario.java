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
    public static String login;
    public static String senha;
    private static boolean professor;
    public static int pontuacao = 1000;
    public static boolean Fase1 = false;
    public static boolean Fase2 = false;
    public static boolean Fase3 = false;
    public static boolean Fase4 = false;
   

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
