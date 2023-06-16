package Test;

import Visitor.Animal;
import Visitor.AnimalVisitor;
import Visitor.Cachorro;
import Visitor.Gato;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void testExibirAnimal() {
        Animal animal = new Animal("Animal1", 5);
        AnimalVisitor visitor = new AnimalVisitor();
        String resultado = visitor.exibir(animal);
        assertEquals("Animal{nome='Animal1', idade=5}", resultado);
    }

    @Test
    public void testExibirCachorro() {
        Cachorro cachorro = new Cachorro("Cachorro1", 3, "Poodle");
        AnimalVisitor visitor = new AnimalVisitor();
        String resultado = visitor.exibir(cachorro);
        assertEquals("Cachorro{nome='Cachorro1', idade=3, raça='Poodle'}", resultado);
    }

    @Test
    public void testExibirGato() {
        Gato gato = new Gato("Gato1", 2, "Preto");
        AnimalVisitor visitor = new AnimalVisitor();
        String resultado = visitor.exibir(gato);
        assertEquals("Gato{nome='Gato1', idade=2, cor='Preto'}", resultado);
    }
}

