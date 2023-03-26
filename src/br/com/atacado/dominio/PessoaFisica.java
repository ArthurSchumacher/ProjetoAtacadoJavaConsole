package br.com.atacado.dominio;

import java.time.LocalDate;

public class PessoaFisica extends BasePessoa {
    
    private String cpf;
    private String rg;
    private String sexo;
    private String raca;
    private String nacionalidade;
    private String naturalidade;
    private String nomePai;
    private String nomeMae;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNaturalidade() {
        return naturalidade;
    }
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    public String getNomePai() {
        return nomePai;
    }
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public PessoaFisica(int idPessoa, String nome, String email, String site, LocalDate dataInclusao, String cpf,
            String rg, String sexo, String raca, String nacionalidade, String naturalidade, String nomePai,
            String nomeMae) {
        super(idPessoa, nome, email, site, dataInclusao);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.raca = raca;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    @Override
    public void Imprimir() {
        System.out.println("Imprimir pessoa física: ");
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }

    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", raca=" + raca + ", nacionalidade="
                + nacionalidade + ", naturalidade=" + naturalidade + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
                + "]";
    }
    
}
