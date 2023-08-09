// Classe que representa um Carro.
public class Carro {
    
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    
    // Construtor
    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
    
    // Método para obter o preço formatado como String
    public String getPrecoFormatado() {
        return "R$" + String.format("%.2f", preco);
    }
    
    // Método principal
    public static void main(String[] args) {
        // Criando uma instância de Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 150000.00);
        
        // Acessando atributos e métodos da instância
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
        System.out.println("Preço: " + meuCarro.getPrecoFormatado());
    }
}

