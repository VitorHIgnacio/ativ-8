import java.util.*;
class Main {
  public static void main(String[] args) {
    //variaveis
    Scanner leitor = new Scanner(System.in);
    int numeroAntecessor =0;
    int numeroSucessor =0;
    int numero;
    //entrada
    System.out.print("Digite o número.");
    numero= leitor.nextInt();
    
    numeroAntecessor=numero-1;
    numeroSucessor=numero+1;
    //saida
    System.out.print("O número sucessor é "+numeroSucessor);
    System.out.print(" e o número antecessor é "+numeroAntecessor);

  }
}