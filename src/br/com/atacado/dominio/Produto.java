package br.com.atacado.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Produto {
    
    private int idProduto;
    private int idSubcategoria;
    private String descricao;
    private BigDecimal valor;
    private LocalDate dataDeInclusao;

    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public int getIdSubcategoria() {
        return idSubcategoria;
    }
    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }
    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }
    
    public Produto() {
    }

    public Produto(int idProduto, int idSubcategoria, String descricao, BigDecimal valor, LocalDate dataDeInclusao) {
        this.idProduto = idProduto;
        this.idSubcategoria = idSubcategoria;
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeInclusao = dataDeInclusao;
    }
}
