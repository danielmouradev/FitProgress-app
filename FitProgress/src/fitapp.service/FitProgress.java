import java.util.Scanner;

public class FitProgress {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("\nSELECIONE A OPÇÃO DE TREINO A SE CADASTRAR COM BASE NO ID (1,2,3,4,5)\n");

        System.out.println("[1 - Peito], [2 - Costas], [3 - Bíceps], [4 - Ombro], [5 - Perna]\n");

        System.out.print("Digite o id: ");
        Integer id = sc.nextInt();

        ServiceClass serviceClass = new ServiceClass(); 

        serviceClass.cadastrarTreino(id);
    
         

         

        sc.close();
    }
}
