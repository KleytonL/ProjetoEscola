package br.com.escola.app;

import br.com.escola.model.*;
import br.com.escola.system.Sistema;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Instituicao faculdade = new Instituicao("UniFil", new Endereco("Av. J.K.", "Londrina",
                "Paraná", "Brasil"), Grau.SUPERIOR, Administracao.PRIVADA);

        Diretor diretor = new Diretor();

        Sistema sistema = faculdade.acessarSistema(diretor);

        System.out.println(faculdade);

        menuSistema(sistema);
        sc.close();
    }

    public static void menuSistema(Sistema sistema) {
        int opt;
        do {
            System.out.println("----- MENU SISTEMA -----");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("1");
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