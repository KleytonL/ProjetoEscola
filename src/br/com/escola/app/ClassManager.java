package br.com.escola.app;

import br.com.escola.model.*;

import java.util.Date;
import java.util.Scanner;

public class ClassManager {

    static Scanner sc = new Scanner(System.in);

    public static Instituicao instanciarInstituicaoPadrao() {
        return new Instituicao("UniFil", new Endereco("Av. J.K.", "Londrina",
                "Paraná", "Brasil"), Grau.SUPERIOR, Administracao.PRIVADA);
    }

    public static Diretor instanciarDiretorPadrao() {
        Diretor diretor = new Diretor(3150.0);
        diretor.setNome("Rodolfo");
        diretor.setSexo(Sexo.MASC);
        diretor.setDataNascimento(new Date("10/12/1988"));
        diretor.setEndereco(new Endereco("Rua Almeida", "Londrina", "Paraná", "Brasil"));
        diretor.setDocumento(new Cnpj("11-1111-1111/11-1"));
        return diretor;
    }

    public static Cozinheira instanciarCozinheiraPadrao() {
        Cozinheira cozinheira = new Cozinheira(1500.0);
        cozinheira.setNome("Jéssica");
        cozinheira.setSexo(Sexo.FEM);
        cozinheira.setDataNascimento(new Date("22/03/1991"));
        cozinheira.setEndereco(new Endereco("Rua das Flores", "Faxinal", "Paraná", "Brasil"));
        cozinheira.setDocumento(new Cpf("111-111-111-11"));
        cozinheira.getListaDeAlimentos().add("Arroz");
        cozinheira.getListaDeAlimentos().add("Feijão");
        return cozinheira;
    }

    public static Professor instanciarProfessorPadrao() {
        Professor professor = new Professor(2270.0);
        professor.setNome("Marcos");
        professor.setSexo(Sexo.MASC);
        professor.setDataNascimento(new Date("19/02/1973"));
        professor.setEndereco(new Endereco("Rua Joari", "Londrina", "Paraná", "Brasil"));
        professor.setDocumento(new Cpf("222-222-222-22"));
        return professor;
    }

    public static Estudante instanciarEstudantePadrao() {
        Estudante estudante = new Estudante();
        estudante.setNome("Matheus");
        estudante.setSexo(Sexo.MASC);
        estudante.setDataNascimento(new Date("25/07/2000"));
        estudante.setEndereco(new Endereco("Rua Divina", "Faxinal", "Paraná", "Brasil"));
        estudante.setDocumento(new Cpf("999-222-444-55"));
        estudante.setMatricula("244041004");
        estudante.getNotas().add(98);
        estudante.getNotas().add(78);
        estudante.getNotas().add(50);
        estudante.getNotas().add(100);
        estudante.getNotas().add(67);
        estudante.setPresencas(13);
        estudante.setFaltas(3);
        return estudante;
    }

    public static Instituicao instanciarInstituicao() {
        Instituicao instituicao = new Instituicao();

        System.out.println("Informe o nome: ");
        instituicao.setNome(sc.nextLine());

        System.out.println("Informe o endereço: ");
        System.out.println("Rua - Cidade - Estado - País");
        instituicao.setEndereco(new Endereco(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        System.out.println("Informe o grau de ensino: ");
        System.out.println("1 - Fundamental");
        System.out.println("2 - Medio");
        System.out.println("3 - Superior");
        System.out.print("Escolha uma opção: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                instituicao.setGrau(Grau.FUNDAMENTAL);
                break;
            case 2:
                instituicao.setGrau(Grau.MEDIO);
                break;
            case 3:
                instituicao.setGrau(Grau.SUPERIOR);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("Informe a administração de ensino: ");
        System.out.println("1 - Pública");
        System.out.println("2 - Privada");
        System.out.print("Escolha uma opção: ");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                instituicao.setAdm(Administracao.PUBLICA);
                break;
            case 2:
                instituicao.setAdm(Administracao.PRIVADA);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("Instituição instânciada com sucesso!");
        return instituicao;
    }

    public static Diretor instanciarDiretor() {
        Diretor diretor = new Diretor();
        System.out.println("Informe o nome: ");
        diretor.setNome(sc.nextLine());

        System.out.println("Informe o sexo: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        System.out.print("Escolha uma opção: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                diretor.setSexo(Sexo.MASC);
                break;
            case 2:
                diretor.setSexo(Sexo.FEM);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.nextLine();

        System.out.println("Informe a data de nascimento (DD/MM/YYYY): ");
        diretor.setDataNascimento(new Date(sc.nextLine()));

        System.out.println("Informe o endereço: ");
        System.out.println("Rua - Cidade - Estado - País");
        diretor.setEndereco(new Endereco(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        System.out.println("Informe o CNPJ: ");
        diretor.setDocumento(new Cnpj(sc.nextLine()));

        System.out.println("Informe o salário: ");
        diretor.setSalario(sc.nextInt());

        System.out.println("Diretor instânciado com sucesso!");
        return diretor;
    }

    public static Cozinheira instanciarCozinheira() {
        Cozinheira cozinheira = new Cozinheira();
        System.out.println("Informe o nome: ");
        cozinheira.setNome(sc.nextLine());

        System.out.println("Informe o sexo: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        System.out.print("Escolha uma opção: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                cozinheira.setSexo(Sexo.MASC);
                break;
            case 2:
                cozinheira.setSexo(Sexo.FEM);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.nextLine();

        System.out.println("Informe a data de nascimento (DD/MM/YYYY): ");
        cozinheira.setDataNascimento(new Date(sc.nextLine()));

        System.out.println("Informe o endereço: ");
        System.out.println("Rua - Cidade - Estado - País");
        cozinheira.setEndereco(new Endereco(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        System.out.println("Informe o CNPJ: ");
        cozinheira.setDocumento(new Cnpj(sc.nextLine()));

        System.out.println("Informe o salário: ");
        cozinheira.setSalario(sc.nextInt());

        System.out.println("Deseja adicionar algum item a lista de alimentos?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.print("Escolha uma opção: ");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.println("Informe a quantidade de items: ");
                int qtd = sc.nextInt();
                for(int i = 0; i < qtd; i++) {
                    cozinheira.addLista(sc.nextLine());
                }
                break;
            case 2:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        cozinheira.getListaDeAlimentos().add(sc.nextLine());

        System.out.println("Cozinheira instânciada com sucesso!");
        return cozinheira;
    }

    public static Professor instanciarProfessor() {
        Professor professor = new Professor();
        System.out.println("Informe o nome: ");
        professor.setNome(sc.nextLine());

        System.out.println("Informe o sexo: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        System.out.print("Escolha uma opção: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                professor.setSexo(Sexo.MASC);
                break;
            case 2:
                professor.setSexo(Sexo.FEM);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.nextLine();

        System.out.println("Informe a data de nascimento (DD/MM/YYYY): ");
        professor.setDataNascimento(new Date(sc.nextLine()));

        System.out.println("Informe o endereço: ");
        System.out.println("Rua - Cidade - Estado - País");
        professor.setEndereco(new Endereco(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        System.out.println("Informe o CPF: ");
        professor.setDocumento(new Cpf(sc.nextLine()));

        System.out.println("Informe o salário: ");
        professor.setSalario(sc.nextInt());

        System.out.println("Professor instânciado com sucesso!");
        return professor;
    }

    public static Estudante instanciarEstudante() {
        sc.nextLine();
        Estudante estudante = new Estudante();
        System.out.println("Informe o nome: ");
        estudante.setNome(sc.nextLine());

        System.out.println("Informe o sexo: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        System.out.print("Escolha uma opção: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                estudante.setSexo(Sexo.MASC);
                break;
            case 2:
                estudante.setSexo(Sexo.FEM);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.nextLine();

        System.out.println("Informe a data de nascimento (DD/MM/YYYY): ");
        estudante.setDataNascimento(new Date(sc.nextLine()));

        System.out.println("Informe o endereço: ");
        System.out.println("Rua - Cidade - Estado - País");
        estudante.setEndereco(new Endereco(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        System.out.println("Informe o CPF: ");
        estudante.setDocumento(new Cpf(sc.nextLine()));

        System.out.println("Informe a matricula: ");
        estudante.setMatricula(sc.nextLine());

        System.out.println("Informe a quantas notas irá adicionar: ");
        int qtdNotas = sc.nextInt();
        for(int i = 0; i < qtdNotas; i++) {
            System.out.println((i + 1) + "° nota: ");
            estudante.getNotas().add(sc.nextInt());
        }

        System.out.println("Informe a quantidade de faltas:");
        estudante.setFaltas(sc.nextInt());

        System.out.println("Estudante instânciado com sucesso!");
        return estudante;
    }
}