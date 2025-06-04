package br.com.escola.model;

public class Estudante extends Pessoa {

    private String matricula;
    private Notas notas;
    private Frequencia frequencia;

    @Override
    void falar() {
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Notas getNotas() {
        return notas;
    }
    public void setNotas(Notas notas) {
        this.notas = notas;
    }
    public Frequencia getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(Frequencia frequencia) {
        this.frequencia = frequencia;
    }
}
