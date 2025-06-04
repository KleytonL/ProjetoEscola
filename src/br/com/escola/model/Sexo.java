package br.com.escola.model;

public enum Sexo {
    MASC("Masculino"), FEM("Feminino");

    private String valor;

    Sexo(String valor) {
        this.setValor(valor);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}