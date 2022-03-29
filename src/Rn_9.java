import utils.Matriz;

public class Rn_9 {
    public static void main(String[] args) throws Exception {
        int[][] rede = {        //   E  S  M
                { 3, 0, 3 },    // { 3, 0, 3 }
                { 0, 3, 0 },    // { 0, 3, 0 }
                { 0, 2, 0 } };  // { 0, 2, 0 }

        System.out.println("Rede de Petri - Inicial");
        Matriz.imprimirMatriz(rede);
        System.out.println("---------------------------------");

        System.out.printf("q0 -> ");
        rede[0][2] = 0;
        System.out.printf("t0 -> ");
        rede[1][2] = 3;
        rede[2][2] = 2;
        System.out.println("q1 && q2");
        Matriz.imprimirMatriz(rede);
        System.out.println("---------------------------------");

        System.out.println("Rede de Petri - Final");
        Matriz.imprimirMatriz(rede);
    }
}
