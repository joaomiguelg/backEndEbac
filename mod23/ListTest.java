import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    @Test
    public void testFemininoListaContainsOnlyFemaleNames() {
        Lista lista = new Lista();

        // Adicione nomes apenas à lista feminina
        lista.feminino.add("Maria");
        lista.feminino.add("Ana");
        lista.feminino.add("Joana");

        // Adicione nomes à lista masculina
        lista.masculino.add("Pedro");
        lista.masculino.add("João");

        assertTrue(lista.femininoLista.stream().allMatch(nome -> Lista.feminino.contains(nome)));
    }
}
