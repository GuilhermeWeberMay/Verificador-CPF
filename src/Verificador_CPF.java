import java.util.Scanner;

public class Verificador_CPF {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Declaração da variavel
        String cpfEntrada;
        int qtdCaracterCpf, qtdNumeroCpf = 0;
        // Entrada de dados
        System.out.print("Somente números \nFavor informe seu CPF: ");
        cpfEntrada =read.next();
        // Verificação de quantidade de carasteres informados pelo usuario
        qtdCaracterCpf = cpfEntrada.length();
        // Verificação - se não tiver 11 digitos não é um cpf valido
        if (qtdCaracterCpf == 11) {
            // Verificação - para confirmar que os 11 digitos são números
            for (int i = 0; i < 11; i++){
                if (Character.isDigit(cpfEntrada.charAt(i))){
                    qtdNumeroCpf++;
                }
            }
            // Se não tiver 11 números CPF inválido
            if (qtdNumeroCpf != 11) {
                System.out.println("CPF invalido");
            }
        }
        else {
            System.out.println("CPF invalido");
        }
        System.out.print(qtdNumeroCpf);
    }
}
