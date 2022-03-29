package utils;

public class Matriz {

    public static void imprimirMatriz(int m[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
    }
}