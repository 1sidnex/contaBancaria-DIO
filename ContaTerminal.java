import java.util.Scanner; // Importa a classe Scanner para permitir a leitura de entrada do usuário

public class ContaTerminal {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do terminal
        Scanner scanner = new Scanner(System.in);

        // Declara as variáveis para armazenar as informações da conta
        int numero;          // Para o número da conta
        String agencia;      // Para o número da agência (pode conter traço, então String)
        String nomeCliente;  // Para o nome do cliente
        double saldo;        // Para o saldo da conta 

        System.out.println("Por favor, digite o número da Agência (ex: 067-8):");
        agencia = scanner.nextLine(); // Lê a agência como uma String

        System.out.println("Por favor, digite o número da Conta (ex: 1021):");
        numero = scanner.nextInt(); // Lê o número da conta como um inteiro
        scanner.nextLine(); // Consome a quebra de linha pendente após ler o inteiro.
                            

        System.out.println("Por favor, digite o seu Nome Completo:");
        nomeCliente = scanner.nextLine(); // Lê o nome do cliente como uma String

        System.out.println("Por favor, digite o saldo inicial da Conta (ex: 237.48):");
        saldo = scanner.nextDouble(); // Lê o saldo como um double (número decimal)
        scanner.nextLine(); // Consome a quebra de linha pendente após ler o double, pelo mesmo motivo.


        // Exibe a mensagem final formatada com as informações inseridas
        // Usamos concatenação de Strings para montar a mensagem
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo R$057" + saldo + " já está disponível para saque.");

        // Fecha o objeto Scanner para liberar os recursos do sistema
        scanner.close();
    }
}