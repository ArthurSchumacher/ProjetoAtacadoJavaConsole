package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Subcategoria {

    private int idSubcategoria;
    private int idCategoria;
    private String descricao;
    private LocalDate dataDeInclusao;
    private List<Produto> produtos;

    public int getIdSubcategoria() {
        return idSubcategoria;
    }
    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }
    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }
    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public Subcategoria() {
    }

    public Subcategoria(int idSubcategoria, int idCategoria, String descricao, LocalDate dataDeInclusao) {
        this.idSubcategoria = idSubcategoria;
        this.idCategoria = idCategoria;
        this.descricao = descricao;
        this.dataDeInclusao = dataDeInclusao;
    }
}
