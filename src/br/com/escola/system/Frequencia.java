package br.com.escola.system;

import br.com.escola.model.Estudante;

import java.util.Scanner;

public class Frequencia {

    static Scanner sc = new Scanner(System.in);

    public void validaPresenca(Estudante aluno) {
        System.out.println(aluno + " está presente?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.print("Escolha uma opção: ");
        int presente = sc.nextInt();
        switch (presente) {
            case 1:
                aluno.setPresencas(aluno.getPresencas() + 1);
                break;
            case 2:
                aluno.setFaltas(aluno.getFaltas() + 1);
                break;
            default:
                System.out.println("Opção inválida...");
                break;
        }
    }

    public void abonaFalta(Estudante aluno){
        System.out.println("Deseja abonar uma falta de " + aluno + "?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.print("Escolha uma opção: ");
        int abonar = sc.nextInt();
        switch (abonar) {
            case 1:
                aluno.setPresencas(aluno.getPresencas() + 1);
                aluno.setFaltas(aluno.getFaltas() - 1);
                break;
            case 2:
                break;
            default:
                System.out.println("Opção inválida...");
                break;
        }
    }

    public void exibirFrequencia(Estudante aluno) {
        double presenca = aluno.getPresencas();
        int diasDeAula = aluno.getPresencas() + aluno.getFaltas();
        double media = (presenca / diasDeAula) * 100;
        System.out.println("O estudante " + aluno + " possui:");
        System.out.println(aluno.getPresencas() + " presenças - " + aluno.getFaltas() + " faltas");
        System.out.println(aluno + " possui uma frequência de: " + media + "%");
    }
}
