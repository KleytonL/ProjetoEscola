package br.com.escola.model;

public class Instituicao {

    private String nome;
    private Endereco endereco;
    private Grau grau;
    private Administracao adm;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Grau getGrau() {
        return grau;
    }
    public void setGrau(Grau grau) {
        this.grau = grau;
    }
    public Administracao getAdm() {
        return adm;
    }
    public void setAdm(Administracao adm) {
        this.adm = adm;
    }
}
