import java.util.Scanner;

class Dcoder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan harga barang: ");
    double hargaBarang = input.nextDouble();

    double diskon = 0;

    if (hargaBarang >= 100000) {
      diskon = 0.1;
    }

    double jumlahDiskon = hargaBarang * diskon;
    double hargaSetelahDiskon = hargaBarang - jumlahDiskon;

    if (diskon > 0) {
      System.out.println("Anda mendapatkan diskon " + (diskon * 100) + "%");
      System.out.println("Jumlah diskon: " + jumlahDiskon);
      System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);
    } else {
      System.out.println("Maaf, tidak ada diskon untuk harga barang ini.");
      System.out.println("Harga yang harus dibayar: " + hargaBarang);
    }
  }
}
