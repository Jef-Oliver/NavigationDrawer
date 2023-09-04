package com.jeferson.atividade3pdm2.ui.models;

public class Disciplina {
    private String nome;
    private String dificuldade;

    public Disciplina(String nome, String dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }
}

