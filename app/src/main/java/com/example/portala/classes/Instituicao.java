package com.example.portala.classes;

import java.util.ArrayList;

public class Instituicao {

    private String idAdministracao;
    private String emailAdministracao;
    private String senhaAdministracao;
    private ArrayList<Responsavel> responsavel;
    private ArrayList<Evento> evento;
    private ArrayList<Aluno> aluno;

    public Instituicao() {
        this.responsavel = new ArrayList<>();
        this.evento = new ArrayList<>();
        this.aluno = new ArrayList<>();
    }

    public String getIdAdministracao() {
        return idAdministracao;
    }

    public void setIdAdministracao(String idAdministracao) {
        this.idAdministracao = idAdministracao;
    }

    public String getEmailAdministracao() {
        return emailAdministracao;
    }

    public void setEmailAdministracao(String emailAdministracao) {
        this.emailAdministracao = emailAdministracao;
    }

    public String getSenhaAdministracao() {
        return senhaAdministracao;
    }

    public void setSenhaAdministracao(String senhaAdministracao) {
        this.senhaAdministracao = senhaAdministracao;
    }

    public ArrayList<Responsavel> getResponsavel() {
        return responsavel;
    }

    public ArrayList<Evento> getEvento() {
        return evento;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

}
