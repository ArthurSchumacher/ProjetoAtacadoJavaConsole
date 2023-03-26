package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private int id;
    private String descricao;
    private LocalDate dataInclusao;
    private List<Subcategoria> subcategorias;

    public int getId() {
        return id;
    }
    public void setId(int idCategoria) {
        this.id = idCategoria;
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
        this.id = idCategoria;
        this.descricao = descricao;
        this.dataInclusao = dataDeInclusao;
        this.subcategorias = new ArrayList<Subcategoria>();
    }
    
}
