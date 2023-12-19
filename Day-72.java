import java.util.ArrayList;
import java.util.Scanner;

public class Dcoder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah buku yang dibeli: ");
    int jumlah_buku = input.nextInt();
    ArrayList<Integer> nilai = new ArrayList<>();

    for (int i = 0; i < jumlah_buku; i++) {
      input.nextLine(); // Membersihkan newline
      System.out.print("Masukkan nama buku: ");
      String nama_buku = input.nextLine();

      System.out.print("Masukkan harga buku: Rp.");
      int harga_buku = input.nextInt();
      nilai.add(harga_buku);
    }

    int total_pembelian = 0;
    for (int value : nilai) {
      total_pembelian += value;
    }

    double kena_ppn = (2.0 / 100) * total_pembelian;
    double total_pembelian_bersih;

    if (jumlah_buku >= 3) {
      double potongan_harga = (total_pembelian + kena_ppn) * 10 / 100;
      total_pembelian_bersih = total_pembelian - potongan_harga;
      System.out.println("Total harga yang dibayar setelah diskon: " + total_pembelian_bersih);
      System.out.println("Anda mendapatkan bonus buku saku.");
    } else {
      total_pembelian_bersih = total_pembelian + kena_ppn;
      System.out.println("Jumlah total harga yang harus dibayar: " + total_pembelian_bersih);
      System.out.println("Maaf, Anda tidak mendapatkan bonus.");
    }
  }
}
