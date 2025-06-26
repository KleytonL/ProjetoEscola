package br.com.escola.model;

import br.com.escola.system.Autenticavel;
import br.com.escola.util.DataUtil;

public class Diretor extends Pessoa implements Autenticavel {

    private double salario;

    public Diretor() {
    }

    public Diretor(double salario) {
        this.salario = salario;
    }

    public double bonus(double bonus){
        System.out.println("Bonus de:" + bonus + " adcionado ao salário");
        return this.salario += bonus;
    }
    
    @Override
    public void falar(){
        System.out.println("O diretor está falando!");
    }

    public void gerencia() {
        System.out.println("O diretor está gerênciando a instituição.");
    }

    public void exibirDados() {
        System.out.println("\n--- Diretor ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Data de Nascimento: " + DataUtil.formatarParaString(getDataNascimento()));
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CNPJ: " + getDocumento());
        System.out.println("Salário: " + getSalario());
        System.out.println("---------------\n");
    }

    @Override
    public boolean senha() {
        return true;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
