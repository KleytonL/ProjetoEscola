package br.com.escola.app;

import br.com.escola.model.Cozinheira;
import br.com.escola.model.Diretor;
import br.com.escola.model.Estudante;
import br.com.escola.model.Professor;
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
            System.out.println("3-Diretor(a)");
            System.out.println("4-Cozinheiro(a)");
            System.out.println("----------------------------------");

            resposta = sc.nextInt();

            if (resposta < 1 || resposta > 4){
                System.out.println("Opção inválida, tente novamente:");
            }

    } while (resposta < 1 || resposta > 4);

    switch (resposta) {
        case 1:
            Estudante e1 = new Estudante();
            break;
        
        case 2:
            Professor p1 = new Professor();
            break;
        
        case 3:
            Diretor d1 = new Diretor();
            break;    

        case 4:
            Cozinheira c1 = new Cozinheira();
            break;
    }
        
    }
}