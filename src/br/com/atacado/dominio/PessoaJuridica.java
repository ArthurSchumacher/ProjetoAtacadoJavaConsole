package br.com.atacado.dominio;

import java.time.LocalDate;

public class PessoaJuridica extends BasePessoa {

    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private String nomeFantasia;

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }
    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public PessoaJuridica(int idPessoa, String nome, String email, String site, LocalDate dataInclusao, String cnpj,
            String inscricaoEstadual, String inscricaoMunicipal, String nomeFantasia) {
        super(idPessoa, nome, email, site, dataInclusao);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.nomeFantasia = nomeFantasia;
    }
}
