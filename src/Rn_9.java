import utils.Matriz;

public class Rn_9 {
    public static void main(String[] args) throws Exception {
        int[][] rede = {
                { 3, 0, 3 }, // a minha matriz de entrada,
                { 0, 3, 0 }, // {3, 2, 0} a matriz de saída e
                { 0, 2, 0 } }; // {3, 0, 0} é a marcação inicial

        System.out.println("Rede de Petri - Inicial");
        Matriz.imprimirMatriz(rede);
        System.out.println("---------------------------------");

        do {
            System.out.printf("q0 -> ");
            rede[0][2]--;
            System.out.printf("t0 -> ");
            rede[1][2]++;
            System.out.println("q1");
            Matriz.imprimirMatriz(rede);
            System.out.println("---------------------------------");
        } while (rede[1][2] < 3);

        System.out.println("Rede de Petri - Final");
        Matriz.imprimirMatriz(rede);
    }
}
