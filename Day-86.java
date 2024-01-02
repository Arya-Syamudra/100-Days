import java.util.Scanner;
class Dcoder
{
  public static void main(String args[])
  { 
    String anggota, pinjaman;
    Scanner scanner = new Scanner(System.in);
    while (true){
      System.out.print("Apakah Anda Memiliki Kartu Keanggotaan Perpustakaan? (ya/tidak) : ");
      anggota = scanner.nextLine();
      System.out.print("Apakah Anda Sudah Mengembalikan Buku Sebelumnya? (ya/tidak) : ");
      pinjaman = scanner.nextLine();
      if (anggota.equalsIgnoreCase("ya") && pinjaman.equalsIgnoreCase("ya")){
        System.out.println("Anda Bisa Meminjam Buku");
        break;
      } else if (anggota.equalsIgnoreCase("ya") && pinjaman.equalsIgnoreCase("tidak")){
        System.out.println("Silahkan Mengembalikan Buku Yang Anda Pinjam Sebelumnya");
        break;
      } else if (anggota.equalsIgnoreCase("tidak") && pinjaman.equalsIgnoreCase("ya")){
        System.out.println("Silahkan Mendaftar Keanggotaan Perpustakaan Terlebih Dahulu");
        break;
      } else if (anggota.equalsIgnoreCase("tidak") && pinjaman.equalsIgnoreCase("tidak")){
        System.out.println("Silahkan Mendaftar Keanggotan Perpustakaan dan Mengembalikan Buku Terlebih Dahulu");
        break;
      } else {
        System.out.println("Jawaban Tidak Valid");
      }
    }
  }
}