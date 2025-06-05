package br.com.escola.model;

public class Estudante extends Pessoa {

    private String matricula;
    private int nota;
    private int presencas;
    private int faltas;

    @Override
    void falar() {
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
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
}
