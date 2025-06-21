Esse código Java é um programa simples que simula a criação de uma conta bancária a partir de informações fornecidas pelo usuário. Ele foi desenvolvido como parte de um desafio da DIO (Digital Innovation One), uma plataforma de educação em tecnologia.
Como o Código Funciona

O programa utiliza a classe Scanner para interagir com o usuário, solicitando e lendo dados diretamente do console. Veja o passo a passo:

    Importação do Scanner: A primeira linha import java.util.Scanner; permite que o programa use a funcionalidade de leitura de entrada do usuário.

    Criação do Objeto Scanner: Dentro do método main (o ponto de entrada do programa), um objeto Scanner é criado: Scanner scanner = new Scanner(System.in);. Isso prepara o programa para receber entradas do teclado.

    Declaração de Variáveis: Quatro variáveis são declaradas para armazenar as informações da conta:
        int numero: Para o número da conta (um número inteiro).
        String agencia: Para o número da agência (uma string, pois pode conter caracteres como traços).
        String nomeCliente: Para o nome completo do cliente.
        double saldo: Para o saldo inicial da conta (um número decimal).

    Coleta de Dados do Usuário: O programa exibe mensagens no console (System.out.println) solicitando ao usuário que digite as informações da conta. Cada entrada é lida e armazenada na variável correspondente:
        Agência: scanner.nextLine() lê a agência como uma string.
        Número da Conta: scanner.nextInt() lê o número da conta como um inteiro. Há um scanner.nextLine() extra após a leitura do inteiro para "consumir" a quebra de linha que fica no buffer de entrada, evitando problemas nas próximas leituras de nextLine().
        Nome do Cliente: scanner.nextLine() lê o nome completo.
        Saldo Inicial: scanner.nextDouble() lê o saldo como um número decimal. Outro scanner.nextLine() é usado pelo mesmo motivo de consumo da quebra de linha.

    Exibição da Mensagem Final: Após coletar todas as informações, o programa monta e exibe uma mensagem de boas-vindas formatada, utilizando os dados inseridos pelo usuário. A mensagem informa o nome do cliente, os detalhes da agência e conta, e o saldo disponível.

    Fechamento do Scanner: Finalmente, scanner.close() é chamado para liberar os recursos do sistema associados ao objeto Scanner. Isso é uma boa prática para evitar vazamentos de recursos.
