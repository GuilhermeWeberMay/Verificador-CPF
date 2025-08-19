import java.util.Scanner;

public class Verificador_CPF {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Declaração da variavel
        String cpfEntrada;
        int qtdCaracterCpf, qtdNumeroCpf = 0;
        // Declaração de variavies homogeneas
        int[] cpf = new int[11];
        int[] primeiroDigito = new int[11];
        // Entrada de dados
        System.out.print("Somente números \nFavor informe seu CPF:");
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
            // Se tiver 11 começa o algoritmo para verificar se é um CPF legitimo
            if (qtdNumeroCpf == 11) {
                for (int i = 0; i < 11; i++){
                    // Armazenamento dos digitos em um vetor
                    cpf[i] = cpfEntrada.charAt(i);
                }
                // Verificação do primeiro digito, seria este número representado por X - 000.000.000-X0
                for (int i = 0; i < 9; i++){
                primeiroDigito[i] = Character.getNumericValue(cpf[i]) * (10 - i);
                }
            }
            else {
                System.out.println("CPF invalido");
            }
        }
        else {
            System.out.println("CPF invalido");
        }
        System.out.println(qtdNumeroCpf);
        /*for (int i = 0; i < qtdNumeroCpf; i++){
            System.out.print(cpf[i]);
        }
        System.out.println("\n");*/
        for (int i = 0; i < 9; i++){
            System.out.print(primeiroDigito[i]+" ");
        }
    }
}
