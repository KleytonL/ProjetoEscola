package br.com.escola.model;

import java.util.List;

public class Cozinheira extends Pessoa{

private double salario;
private List <String> listaCompras;

    public Cozinheira(double salario) {
        super();
        this.salario = salario;
    }

    public double bonus(double bonus){
        System.out.println("Bonus de:" + bonus + " adcionado ao salário");
        return this.salario += bonus;
    }

    public void escolheCardarpio(String item){
        System.out.println("O prato de hoje será:" + item);
    }

    public void addLista(String item){
        listaCompras.add(item);
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

    public List<String> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<String> listaCompras) {
        this.listaCompras = listaCompras;
    }



}
