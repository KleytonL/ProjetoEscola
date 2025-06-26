package br.com.escola.model;

import br.com.escola.system.Autenticavel;
import br.com.escola.util.DataUtil;

public class Professor extends Pessoa implements Autenticavel {

    static int contador = 0;
    private double salario;

    public Professor() {
    }

    public Professor(double salario) {
        super();
        this.salario = salario;
    }

    @Override
    public boolean senha() {
        return true;
    }

    public double bonus(double bonus){
        System.out.println("Bonus de:" + bonus + " adcionado ao salário");
        return this.salario += bonus;
    }

    public void aulaDada(){
        System.out.println("Aula registrada");
        contador++;
        System.out.println(getNome() + " tem um total de " + contador + " aulas dadas esse mês");
    }

    @Override
    public void falar(){
        System.out.println("O professor está falando!");
    }

    public void exibirDados() {
        System.out.println("\n--- Professor ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Data de Nascimento: " + DataUtil.formatarParaString(getDataNascimento()));
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CPF: " + getDocumento());
        System.out.println("Salário: " + getSalario());
        System.out.println("------------------\n");
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
