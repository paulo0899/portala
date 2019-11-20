package com.example.portala.classes;

import java.util.ArrayList;

public class Aluno {

    private String idAluno;
    private String nomeAluno;
    private int anoAluno;
    private Responsavel responsavel;
    private Turma turma;
    private Instituicao instituicao;
    private ArrayList<Nota> nota;

    public Aluno() {
        this.responsavel = new Responsavel();
        this.turma = new Turma();
        this.instituicao = new Instituicao();
        this.nota = new ArrayList<>();
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getAnoAluno() {
        return anoAluno;
    }

    public void setAnoAluno(int anoAluno) {
        this.anoAluno = anoAluno;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public ArrayList<Nota> getNota() {
        return nota;
    }

}
