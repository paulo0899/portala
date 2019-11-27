package com.example.portala.model;

import java.util.ArrayList;

public class Responsavel {

    private String idResponsavel = "68TyuIHg";
    private String nomeResponsavel = "Melo";
    private String senhaResponsavel = "responsavel";
    private String emailResponsavel = "responsavel@gmail.com";
    private String fotoResponsavel;
    private ArrayList<Aluno> aluno;
    private Instituicao instituicao;

    public Responsavel() {
        this.aluno = new ArrayList<>();
        this.instituicao = new Instituicao();
    }

    public String getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(String idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getSenhaResponsavel() {
        return senhaResponsavel;
    }

    public void setSenhaResponsavel(String senhaResponsavel) {
        this.senhaResponsavel = senhaResponsavel;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public String getFotoResponsavel() {
        return fotoResponsavel;
    }

    public void setFotoResponsavel(String fotoResponsavel) {
        this.fotoResponsavel = fotoResponsavel;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
}
