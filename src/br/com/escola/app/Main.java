package br.com.escola.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int resposta;

        System.out.println("Bem vindo ao seu sistema escolar:");
        do{
            System.out.println("---------------------------------");
            System.out.println("Escolha de usuário:");
            System.out.println();
            System.out.println("1-Aluno(a)");
            System.out.println("2-Professor(a)");
            System.out.println("3-Administração(a)");
            System.out.println("4-Diretor(a)");
            System.out.println("5-Cozinheiro(a)");
            System.out.println("----------------------------------");

            resposta = sc.nextInt();

            if (resposta < 1 || resposta > 5){
                System.out.println("Opção inválida, tente novamente:");
            }

    } while (resposta < 1 || resposta > 5);
        
        


    }
}