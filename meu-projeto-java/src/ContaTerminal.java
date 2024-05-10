import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        float saldo;

        System.out.println("Qual o seu Nome? ");
        nomeCliente = leia.nextLine();

        System.out.println("Digite o número da sua Agencia: ");
        agencia = leia.nextLine();

        System.out.println("Digite o número da sua Conta: ");
        numero = leia.nextInt();

        System.out.println("Digite o seu saldo: ");
        saldo = leia.nextFloat();

        System.out.println("Olá "+nomeCliente+" , obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" ,conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    


    }
    
}
