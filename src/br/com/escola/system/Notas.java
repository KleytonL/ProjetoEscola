package br.com.escola.system;

import br.com.escola.model.Estudante;

import java.util.*;

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

    public void ordenaMediaEstudante(List<Estudante> estudantes) {
        Map<Estudante, Double> mediaEstudantes = new HashMap<>();
        Map<Estudante, Double> mediaOrdenada = new LinkedHashMap<>();
        List<Double> valores = new ArrayList<>();

        for (Estudante e : estudantes) {
            mediaEstudantes.put(e, calculaMediaEstudante(e));
        }

        for (Map.Entry<Estudante, Double> entry : mediaEstudantes.entrySet()) {
            valores.add(entry.getValue());
        }

        Collections.sort(valores);

        for (Double valor : valores) {
            for (Map.Entry<Estudante, Double> entry : mediaEstudantes.entrySet()) {
                if(entry.getValue().equals(valor)) {
                    mediaOrdenada.put(entry.getKey(), valor);
                }
            }
        }
        System.out.println("Estudante --- Média");
        for (Map.Entry<Estudante, Double> entry : mediaEstudantes.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void ordenaMediaTurma(List<Turma> turmas) {
        Map<Turma, Double> mediaTurma = new HashMap<>();
        Map<Turma, Double> mediaOrdenada = new LinkedHashMap<>();
        List<Double> valores = new ArrayList<>();

        for (Turma t : turmas) {
            mediaTurma.put(t, calculaMediaTurma(t));
        }

        for (Map.Entry<Turma, Double> entry : mediaTurma.entrySet()) {
            valores.add(entry.getValue());
        }

        Collections.sort(valores);

        for (Double valor : valores) {
            for (Map.Entry<Turma, Double> entry : mediaTurma.entrySet()) {
                if(entry.getValue().equals(valor)) {
                    mediaOrdenada.put(entry.getKey(), valor);
                }
            }
        }
        System.out.println("Turma --- Média");
        for (Map.Entry<Turma, Double> entry : mediaTurma.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
