package br.com.escola.app;

import br.com.escola.model.Administracao;
import br.com.escola.model.Endereco;
import br.com.escola.model.Grau;
import br.com.escola.model.Instituicao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Instituicao faculdade = new Instituicao("UniFil", new Endereco("Av. J.K.", "Londrina",
                "Paraná", "Brasil"), Grau.SUPERIOR, Administracao.PRIVADA);

        sc.close();
    }

    public void exibirMenu() {

    }
}