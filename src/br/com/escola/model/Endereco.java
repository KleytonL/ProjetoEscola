package br.com.escola.model;

public class Endereco {

    private String rua;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String rua, String cidade, String estado, String pais) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Rua - " + rua +
                ", Cidade - " + cidade +
                ", Estado - " + estado +
                ", Pais - " + pais;
    }
}
