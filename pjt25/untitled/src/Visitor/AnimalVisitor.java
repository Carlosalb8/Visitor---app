package Visitor;

public class AnimalVisitor implements Visitor {
    public AnimalVisitor() {
    }

    public String exibir(Animal animal) {
        return animal.aceitar(this);
    }

    public String exibirAnimal(Animal animal) {
        return "Animal{nome='" + animal.getNome() + "', idade=" + animal.getIdade() + "}";
    }

    public String exibirCachorro(Cachorro cachorro) {
        return "Cachorro{nome='" + cachorro.getNome() + "', idade=" + cachorro.getIdade() + ", raça='" + cachorro.getRaca() + "'}";
    }

    public String exibirGato(Gato gato) {
        return "Gato{nome='" + gato.getNome() + "', idade=" + gato.getIdade() + ", cor='" + gato.getCor() + "'}";
    }
}