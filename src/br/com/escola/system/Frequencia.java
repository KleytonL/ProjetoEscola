package br.com.escola.system;

import br.com.escola.model.Estudante;

public class Frequencia {

    public void validaPresenca(Estudante aluno, boolean presente) {
        if(presente == true) {
            aluno.setPresencas(aluno.getPresencas() + 1);
        } else {
            aluno.setFaltas(aluno.getFaltas() + 1);
        }
    }

    public void abonaFalta(Estudante aluno, int faltas){
        aluno.setPresencas(aluno.getPresencas() + faltas);
        aluno.setFaltas(aluno.getFaltas() - faltas);
    }
}
