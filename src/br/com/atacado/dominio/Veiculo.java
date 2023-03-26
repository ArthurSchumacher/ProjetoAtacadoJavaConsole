package br.com.atacado.dominio;

import java.time.LocalDate;

public class Veiculo extends BaseTransporte {
    private int idFrota;
    private String placa;

    public int getIdFrota() {
        return idFrota;
    }
    public void setIdFrota(int idFrota) {
        this.idFrota = idFrota;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculo() {
    }

    public Veiculo(int idTransporte, String descricao, LocalDate dataInclusao, int idFrota, String placa) {
        super(idTransporte, descricao, dataInclusao);
        this.idFrota = idFrota;
        this.placa = placa;
    }
    @Override
    public String toString() {
        return "Veiculo " + getDescricao()+  " [idFrota=" + idFrota + ", placa=" + placa + "]";
    }

}
