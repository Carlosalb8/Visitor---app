package Visitor;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCachorro(this);
    }
}
