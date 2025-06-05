package br.com.escola.model;

import java.util.List;

public class Notas {

    private List<Estudante> alunos;

    public Notas(List<Estudante> alunos) {
        this.alunos = alunos;
    }

    public double calculaMedia() {
        int media = 0;
        for(Estudante e : alunos) {
            media += e.getNota();
        }
        return media / alunos.size();
    }

    public void ordenaNotas() {

    }

    public void validaMediaGeral() {
        int media = 0;
        for(Estudante e : alunos) {
            media += e.getNota();
        }

        if(media / alunos.size() < 70) {
            System.out.println("Os alunos estão abaixo da média!");
        } else {
            System.out.println("Os alunos estão acima da média!");
        }
    }

    public List<Estudante> getAlunos() {
        return alunos;
    }

    public void setValores(List<Estudante> alunos) {
        this.alunos = alunos;
    }
}
