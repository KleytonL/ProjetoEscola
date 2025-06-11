package br.com.escola.model;

import java.util.List;

public class Turma {
    private List<Estudante> estudante;

    private Professor professor;
    private String materia;

    public void dadosTurma(){
        System.out.println("Dados da turma:");
        System.out.println("Professor: " + getProfessor());
        System.out.println("Matéria:" + getMateria());
        System.out.println("Alunos: " + getEstudante());
    }

    public List<Estudante> getEstudante() {
        return estudante;
    }

    public void setEstudante(List<Estudante> estudante) {
        this.estudante = estudante;
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
}
