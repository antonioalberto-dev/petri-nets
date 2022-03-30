import utils.Matriz;

public class LinhaProcucao {
  public static void main(String[] args) {
    int[][] rede = {          //    t0    t1   M
        { 1, 0, 0, 1, 1 },    // { 1, 0, 0, 1, 1 }
        { 0, 1, 1, 0, 0 },    // { 0, 1, 1, 0, 0 }
        { 0, 0, 0, 1, 0 },    // { 0, 0, 0, 1, 0 }
        { 3, 0, 0, 0, 8 },    // { 3, 0, 0, 0, 8 }
        { 3, 0, 0, 0, 7 }, }; // { 3, 0, 0, 0, 7 }

    System.out.println("\nRede de Petri - Inicial");
    Matriz.imprimirMatriz(rede, 5, 5);

    System.out.println("q0, q3, q4 -> t0");
    System.out.println("q0, q3, q4 -> t0 -> q1\n");
    rede[0][4] -= rede[0][0];
    rede[1][4] += rede[1][2];
    rede[3][4] -= rede[3][0];
    rede[4][4] -= rede[4][0];
    Matriz.imprimirMatriz(rede, 5, 5);
    
    System.out.println("q0, q3, q4 -> t0 -> q1 -> t1");
    System.out.println("q0, q3, q4 -> t0 -> q1 -> t1 -> q2, q0\n");
    rede[0][4] += rede[0][3];
    rede[2][4] += rede[2][3];
    rede[1][4] -= rede[1][1];
    Matriz.imprimirMatriz(rede, 5, 5);
  }
}