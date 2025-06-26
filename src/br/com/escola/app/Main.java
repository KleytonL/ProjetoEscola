package br.com.escola.app;

import br.com.escola.model.*;
import br.com.escola.system.Sistema;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Instituicao faculdade = ClassManager.instanciarInstituicaoPadrao();
        faculdade.exibirDados();
        Sistema sistema;

        Diretor diretor = ClassManager.instanciarDiretorPadrao();
        diretor.exibirDados();
        diretor.falar();
        diretor.gerencia();

        Cozinheira cozinheira = ClassManager.instanciarCozinheiraPadrao();
        cozinheira.exibirDados();
        cozinheira.falar();
        cozinheira.getListaDeAlimentos();

        sistema = faculdade.acessarSistema(diretor);

        menuSistema(sistema);

        sc.close();
    }

    public static void menuSistema(Sistema sistema) {
        int opt;
        do {
            System.out.println("\n----- MENU SISTEMA -----");
            System.out.println("1 - Gerenciar turma");
            System.out.println("2 - Calcular notas");
            System.out.println("3 - Gerenciar faltas ");
            System.out.println("4 - Adicionar/Remover estudantes");
            System.out.println("5 - Adicionar/Remover professores");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    sistema.gerenciarTurma();
                    break;
                case 2:
                    sistema.calcularNotas();
                    break;
                case 3:
                    sistema.gerenciarFaltas();
                    break;
                case 4:
                    sistema.gerenciarEstudantes();
                    break;
                case 5:
                    sistema.gerenciarProfessores();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Valor inválido!");
                    break;
            }
        } while (opt != 0);
    }
}