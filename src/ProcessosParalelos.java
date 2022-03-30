import utils.Matriz;

public class ProcessosParalelos {
  public static void main(String[] args) {
    int[][] rede = {
        { 1, 0, 0, 0, 0, 0, 0, 0, 1 },
        { 0, 1, 0, 0, 1, 0, 0, 0, 0 },
        { 0, 0, 1, 0, 1, 0, 0, 0, 0 },
        { 0, 0, 0, 1, 0, 1, 0, 0, 0 },
        { 0, 0, 0, 1, 0, 0, 1, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 1, 0 } };

    System.out.println("Rede de Petri - Inicial");
    System.out.println("q0 -> t0");
    Matriz.imprimirMatriz(rede, 6, 9);

    System.out.println("q0 -> t0 -> p1");
    System.out.println("         -> p2");
    rede[0][8] -= rede[0][0];
    rede[1][8] += rede[1][1];
    rede[2][8] += rede[2][2];
    Matriz.imprimirMatriz(rede, 6, 9);
    
    System.out.println("q0 -> t0 -> p1 -> t1 -> p3");
    System.out.println("         -> p2");
    rede[1][8] -= rede[1][1];
    rede[3][8] += rede[3][3];
    Matriz.imprimirMatriz(rede, 6, 9);
    
    System.out.println("q0 -> t0 -> p1 -> t1 -> p3");
    System.out.println("         -> p2 -> t2 -> p4");
    rede[2][8] -= rede[2][2];
    rede[4][8] += rede[4][3];
    Matriz.imprimirMatriz(rede, 6, 9);
    
    System.out.println("q0 -> t0 -> p1 -> t1 -> p3 -> t3 -> p5");
    System.out.println("         -> p2 -> t2 -> p4 -> t3 -> p5");
    rede[3][8] -= rede[3][3];
    rede[4][8] -= rede[4][3];
    rede[5][8] += rede[5][7];
    Matriz.imprimirMatriz(rede, 6, 9);

  }
}
