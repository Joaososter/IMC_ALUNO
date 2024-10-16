package pessoas;

public class Main {
    public static void main(String[] args) {
        // Criação de objetos Pessoa e Aluno
        pessoa pessoa1 = new pessoa("Carlos", "12345678901",80, 1.90);
        aluno aluno1 = new aluno("Joao", "09876543210", 80, 1.85, 8.0, 80.0);

        // Exibindo informações
        System.out.println("Informações da pessoa:");
        System.out.println(pessoa1);
        
        System.out.println("Informações do aluno:");
        System.out.println(aluno1);

        // Testando as funções
        System.out.println("\nCPF da pessoa é válido? " + FuncoesUteis.verificarCpf(pessoa1.getCpf()));
        System.out.println("IMC da pessoa: " + FuncoesUteis.calcularImc(pessoa1.getPeso(), pessoa1.getAltura()));
        System.out.println("Avaliação do aluno: " + FuncoesUteis.avaliarAluno(aluno1.getNota(), aluno1.getPercentualPresenca()));
    }
}
