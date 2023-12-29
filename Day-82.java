import java.util.Scanner;

class Dcoder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan persentase baterai (0-100): ");
    int persentase = input.nextInt();

    if (persentase == 0) {
      System.out.println("Baterai kosong!");
    } else if (persentase <= 20) {
      System.out.println("Baterai rendah.");
    } else if (persentase <= 90) {
      System.out.println("Normal.");
    } else {
      System.out.println("Baterai penuh!");
    }
  }
}
