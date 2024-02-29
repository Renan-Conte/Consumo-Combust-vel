
import java.util.Scanner;

public class combustivel {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Informe a quantidade de litros de combustível consumido:");
     double litros = scanner.nextDouble();

     System.out.println("Informe a distância percorrida em quilômetros: ");
     double distância = scanner.nextDouble();

     double consumo = distância / litros;

     System.out.println("O consumo de combustível é de " + consumo + "km/1");
  }
}
