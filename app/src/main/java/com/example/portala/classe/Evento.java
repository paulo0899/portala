package com.example.portala.classe;

public class Evento {

    private String idEvento;
    private String tituloEvento;
    private String descricaoEvento;
    private Instituicao instituicao;
    private byte[] imagemEvento;

    public Evento() {
        this.instituicao = new Instituicao();
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public byte[] getImagemEvento() {
        return imagemEvento;
    }

    public void setImagemEvento(byte[] imagemEvento) {
        this.imagemEvento = imagemEvento;
    }
}