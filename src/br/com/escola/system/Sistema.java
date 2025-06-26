package br.com.escola.system;

import br.com.escola.app.ClassManager;
import br.com.escola.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    Scanner sc = new Scanner(System.in);

    private Frequencia freq;
    private Notas notas;

    private List<Turma> turmas;
    private List<Professor> professores;
    private List<Estudante> estudantes;

    public Sistema() {
        turmas = new ArrayList<>();
        professores = new ArrayList<>();
        estudantes = new ArrayList<>();
    }

    public void gerenciarTurma() {
        int opt;
        int index;
        do {
            System.out.println("\n----- Gerenciamento de turma -----");
            System.out.println("1 - Criar nova turma");
            System.out.println("2 - Gerenciar turma");
            System.out.println("3 - Remover turma");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    index = 0;
                    Turma novaTurma = new Turma();

                    System.out.println("Informe a matéria: ");
                    novaTurma.setMateria(sc.nextLine());

                    System.out.println("Informe o professor: ");
                    if (!professores.isEmpty()) {
                        for(Professor p : professores) {
                            System.out.println(index + " - " + p);
                            index++;
                        }
                        opt = sc.nextInt();
                        novaTurma.setProfessor(professores.get(opt));
                    } else {
                        System.out.println("Nenhum professor cadastrado...");
                        System.out.println("1 - Adicionar professor");
                        System.out.println("2 - Adicionar professor padrão");
                        System.out.print("Escolha uma opção: ");
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                professores.add(ClassManager.instanciarProfessor());
                                novaTurma.setProfessor(professores.getLast());
                                break;
                            case 2:
                                professores.add(ClassManager.instanciarProfessorPadrao());
                                novaTurma.setProfessor(professores.getLast());
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }

                    index = 0;

                    System.out.println("Informe os estudantes: ");
                    if (!estudantes.isEmpty()) {
                        for(Estudante e : estudantes) {
                            System.out.println(index + " - " + e);
                            index++;
                        }
                        System.out.println("Informe a quantidade de estudantes que deseja adicionar:");
                        int qtd = sc.nextInt();
                        if(qtd > estudantes.size()) {
                            System.out.println("Não há quantidade suficiente de estudantes cadastrados...");
                            System.out.println("Escolha uma quantidade menor ou cadastre mais estudantes.");
                        } else {
                            for (int i = 0; i < qtd; i++) {
                                opt = sc.nextInt();
                                novaTurma.adicionarEstudante(estudantes.get(opt));
                            }
                        }
                    } else {
                        System.out.println("Nenhum estudante cadastrado...");
                        System.out.println("1 - Adicionar estudante");
                        System.out.println("2 - Adicionar estudante padrão");
                        System.out.print("Escolha uma opção: ");
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                System.out.println("Informe quantos estudantes deseja cadastrar: ");
                                int qtd = sc.nextInt();
                                for (int i = 0; i < qtd; i++) {
                                    estudantes.add(ClassManager.instanciarEstudante());
                                    novaTurma.adicionarEstudante(estudantes.getLast());
                                }
                                break;
                            case 2:
                                estudantes.add(ClassManager.instanciarEstudantePadrao());
                                novaTurma.adicionarEstudante(estudantes.getLast());
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }
                    turmas.add(novaTurma);
                    break;
                case 2:
                    index = 0;
                    System.out.println("Escolha a turma que deseja gerenciar: ");
                    for(Turma t : turmas) {
                        System.out.println(index + " - " + t);
                        index++;
                    }
                    System.out.print("Escolha uma opção: ");
                    opt = sc.nextInt();
                    Turma turmaGerenciada = turmas.get(opt);

                    System.out.println("Deseja trocar a matéria da turma atual?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    opt = sc.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.println("Informe a nova matéria: ");
                            turmaGerenciada.setMateria(sc.nextLine());
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }

                    System.out.println("Deseja trocar o professor da turma atual?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    opt = sc.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.println("Informe o novo professor: ");
                            for(Professor p : professores) {
                                System.out.println(index + " - " + p);
                                index++;
                            }
                            opt = sc.nextInt();
                            turmaGerenciada.setProfessor(professores.get(opt));
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }

                    do {
                        System.out.println("Deseja trocar o adicionar ou remover estudantes?");
                        System.out.println("1 - Adicionar estudante");
                        System.out.println("2 - Remover estudante");
                        System.out.println("3 - Não alterar");
                        System.out.println("0 - Voltar");
                        System.out.print("Escolha sua opção: ");
                        int qtd;
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                for(Estudante e : estudantes) {
                                    if(!turmaGerenciada.getEstudantes().contains(e)) {
                                        System.out.println(index + " - " + e);
                                    }
                                    System.out.println("X - " + e);
                                    index++;
                                }
                                System.out.println("Informe a quantidade de estudantes que deseja adicionar:");
                                qtd = sc.nextInt();
                                if(qtd > (estudantes.size() - turmaGerenciada.getEstudantes().size())) {
                                    System.out.println("Não há quantidade suficiente de estudantes cadastrados...");
                                    System.out.println("Escolha uma quantidade menor ou cadastre mais estudantes.");
                                } else {
                                    for (int i = 0; i < qtd; i++) {
                                        opt = sc.nextInt();
                                        turmaGerenciada.adicionarEstudante(estudantes.get(opt));
                                    }
                                }
                                break;
                            case 2:
                                for(Estudante e : turmaGerenciada.getEstudantes()) {
                                    System.out.println(index + " - " + e);
                                    index++;
                                }
                                System.out.println("Informe a quantidade de estudantes que deseja remover: ");
                                qtd = sc.nextInt();
                                if(qtd > turmaGerenciada.getEstudantes().size()) {
                                    System.out.println("Não há quantidade suficiente de estudantes cadastrados...");
                                    System.out.println("Escolha uma quantidade menor ou cadastre mais estudantes.");
                                } else {
                                    for (int i = 0; i < qtd; i++) {
                                        opt = sc.nextInt();
                                        turmaGerenciada.removerEstudante(opt);
                                    }
                                }
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    } while (opt != 3);

                    break;
                case 3:
                    index = 0;
                    break;
                case 0:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }



        } while (opt != 0);
    }

    public void calcularNotas() {
        notas = new Notas();
        int opt, index;
        do {
            System.out.println("\n----- Calcular notas -----");
            System.out.println("1 - Média do estudante");
            System.out.println("2 - Média da turma");
            System.out.println("3 - Ordenar média por estudante");
            System.out.println("4 - Ordenar média por turma");
            System.out.println("0 - Voltar");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    index = 0;
                    for(Estudante e : estudantes) {
                        System.out.println(index + " - " + e);
                        index++;
                    }
                    System.out.print("Escolha um estudante para validar sua média: ");
                    notas.validaMediaEstudante(estudantes.get(sc.nextInt()));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (opt != 0);
    }

    public void gerenciarFaltas() {
        System.out.println("\n----- Gerenciamento de faltas -----");
    }

    public void gerenciarEstudantes() {
        int opt, index;
        do {
            System.out.println("\n----- Gerenciar estudantes -----");
            System.out.println("1 - Adicionar novo estudante");
            System.out.println("2 - Remover estudante existente");
            System.out.println("3 - Listar todos os estudantes");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    estudantes.add(ClassManager.instanciarEstudante());
                    System.out.println("Estudante cadastrado!");
                    break;
                case 2:
                    index = 0;
                    for(Estudante e : estudantes) {
                        System.out.println(index + " - " + e);
                        index++;
                    }
                    System.out.print("Escolha o estudante que deseja remover: ");
                    opt = sc.nextInt();
                    estudantes.remove(opt);
                    System.out.println("Estudante removido!");
                    break;
                case 3:
                    System.out.println("Lista de todos os estudantes");
                    index = 0;
                    for(Estudante e : estudantes) {
                        System.out.println(index + " - " + e);
                        index++;
                    }
                    break;
                case 0:
                    System.out.println("Retornando...");
                    break;
                default:
                    break;

            }
        } while (opt != 0);
    }

    public void gerenciarProfessores() {
        int opt, index;
        do {
            System.out.println("\n----- Gerenciar professores -----");
            System.out.println("1 - Adicionar novo professor");
            System.out.println("2 - Remover professor existente");
            System.out.println("3 - Listar todos os professores");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    professores.add(ClassManager.instanciarProfessor());
                    System.out.println("Professor cadastrado!");
                    break;
                case 2:
                    index = 0;
                    for(Professor p : professores) {
                        System.out.println(index + " - " + p);
                        index++;
                    }
                    System.out.print("Escolha o professor que deseja remover: ");
                    opt = sc.nextInt();
                    professores.remove(opt);
                    System.out.println("Professor removido!");
                    break;
                case 3:
                    System.out.println("Lista de todos os professores");
                    index = 0;
                    for(Professor p : professores) {
                        System.out.println(index + " - " + p);
                        index++;
                    }
                    break;
                case 0:
                    System.out.println("Retornando...");
                    break;
                default:
                    break;

            }
        } while (opt != 0);
    }

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor " + professor.getNome() + " cadatrado com sucesso!");
    }

    public void removerProfessor(Professor professor) {
        professores.remove(professor);
        System.out.println("Professor " + professor.getNome() + " removido com sucesso!");
    }

    public void cadastrarEstudante(Estudante estudante) {
        estudantes.add(estudante);
        System.out.println("Estudante " + estudante.getNome() + " cadastrado com sucesso!");
    }

    public void removerEstudante(Estudante estudante) {
        estudantes.remove(estudante);
        System.out.println("Estudante " + estudante.getNome() + " removido com sucesso!");
    }

    public void cadastrarTurma(Turma turma) {
        turmas.add(turma);
    }

    public Frequencia getFreq() {
        return freq;
    }

    public void setFreq(Frequencia freq) {
        this.freq = freq;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
}
