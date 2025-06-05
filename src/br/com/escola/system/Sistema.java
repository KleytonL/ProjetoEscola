package br.com.escola.system;

import br.com.escola.model.Frequencia;
import br.com.escola.model.Notas;
import br.com.escola.model.Turma;

public class Sistema {

    private Frequencia freq;
    private Turma turma;
    private Notas notas;

    public Frequencia getFreq() {
        return freq;
    }

    public void setFreq(Frequencia freq) {
        this.freq = freq;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }
}
