package pessoas;

public class FuncoesUteis {

    // Método para verificar se o CPF é válido
    public static boolean verificarCpf(String cpf) {
        // Para simplificar, vamos apenas verificar se o CPF tem 11 caracteres
        return cpf != null && cpf.length() == 11;
    }

    // Método para calcular o IMC
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para avaliar o aluno
    public static String avaliarAluno(double nota, double percentualPresenca) {
        if (nota >= 5 && percentualPresenca >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
