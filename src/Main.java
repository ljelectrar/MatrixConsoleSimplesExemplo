import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Insira as dimensões da matriz: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++){
            System.out.println();
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();

        System.out.print("Insira um número para ser encontrado: ");
        int p = sc.nextInt();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] == p){
                    System.out.println("Cima:");
                    System.out.println(matrix[i - 1][j]);
                    System.out.println("Baixo: ");
                    System.out.println(matrix[i + 1][j]);

                    System.out.println("Direita: ");
                    System.out.println(matrix[i][j - 1]);
                    System.out.println("Esquerda: ");
                    System.out.println(matrix[i][j +1]);
                }
            }
        }

    }
}