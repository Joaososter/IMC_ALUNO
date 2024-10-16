package pessoas;

public class pessoa {
    // Atributos privados (encapsulamento)
    private String nome;
    private String cpf;
    private double peso;
    private double altura;

    // Construtor da classe Pessoa
    public pessoa(String nome, String cpf, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos getters (para acessar os atributos)
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    // Método toString() para exibir as informações da pessoa
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Peso: " + peso + "kg, Altura: " + altura + "m";
    }
}
