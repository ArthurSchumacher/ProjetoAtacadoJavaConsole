package br.com.atacado.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Produto {
    
    private int id;
    private int idSubcategoria;
    private String descricao;
    private BigDecimal valor;
    private LocalDate dataInclusao;

    public int getId() {
        return id;
    }
    public void setId(int idProduto) {
        this.id = idProduto;
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
        return dataInclusao;
    }
    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataInclusao = dataDeInclusao;
    }
    
    public Produto() {
    }

    public Produto(int idProduto, int idSubcategoria, String descricao, BigDecimal valor, LocalDate dataDeInclusao) {
        this.id = idProduto;
        this.idSubcategoria = idSubcategoria;
        this.descricao = descricao;
        this.valor = valor;
        this.dataInclusao = dataDeInclusao;
    }
}
