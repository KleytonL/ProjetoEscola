package br.com.escola.model;

import br.com.escola.util.DataUtil;

import java.util.ArrayList;
import java.util.List;

public class Estudante extends Pessoa {

    private String matricula;
    private List<Integer> notas;
    private int presencas;
    private int faltas;

    public Estudante() {
        notas = new ArrayList<>();
    }

    @Override
    public void falar() {
        System.out.println("O estudante está falando!");
    }

    public void exibirDados() {
        System.out.println("\n--- Estudante ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Data de Nascimento: " + DataUtil.formatarParaString(getDataNascimento()));
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CPF: " + getDocumento());
        System.out.println("Nota média: " + getNotas());
        System.out.println("Presença: " + getPresencas());
        System.out.println("Faltas: " + getFaltas());
        System.out.println("------------------\n");
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public List<Integer> getNotas() {
        return notas;
    }
    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public int getPresencas() {
        return presencas;
    }

    public void setPresencas(int presencas) {
        this.presencas = presencas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
