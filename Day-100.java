import java.util.ArrayList;
import java.util.Scanner;

class Dcoder {
  public static void main(String[] args) {
    ArrayList<String> daftarTugas = new ArrayList<>();
    ArrayList<String> statusTugas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nMenu:");
      System.out.println("1. Tambah Tugas");
      System.out.println("2. Tandai Tugas Selesai");
      System.out.println("3. Tampilkan Daftar Tugas");
      System.out.println("4. Keluar");

      System.out.print("Pilih menu: ");
      int pilihan = scanner.nextInt();

      switch (pilihan) {
        case 1:
          tambahTugas(daftarTugas, statusTugas, scanner);
          break;
        case 2:
          tandaiTugas(daftarTugas, statusTugas, scanner);
          break;
        case 3:
          tampilkanTugas(daftarTugas, statusTugas);
          break;
        case 4:
          System.out.println("Terima kasih!");
          scanner.close();
          System.exit(0);
        default:
          System.out.println("Pilihan tidak valid.");
      }
    }
  }

  public static void tambahTugas(ArrayList<String> daftarTugas, ArrayList<String> statusTugas, Scanner scanner) {
    System.out.print("Masukkan nama tugas: ");
    String tugasBaru = scanner.next();
    daftarTugas.add(tugasBaru);
    statusTugas.add("Belum Selesai");

    System.out.println("Tugas berhasil ditambahkan!");
  }

  public static void tandaiTugas(ArrayList<String> daftarTugas, ArrayList<String> statusTugas, Scanner scanner) {
    tampilkanTugas(daftarTugas, statusTugas);

    System.out.print("Pilih nomor tugas yang selesai: ");
    int nomorTugas = scanner.nextInt();

    if (nomorTugas >= 1 && nomorTugas <= daftarTugas.size()) {
      int index = nomorTugas - 1;
      statusTugas.set(index, "Selesai");
      System.out.println("Tugas berhasil ditandai selesai!");
    } else {
      System.out.println("Nomor tugas tidak valid.");
    }
  }

  public static void tampilkanTugas(ArrayList<String> daftarTugas, ArrayList<String> statusTugas) {
    System.out.println("\nDaftar Tugas:");
    for (int i = 0; i < daftarTugas.size(); i++) {
      System.out.println((i + 1) + ". Tugas: " + daftarTugas.get(i) + " | Status: " + statusTugas.get(i));
    }
  }
}
