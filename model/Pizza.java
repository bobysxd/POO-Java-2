package model;

public abstract class Pizza {
    protected String nome;
    protected double preco;

    public Pizza(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void preparar();
}
