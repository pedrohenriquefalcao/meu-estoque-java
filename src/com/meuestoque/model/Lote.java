package com.meuestoque.model;

public class Lote {
    private int idLote;
    private int dataFeito;
    private int dataPrazo;

    public Lote() {
    }

    public Lote(int idLote, int dataFeito, int dataPrazo) {
        this.idLote = idLote;
        this.dataFeito = dataFeito;
        this.dataPrazo = dataPrazo;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getDataFeito() {
        return dataFeito;
    }

    public void setDataFeito(int dataFeito) {
        this.dataFeito = dataFeito;
    }

    public int getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(int dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

}
