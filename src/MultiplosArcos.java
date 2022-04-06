import utils.Matriz;

public class MultiplosArcos {
    public static void main(String[] args) throws Exception {
        int[][] rede = {        //   E  S  M
                { 3, 0, 3 },    // { 3, 0, 3 }
                { 0, 3, 0 },    // { 0, 3, 0 }
                { 0, 2, 0 } };  // { 0, 2, 0 }

        System.out.println("Rede de Petri - Inicial");
        System.out.println("q0 -> t0");
        Matriz.imprimirMatriz(rede, 3, 3);

        System.out.printf("q0 -> t0 -> ");
        rede[0][2] -= rede[0][0];
        rede[1][2] += rede[1][1];
        rede[2][2] += rede[2][1];
        System.out.println("q1, q2");
        Matriz.imprimirMatriz(rede, 3, 3);
    }
}
