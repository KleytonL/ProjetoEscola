package br.com.escola.system;

import br.com.escola.model.Estudante;

import java.util.List;

public class Notas {

    public double calculaMediaEstudante(Estudante estudante) {
        int media = 0;
        for(Integer n : estudante.getNotas()) {
            media += n;
        }
        return media / estudante.getNotas().size();
    }

    public void validaMediaEstudante(Estudante estudante) {
        double mediaCalculada = calculaMediaEstudante(estudante);

        System.out.println("Nota de " + estudante + ": " + mediaCalculada);
        if(mediaCalculada < 70) {
            System.out.println("A nota do aluno está abaixo da média!");
        } else {
            System.out.println("A nota do aluno está acima da média!");
        }
    }

    public double calculaMediaTurma(Turma turma) {
        int media = 0;
        for(Estudante e : turma.getEstudantes()) {
            media += calculaMediaEstudante(e);
        }
        return media / turma.getEstudantes().size();
    }

    public void validaMediaTurma(Turma turma) {
        double mediaDaTurma = calculaMediaTurma(turma);

        System.out.println("Nota da turma: " + mediaDaTurma);
        if(mediaDaTurma < 70) {
            System.out.println("A nota da turma está abaixo da média!");
        } else {
            System.out.println("A nota da turma está  acima da média!");
        }
    }
}
