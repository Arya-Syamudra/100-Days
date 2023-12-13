import java.util.Scanner;

class Dcoder
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah baju yang dibeli: ");
    int jumlah_baju = input.nextInt();
    int[] nilai = new int[jumlah_baju];

    for (int i = 0; i < jumlah_baju; i++) {
      input.nextLine(); // Membersihkan newline
      System.out.print("Masukkan nama baju: ");
      String nama_baju = input.nextLine();
      System.out.print("Masukkan harga baju: Rp.");
      int harga_baju = input.nextInt();
      nilai[i] = harga_baju;
    }

    int total_pembelian = 0;
    for (int value : nilai) {
      total_pembelian += value;
    }

    double kena_ppn = 0.02 * total_pembelian;

    if (jumlah_baju >= 3) {
      double potongan_harga = (total_pembelian + kena_ppn) * 0.1;
      double total_pembelian_bersih = total_pembelian - potongan_harga;
      System.out.println("Total harga yang dibayar setelah diskon: " + total_pembelian_bersih);
      System.out.println("Anda mendapatkan bonus baju.");
    } else {
      double total_pembelian_bersih = total_pembelian + kena_ppn;
      System.out.println("Jumlah total harga yang harus dibayar: " + total_pembelian_bersih);
      System.out.println("Maaf, Anda tidak dapat bonus.");
    }
  }
}
