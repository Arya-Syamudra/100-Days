import java.util.Scanner;

class Dcoder {
  public static void main(String[] args) {
    String[][] daftarProduk = new String[3][2]; // Contoh untuk 3 produk dengan nama dan harga

    Scanner scanner = new Scanner(System.in);

    daftarProduk[0][0] = "Produk 1";
    System.out.print("Masukkan Nama Produk 1: ");
    daftarProduk[0][1] = scanner.nextLine();

    daftarProduk[1][0] = "Produk 2";
    System.out.print("Masukkan Nama Produk 2: ");
    daftarProduk[1][1] = scanner.nextLine();

    daftarProduk[2][0] = "Produk 3";
    System.out.print("Masukkan Nama Produk 3: ");
    daftarProduk[2][1] = scanner.nextLine();

    System.out.println("Daftar Produk:");

    for (int i = 0; i < daftarProduk.length; i++) {
      System.out.println(daftarProduk[i][0] + ": " + daftarProduk[i][1]);
    }
  }
}
