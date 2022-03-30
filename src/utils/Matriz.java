package utils;

public class Matriz {

    public static void imprimirMatriz(int m[][], int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
        System.out.println("- - - - - - - - - - - - - - - - -");
    }
}