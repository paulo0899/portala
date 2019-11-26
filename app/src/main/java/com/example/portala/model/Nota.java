package com.example.portala.model;

import java.util.ArrayList;

public class Nota {

    private String idNota;
    private float primeiroBimestre;
    private float segundoBimestre;
    private float terceiroBimestre;
    private float quartoBimestre;
    private float mediaGeral;
    private float notaRecuperacao;
    private float mediaFinal;
    private Aluno aluno;
    private ArrayList<Disciplina> disciplina;

    public Nota() {
        this.aluno = new Aluno();
        this.disciplina = new ArrayList<>();
    }

    public String getIdNota() {
        return idNota;
    }

    public void setIdNota(String idNota) {
        this.idNota = idNota;
    }

    public float getPrimeiroBimestre() {
        return primeiroBimestre;
    }

    public void setPrimeiroBimestre(float primeiroBimestre) {
        this.primeiroBimestre = primeiroBimestre;
    }

    public float getSegundoBimestre() {
        return segundoBimestre;
    }

    public void setSegundoBimestre(float segundoBimestre) {
        this.segundoBimestre = segundoBimestre;
    }

    public float getTerceiroBimestre() {
        return terceiroBimestre;
    }

    public void setTerceiroBimestre(float terceiroBimestre) {
        this.terceiroBimestre = terceiroBimestre;
    }

    public float getQuartoBimestre() {
        return quartoBimestre;
    }

    public void setQuartoBimestre(float quartoBimestre) {
        this.quartoBimestre = quartoBimestre;
    }

    public float getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(float mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public float getNotaRecuperacao() {
        return notaRecuperacao;
    }

    public void setNotaRecuperacao(float notaRecuperacao) {
        this.notaRecuperacao = notaRecuperacao;
    }

    public float getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(float mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

}
