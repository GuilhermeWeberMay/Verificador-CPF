import java.util.Scanner;

public class Verificador_CPF {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Declaração da variavel
        String cpfEntrada;
        int qtdCaracterCpf;
        // Entrada de dados
        System.out.print("Somente números \nFavor informe seu CPF: ");
        cpfEntrada =read.next();
        // Verificação de quantidade de carasteres informados pelo usuario
        qtdCaracterCpf = cpfEntrada.length();

    }
}
