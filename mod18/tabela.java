import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface tabela {
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