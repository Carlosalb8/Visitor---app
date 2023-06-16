package Visitor;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirGato(this);
    }
}