package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

    protected int idPessoa;
    protected String nome;
    protected String email;
    protected String site;
    protected LocalDate dataInclusao;

    public int getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public LocalDate getDataInclusao() {
        return dataInclusao;
    }
    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public BasePessoa(int idPessoa, String nome, String email, String site, LocalDate dataInclusao) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.email = email;
        this.site = site;
        this.dataInclusao = dataInclusao;
    }

    public abstract void Imprimir();
}
