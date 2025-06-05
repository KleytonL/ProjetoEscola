package br.com.escola.model;

public class Estudante extends Pessoa {

    private String matricula;
    private Integer nota;
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
    public Integer getNota() {
        return nota;
    }
    public void setNota(Integer nota) {
        this.nota = nota;
    }
    public Frequencia getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(Frequencia frequencia) {
        this.frequencia = frequencia;
    }
}
