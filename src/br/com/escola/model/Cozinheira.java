package br.com.escola.model;

import br.com.escola.util.DataUtil;

import java.util.ArrayList;
import java.util.List;

public class Cozinheira extends Pessoa{

private double salario;
private List<String> listaDeAlimentos;

    public Cozinheira(){
        listaDeAlimentos = new ArrayList<>();
    }

    public Cozinheira(double salario) {
        this.salario = salario;
        listaDeAlimentos = new ArrayList<>();
    }

    public double bonus(double bonus){
        System.out.println("Bonus de:" + bonus + " adcionado ao salário");
        return this.salario += bonus;
    }

    public void escolheCardarpio(int item){
        System.out.println("O prato de hoje será:" + listaDeAlimentos.get(item));
    }

    public void addLista(String item){
        listaDeAlimentos.add(item);
    }

    @Override
    public void falar(){
        System.out.println("A cozinheira está falando!");
    }

    public void exibirDados() {
        System.out.println("\n--- Cozinheira ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Data de Nascimento: " + DataUtil.formatarParaString(getDataNascimento()));
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CPF: " + getDocumento());
        System.out.println("Salário: " + getSalario());
        System.out.println("-------------------\n");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<String> getListaDeAlimentos() {
        return listaDeAlimentos;
    }

    public void setListaDeAlimentos(List<String> listaDeAlimentos) {
        this.listaDeAlimentos = listaDeAlimentos;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

}
