package br.com.escola.model;

import br.com.escola.system.Autenticavel;
import br.com.escola.system.Sistema;

public class Instituicao {

    private String nome;
    private Endereco endereco;
    private Grau grau;
    private Administracao adm;

    public Instituicao(String nome, Endereco endereco, Grau grau, Administracao adm) {
        this.nome = nome;
        this.endereco = endereco;
        this.grau = grau;
        this.adm = adm;
    }

    public Sistema acessarSistema(Autenticavel autenticavel) {
        if(autenticavel.senha()) {
            new Sistema();
        }
        return null;
    }

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

    @Override
    public String toString() {
        return "Instituicao{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", grau=" + grau +
                ", adm=" + adm +
                '}';
    }
}
