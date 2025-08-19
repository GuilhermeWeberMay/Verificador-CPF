import java.util.Scanner;

public class Verificador_CPF {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Declaração da variavel
        String cpfEntrada;
        int qtdCaracterCpf, qtdNumeroCpf = 0, descresente = 10;
        // Declaração de variavies homogeneas
        char[] cpf = new char[11];
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
                primeiroDigito[0] = cpf[0] * 10;
                /*primeiroDigito[1] = cpf[1] * 9;
                primeiroDigito[2] = cpf[2] * 8;
                primeiroDigito[3] = cpf[3] * 7;
                primeiroDigito[4] = cpf[4] * 6;
                primeiroDigito[5] = cpf[5] * 5;
                primeiroDigito[6] = cpf[6] * 4;
                primeiroDigito[7] = cpf[7] * 3;
                primeiroDigito[8] = cpf[8] * 2;*/

            }
            else {
                System.out.println("CPF invalido");
            }
        }
        else {
            System.out.println("CPF invalido");
        }
        System.out.println(qtdNumeroCpf);
        for (int i = 0; i < qtdNumeroCpf; i++){
            System.out.print(cpf[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < 9; i++){
            System.out.print(primeiroDigito[i]+" ");
        }
    }
}
