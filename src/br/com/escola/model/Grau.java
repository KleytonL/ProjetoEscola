package br.com.escola.model;

public enum Grau {
    FUNDAMENTAL("Ensino Fundamental"),
    MEDIO("Ensino Médio"),
    SUPERIOR("Ensino Superior");

    private String descricao;

    Grau(String descricao) {
        this.setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
