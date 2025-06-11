package br.com.escola.model;

import br.com.escola.system.Autenticavel;

public class Diretor extends Pessoa implements Autenticavel {

    private double salario;

    public double bonus(double bonus){
        System.out.println("Bonus de:" + bonus + " adcionado ao salário");
        return this.salario += bonus;
    }
    
    @Override
    void falar(){

    }

    @Override
    public boolean senha() {
        return true;
    }
}
