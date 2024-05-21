package atividades;
   import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da entrada do usuário como uma string representando o número da conta:
        System.out.println("Digite o numero da conta bancaria:");
        String numeroConta = scanner.nextLine();

        try {
            // Chamar o método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(numeroConta);

            // Se não houver exceção, o número de conta é considerado válido:
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // Captura da exceção do tipo IllegalArgumentException e exibição da mensagem de erro:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Método para verificar se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {
        // Verificar se o número da conta tem exatamente 8 dígitos:
        if (numeroConta.length() != 8) {
            // Lançar uma exceção do tipo IllegalArgumentException se o número de conta não tiver 8 dígitos:
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}

