class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e setters para os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    // Getter e setter para o atributo específico

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    // Getter e setter para o atributo específico

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

public class Mod13 {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "Rua A", "123456789", "123.456.789-00");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Rua B", "987654321", "12.345.678/0001-00");

        System.out.println("Nome Pessoa Física: " + pessoaFisica.getNome());
        System.out.println("CPF Pessoa Física: " + pessoaFisica.getCpf());

        System.out.println("\nNome Pessoa Jurídica: " + pessoaJuridica.getNome());
        System.out.println("CNPJ Pessoa Jurídica: " + pessoaJuridica.getCnpj());
    }
}

