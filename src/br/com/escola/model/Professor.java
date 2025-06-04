package br.com.escola.model;

public class Professor extends Pessoa {

    private double salario;

    public double bonus(double bonus){
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
