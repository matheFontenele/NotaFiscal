package models;

public class Cliente {
    private String nome;
    private boolean planoPlus;

    //Construtors
    public Cliente(String nome, boolean plano) {
        this.nome = nome;
        this.planoPlus = plano;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public boolean getPlanoPlus() {
        return planoPlus;
    }
}
