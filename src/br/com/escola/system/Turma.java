package br.com.escola.system;

import br.com.escola.model.Estudante;
import br.com.escola.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String materia;
    private Professor professor;
    private List<Estudante> estudantes;

    public Turma() {
        estudantes = new ArrayList<>();
    }

    public void dadosTurma(){
        System.out.println("Dados da turma:");
        System.out.println("Professor: " + getProfessor());
        System.out.println("Matéria:" + getMateria());
        System.out.println("Alunos: " + getEstudantes());
    }

    public void adicionarEstudante(Estudante estudante) {
        System.out.println("Estudante " + estudante.getNome() + " adicionado com sucesso!");
        this.estudantes.add(estudante);
    }

    public void removerEstudante(int index) {
        System.out.println("Estudante " + estudantes.get(index).getNome() + " removido com sucesso!");
        this.estudantes.remove(index);
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return materia + " - " + professor;
    }
}
