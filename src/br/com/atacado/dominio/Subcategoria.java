package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Subcategoria {

    private int id;
    private int idCategoria;
    private String descricao;
    private LocalDate dataInclusao;
    private List<Produto> produtos;

    public int getId() {
        return id;
    }
    public void setId(int idSubcategoria) {
        this.id = idSubcategoria;
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
        return dataInclusao;
    }
    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataInclusao = dataDeInclusao;
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
        this.id = idSubcategoria;
        this.idCategoria = idCategoria;
        this.descricao = descricao;
        this.dataInclusao = dataDeInclusao;
    }
}
