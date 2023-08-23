import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Tabela {
    String nomeTabela();
}

@Tabela(nomeTabela = "clientes")
class Cliente {
    // campos e métodos da classe Cliente
}

@Tabela(nomeTabela = "produtos")
class Produto {
    // campos e métodos da classe Produto
}

public class table {
    public static void main(String[] args) {
        Class<?> clienteClass = Cliente.class;
        if (clienteClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = clienteClass.getAnnotation(Tabela.class);
            String nomeTabela = tabelaAnnotation.nomeTabela();
            System.out.println("Nome da tabela para a classe Cliente: " + nomeTabela);
        }

        Class<?> produtoClass = Produto.class;
        if (produtoClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = produtoClass.getAnnotation(Tabela.class);
            String nomeTabela = tabelaAnnotation.nomeTabela();
            System.out.println("Nome da tabela para a classe Produto: " + nomeTabela);
        }
    }
}
