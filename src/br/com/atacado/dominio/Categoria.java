package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private int idCategoria;
    private String descricao;
    private LocalDate dataDeInclusao;
    private List<Subcategoria> subcategorias;

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
    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }
    public void setSubcategorias(List<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public Categoria() {
        this.subcategorias = new ArrayList<Subcategoria>();
    }

    public Categoria(int idCategoria, String descricao, LocalDate dataDeInclusao) {
        this.idCategoria = idCategoria;
        this.descricao = descricao;
        this.dataDeInclusao = dataDeInclusao;
        this.subcategorias = new ArrayList<Subcategoria>();
    }
    
}
