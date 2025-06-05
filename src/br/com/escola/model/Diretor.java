package br.com.escola.model;

public class Diretor extends Pessoa {

    private double salario;

    public double bonus(double bonus){
        System.out.println("Bonus de:" + bonus + " adcionado ao salário");
        return this.salario += bonus;
    }
    
    @Override
    void falar(){

    }

}
