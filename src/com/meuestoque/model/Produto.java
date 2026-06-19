package com.meuestoque.model;

import java.math.BigDecimal;

public class Produto {
    private int idProduto;
    private Catalogo catalogo;
    private Sabor sabor;
    private Lote lote;
    private BigDecimal precoVenda;

    public Produto() {
    }

    public Produto(int idProduto, Catalogo catalogo, Sabor sabor, Lote lote, BigDecimal precoVenda) {
        this.idProduto = idProduto;
        this.catalogo = catalogo;
        this.sabor = sabor;
        this.lote = lote;
        this.precoVenda = precoVenda;
    }


    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }
}