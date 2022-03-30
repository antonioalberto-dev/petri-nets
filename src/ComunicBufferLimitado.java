import utils.Matriz;

public class ComunicBufferLimitado {
  public static void main(String[] args) {
    int[][] rede = {
        { 1, 0, 0, 0, 5 },
        { 0, 1, 0, 0, 4 },
        { 0, 0, 1, 0, 0 },
        { 0, 0, 0, 1, 0 },
        { 1, 0, 0, 1, 3 },
        { 0, 1, 1, 0, 0 } };

    System.out.println("Rede de Petri - Inicial");
    System.out.println("p0 -> t0");
    System.out.println("p4 -> t0");
    Matriz.imprimirMatriz(rede, 6, 5);
    
    System.out.println("p0 -> t0 -> p2");
    System.out.println("p4 -> t0 -> p5");
    Matriz.imprimirMatriz(rede, 6, 5);
    
    System.out.println("p0 -> t0 -> p2");
    System.out.println("p4 -> t0 -> p5 -> t1");
    System.out.println("p1 -> t1");
    Matriz.imprimirMatriz(rede, 6, 5);



  }
}
