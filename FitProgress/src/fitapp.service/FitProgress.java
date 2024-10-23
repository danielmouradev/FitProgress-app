import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FitProgress {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ServiceClass serviceClass = new ServiceClass();

        int quantidade = 0;
        String[] exercicios = null;

        System.out.println();

        /*
         * Estrutura de repetição para continuar rodando as opções enquanto o
         * programa for verdadeiro
         */

        while (true) {

            // Opções para o usuário escolher
            System.out.println();
            System.out.println("[1] - CADASTRAR TREINO");
            System.out.println("[2] - DESCREVER TREINO");
            System.out.println("[3] - CADASTRAR-SE COMO ALUNO");
            System.out.println("[4] - LISTAR TREINO");
            System.out.println("[5] - SAIR");

            System.out.print("Digite uma opção de 1 a 5: ");
            int option = sc.nextInt();
            System.out.println();
            if (option > 0 || option <= 5) {

                /* Switch/case para executar as opções do usuário */
                switch (option) {
                    case 1: /*
                             * Usuário vai digitar o id. Esse id vai ser atribuído a classe Enum e vai
                             * cadastrar um treino
                             */
                        System.out.println("\nSELECIONE A OPÇÃO DE TREINO A SE CADASTRAR COM BASE NO ID (1,2,3,4,5)\n");

                        System.out.println("[1 - Peito], [2 - Costas], [3 - Bíceps], [4 - Ombro], [5 - Perna]\n");

                        System.out.print("Digite o id: ");
                        Integer id = sc.nextInt();

                        System.out.print("Digite a quantidade de exercícios a se cadastrar: ");
                        quantidade = sc.nextInt();
                        sc.nextLine();

                        exercicios = new String[quantidade];

                        for (int i = 0; i < exercicios.length; i++) {
                            System.out.print("Digite o " + (i + 1) + "º exercício: ");
                            exercicios[i] = sc.nextLine();
                        }

                        System.out.println("-------------Exercícios cadastrados--------------: ");
                        for (int i = 0; i < exercicios.length; i++) {
                            System.out.println(exercicios[i]);
                        }
                        serviceClass.cadastrarTreino(id, exercicios);
                        break;

                    case 2: /*
                             * O usuário vai escolher um treino pelo id atribuído a um enum, para descrever
                             * o treino
                             */
                        System.out.print("Digite o id do treino a ser cadastrado - " +
                                "[1 - Peito], [2 - Costas], [3 - Bíceps], [4 - Ombro], [5 - Perna]: ");
                        id = sc.nextInt();
                        sc.nextLine(); // Limpa o buffer
                        EnumTreino enumTreino = EnumTreino.fromValor(id);
                        System.out.println("TREINO ESCOLHIDO: " + enumTreino);

                        System.out.println("Descreva abaixo o seu treino: ");
                        String descricao = sc.nextLine();

                        serviceClass.descreverTreino(descricao);
                        break;

                    case 3:

                        System.out.print("Digite o seu nome completo: ");
                        String nome = sc.nextLine();
                        sc.nextLine();

                        System.out.print("Digite seu cpf (com pontos e traço): ");
                        String cpf = sc.nextLine();

                        System.out.print("Digite sua matrícula: ");
                        int matricula = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
                        String dataNasc1 = sc.nextLine();

                        /* Define o formato esperado pela data */
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                        /* Converte a String para Date através do LocalDate.parse */
                        LocalDate dataNasc = LocalDate.parse(dataNasc1, formatter);

                        /* Define o formato que vai ser impresso (no caso o BR) */
                        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                        /* Formata a data convertida */
                        String dateFormatter = dataNasc.format(outputFormatter);

                        dataNasc1 = dateFormatter;

                        System.out.print("Digite seu email: ");
                        String email = sc.nextLine();

                        System.out.print("Digite seu telefone: ");
                        String telefone = sc.nextLine();
                        Aluno aluno = new Aluno(nome, matricula, dataNasc, email, telefone);
                        serviceClass.cadastrarAluno(cpf);
                        break;

                    case 4:
                        List<String> listarExercicios = Arrays.asList(exercicios);
                        for (String string : listarExercicios) {
                            System.out.println(string);
                        }

                        break;

                    case 5:
                        System.out.println("Programa encerrado!");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Tente novamente!");
                        break;
                }
            }

        }
    }
}
