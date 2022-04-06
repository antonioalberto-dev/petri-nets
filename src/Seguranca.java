import utils.Matriz;

public class Seguranca {
  public static void main(String[] args) {
    int[][] rede = {
        { 1, 0, 0, 0, 0, 0, 0, 1, 1 },
        { 0, 1, 0, 0, 1, 0, 0, 0, 0 },
        { 0, 0, 1, 0, 1, 0, 0, 0, 0 },
        { 0, 1, 0, 0, 0, 0, 1, 0, 0 },
        { 1, 0, 1, 0, 0, 1, 0, 0, 1 },
        { 0, 0, 0, 1, 0, 1, 0, 0, 0 }
    };
    
    System.out.println("Rede de Petri - Inicial");
    System.out.println("p0 -> t0");
    Matriz.imprimirMatriz(rede, 6, 9);
    
    System.out.println("p0 -> t0 -> p1");
    System.out.println("         -> p2");
    rede[0][8] -= rede[0][0];
    rede[1][8] += rede[1][1];
    rede[2][8] += rede[2][2];
    Matriz.imprimirMatriz(rede, 6, 9);
    
    System.out.println("p0 -> t0 -> p1 -> t1");
    System.out.println("         -> p2 -> t2 -> p3 -> t3");
    // rede[1][8] -= rede[1][1];
    rede[2][8] -= rede[2][2];
    rede[4][8] -= rede[4][0];
    Matriz.imprimirMatriz(rede, 6, 9);
    
    System.out.println("p0 -> t0 -> p1 -------------> t1 -> p5");
    System.out.println("         -> p2 -> t2 -> p3 -> t1 -> p5");
    rede[1][8] -= rede[2][2];
    rede[4][8] += rede[4][5];
    rede[5][8] += rede[5][5];
    Matriz.imprimirMatriz(rede, 6, 9);
    
    System.out.println("p0 -> t0");
    rede[5][8] -= rede[5][5];
    rede[0][8] += rede[0][0];
    Matriz.imprimirMatriz(rede, 6, 9);
    
  }
}
