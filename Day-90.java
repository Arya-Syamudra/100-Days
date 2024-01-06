import java.util.ArrayList;
import java.util.Scanner;

class Dcoder {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> tugas = new ArrayList<>();
    
    while (true) {
      System.out.println("======================");
      
      System.out.println("1. Tambah Tugas \n2. Tampilkan Tugas\n3. Hapus Tugas.");
      System.out.print("Masukkan Pilihan Anda : ");
      int pilihan = scanner.nextInt();
      scanner.nextLine();
      
      switch(pilihan) {
        case 1:
          System.out.print("Masukkan Tugas Anda : ");
          String input = scanner.nextLine();
          tugas.add(input);
          break;
        case 2:
          System.out.println("Daftar Tugas:");
          for (int i = 0; i < tugas.size(); i++) {
            System.out.println((i + 1) + ". " + tugas.get(i));
          }
          break;
        case 3:
          System.out.print("Masukkan nomor tugas yang akan dihapus : ");
          int nomorTugas = scanner.nextInt();
          scanner.nextLine();
          if (nomorTugas >= 1 && nomorTugas <= tugas.size()) {
            tugas.remove(nomorTugas - 1);
            System.out.println("Tugas berhasil dihapus.");
          } else {
            System.out.println("Nomor tugas tidak valid.");
          }
          break;
        default:
          System.out.println("Pilihan tidak valid.");
          break;
      }
    }
  }
}
