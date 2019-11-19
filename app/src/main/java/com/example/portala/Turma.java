package com.example.portala;

import java.util.ArrayList;

public class Turma {

    private String idTurma;
    private int anoTurma;
    private String turnoTurma;
    private ArrayList<Disciplina> disciplina;
    private ArrayList<Aluno> aluno;

    public Turma() {
        this.disciplina = new ArrayList<>();
        this.aluno = new ArrayList<>();
    }

    public String getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    public int getAnoTurma() {
        return anoTurma;
    }

    public void setAnoTurma(int anoTurma) {
        this.anoTurma = anoTurma;
    }

    public String getTurnoTurma() {
        return turnoTurma;
    }

    public void setTurnoTurma(String turnoTurma) {
        this.turnoTurma = turnoTurma;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

}
