package pessoas;

public class aluno extends pessoa {
    // Atributos específicos da classe Aluno
    private double nota;
    private double percentualPresenca;

    // Construtor da classe Aluno
    public aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
        super(nome, cpf, peso, altura);  // Chama o construtor da classe Pessoa (herança)
        this.nota = nota;
        this.percentualPresenca = percentualPresenca;
    }

    // Métodos getters
    public double getNota() {
        return nota;
    }

    public double getPercentualPresenca() {
        return percentualPresenca;
    }

    // Método toString() para exibir as informações do aluno
    @Override
    public String toString() {
        return super.toString() + ", Nota: " + nota + ", Presença: " + percentualPresenca + "%";
    }
}
