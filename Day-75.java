import java.util.Scanner;

class Dcoder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan total pembelian: ");
    int totalPembelian = input.nextInt();

    int bonus = 0;

    if (totalPembelian >= 100) {
      bonus = 10;
    } else if (totalPembelian >= 50) {
      bonus = 5;
    } else {
      bonus = 0;
    }

    int totalAkhir = totalPembelian + bonus;
    System.out.println("Total pembelian setelah bonus: " + totalAkhir);
  }
}