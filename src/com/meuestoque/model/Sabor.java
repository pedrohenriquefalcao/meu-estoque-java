package com.meuestoque.model;

public class Sabor {
    private int idSabor;
    private String nomeSabor;


    public Sabor() {
    }

    public Sabor(int idSabor, String nomeSabor) {
        this.idSabor = idSabor;
        this.nomeSabor = nomeSabor;
    }

    public int getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(int idSabor) {
        this.idSabor = idSabor;
    }

    public String getNomeSabor() {
        return nomeSabor;
    }

    public void setNomeSabor(String nomeSabor) {
        this.nomeSabor = nomeSabor;
    }
}