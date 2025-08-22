import java.util.Scanner;

public class Verificador_CPF {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Declaração da variavel
        String cpfEntrada;
        int qtdCaracterCpf, qtdNumeroCpf = 0, somaPrimeiroDigito = 0, somaSegundoDigito = 0, restoPrimeiroDigito, restoSegundoDigito;
        // Declaração de variavies homogeneas
        int[] cpf = new int[11];
        int[] primeiroDigito = new int[10];
        int[] segundoDigito = new int[10];
        boolean formatacao = false;

        // Entrada de dados
        System.out.println("O programa não funciona corretamente com os cpf's: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+""+i+""+i+"."+i+""+i+""+i+"."+i+""+i+""+i+"-"+i+i);
        }
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
                    cpf[i] = Character.getNumericValue(cpfEntrada.charAt(i));
                    // 1° o chartAt pega o caracter
                    // 2° o Character.getNumericValue pega o caracter e transforma em int
                }
                // Verificação do primeiro digito, seria este número representado por X - 000.000.000-X0
                for (int i = 0; i < 9; i++){
                    primeiroDigito[i] = cpf[i] * (10 - i);
                    somaPrimeiroDigito += primeiroDigito[i];
                }
                // Verificação do segundo digito, seria este número representado por X - 000.000.000-0X
                for (int i = 0; i <= 9; i++){
                    segundoDigito[i] = cpf[i] * (11 - i);
                    somaSegundoDigito += segundoDigito[i];
                }
                // Verificação para ver se 10° digito é verdadeiro, se o resto for igual o 10° digito é valido
                // Verificação para o digito verificador não dar -1 e dar errado - primeiro digito verificador
                restoPrimeiroDigito = (somaPrimeiroDigito * 10) % 11;
                if (restoPrimeiroDigito == 10) {
                    restoPrimeiroDigito = 0;
                }
                // Verificação para o digito verificador não dar -1 e dar errado - segundo digito verificador
                restoSegundoDigito = (somaSegundoDigito * 10) % 11;
                if (restoSegundoDigito == 10) {
                    restoSegundoDigito = 0;
                }
                // Verificação para ver se o resto é igual ao numero informado
                if (restoPrimeiroDigito == cpf[9] && restoSegundoDigito == cpf[10]){
                    System.out.println("O CPF é valido");
                    formatacao = true;
                } else {
                    System.out.println("CPF invalido");
                }
            }
            else {
                System.out.println("CPF invalido");
            }
        }
        else {
            System.out.println("CPF invalido");
        }
        // Apresentação do CPF formatado corretamente
        if (formatacao) {
            for (int i = 0; i < 11; i++){
                System.out.print(cpf[i]);
                if(i == 2 || i == 5){
                    System.out.print(".");
                }
                if (i == 8){
                    System.out.print("-");
                }
            }
        }
    }
}
