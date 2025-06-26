package br.com.escola.model;

import br.com.escola.system.Autenticavel;
import br.com.escola.system.Sistema;

public class Instituicao {

    private String nome;
    private Endereco endereco;
    private Grau grau;
    private Administracao adm;

    public Instituicao() {

    }

    public Instituicao(String nome, Endereco endereco, Grau grau, Administracao adm) {
        this.nome = nome;
        this.endereco = endereco;
        this.grau = grau;
        this.adm = adm;
    }

    public Sistema acessarSistema(Autenticavel autenticavel) {
        if(autenticavel.senha()) {
            System.out.println("Acesso liberado ao usuário: " + autenticavel);
            return new Sistema();
        }
        return null;
    }

    public void exibirDados() {
        System.out.println("\n----- Instituição -----");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Grau de ensino: " + grau);
        System.out.println("Adminstração: " + adm);
        System.out.println("-----------------------\n");
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
        return nome;
    }
}
