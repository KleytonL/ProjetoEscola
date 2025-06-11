package br.com.escola.model;

import br.com.escola.system.Autenticavel;

public class Professor extends Pessoa implements Autenticavel {

    private double salario;

    public Professor() {
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
        int contador = 0;
        System.out.println("Aula registrada");
        contador++;
        System.out.println("Você tem um total de " + contador + "aulas dadas esse mês");
    }

    public Professor(double salario) {
        super();
        this.salario = salario;
    }

    

    @Override
    void falar(){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    

}
