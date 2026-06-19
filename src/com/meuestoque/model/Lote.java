package com.meuestoque.model;

import java.time.LocalDate;

public class Lote {
    private int idLote;
    private LocalDate dataFeito;
    private LocalDate dataPrazo;

    public Lote() {
    }

    public Lote(int idLote, LocalDate dataFeito, LocalDate dataPrazo) {
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

    public LocalDate getDataFeito() {
        return dataFeito;
    }

    public void setDataFeito(LocalDate dataFeito) {
        this.dataFeito = dataFeito;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

}
