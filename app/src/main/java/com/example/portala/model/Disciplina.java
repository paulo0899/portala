package com.example.portala.model;

import java.util.ArrayList;

public class Disciplina {

    private String idDisciplina;
    private String nomeDisciplina;
    private Nota nota;
    private ArrayList<Turma> turma;

    public Disciplina() {
        this.nota = new Nota();
        this.turma = new ArrayList<>();
    }

    public String getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(String idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public ArrayList<Turma> getTurma() {
        return turma;
    }

}
