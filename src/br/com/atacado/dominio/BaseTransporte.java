package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BaseTransporte {

    private int id;
    private String descricao;
    private LocalDate dataInclusao;

    public int getId() {
        return id;
    }
    public void setId(int idTransporte) {
        this.id = idTransporte;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInclusao() {
        return dataInclusao;
    }
    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }
    
    public BaseTransporte() {
    }

    public BaseTransporte(int idTransporte, String descricao, LocalDate dataInclusao) {
        this.id = idTransporte;
        this.descricao = descricao;
        this.dataInclusao = dataInclusao;
    }

}
