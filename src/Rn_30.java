import utils.Matriz;

public class Rn_30 {
  public static void main(String[] args) {
    int[][] redeSequenciamento = { // E S M
        { 1, 0, 1 }, // { 1, 0, 1 }
        { 0, 1, 0 } }; // { 0, 1, 0 }

    System.out.println("\nSequenciamento");
    System.out.println("q0");
    Matriz.imprimirMatriz(redeSequenciamento, 2, 3);

    System.out.println("q0 -> t0");
    System.out.println("q0 -> t0 -> q1");
    redeSequenciamento[0][2] -= redeSequenciamento[0][0];
    redeSequenciamento[1][2] += redeSequenciamento[1][1];

    Matriz.imprimirMatriz(redeSequenciamento, 2, 3);

    int[][] redeJuncao = { // E S M
        { 1, 0, 1 }, // { 1, 0, 1 }
        { 1, 0, 1 }, // { 1, 0, 1 }
        { 0, 1, 0 } }; // { 0, 1, 0 }

    System.out.println("\nJuncao");
    System.out.println("q0, q1 -> ");
    Matriz.imprimirMatriz(redeJuncao, 3, 3);

    redeJuncao[0][2] -= redeJuncao[0][0];
    redeJuncao[1][2] -= redeJuncao[1][0];
    redeJuncao[2][2] += redeJuncao[2][1];

    System.out.println("q0, q1 -> t0");
    System.out.println("q0, q1 -> t0 -> q2");
    Matriz.imprimirMatriz(redeJuncao, 3, 3);

    int[][] redeMerging = {
        { 1, 1, 0, 0, 1 },
        { 0, 0, 1, 0, 0 },
        { 0, 0, 0, 1, 0 } };

    System.out.println("\nMerging");
    System.out.println("q2 -> ");
    Matriz.imprimirMatriz(redeMerging, 3, 5);

    redeMerging[0][4] -= redeMerging[0][0];
    redeMerging[1][4] += redeMerging[1][2];
    redeMerging[2][4] += redeMerging[2][3];

    System.out.println("q2 -> t0, t1");
    System.out.println("q2 -> t0 -> q0 ");
    System.out.println("   -> t1 -> q1 ");
    Matriz.imprimirMatriz(redeMerging, 3, 5);

    int[][] redeDistribuicao = {
      { 1, 1, 0, 0, 1 },
      { 0, 0, 1, 0, 0 },
      { 0, 0, 0, 1, 0 } };

    System.out.println("\nEscolha");
    System.out.println("q0 -> ");
    Matriz.imprimirMatriz(redeDistribuicao, 3, 5);

    redeDistribuicao[0][4] -= redeDistribuicao[0][0];
    redeDistribuicao[1][4] += redeDistribuicao[1][2];
    redeDistribuicao[2][4] += redeDistribuicao[2][3];

    System.out.println("q0 -> t0");
    System.out.println("   -> t1");
    System.out.println("q0 -> t0 -> q1");
    System.out.println("      t1 -> q2 ");
    Matriz.imprimirMatriz(redeDistribuicao, 3, 5);
  }
}
