import java.util.Scanner;

class Dcoder {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int nilai = 0;
    
    while (true) {
      System.out.println("Nilai : " + nilai);
      System.out.println("1. Increment \n2. Decrement \n3. Keluar"); // Tambahkan opsi keluar
      System.out.print("Masukkan Pilihan : ");
      int pilihan = scanner.nextInt();

      switch (pilihan) {
        case 1:
          nilai++;
          break;
        case 2:
          nilai--;
          break;
        case 3:
          System.out.println("Keluar dari program...");
          System.exit(0);
        default:
          System.out.println("Pilihan tidak valid");
      }
    }
  }
}
