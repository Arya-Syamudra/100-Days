import java.util.ArrayList;
import java.util.Scanner;

class Dcoder {
  public static void main(String[] args) {
    ArrayList<String> namaPegawai = new ArrayList<>();
    ArrayList<Integer> idPegawai = new ArrayList<>();
    ArrayList<Double> gajiPegawai = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nMenu:");
      System.out.println("1. Tambah Pegawai");
      System.out.println("2. Hapus Pegawai");
      System.out.println("3. Tampilkan Data Pegawai");
      System.out.println("4. Keluar");

      System.out.print("Pilih menu: ");
      int pilihan = scanner.nextInt();

      switch (pilihan) {
        case 1:
          tambahPegawai(namaPegawai, idPegawai, gajiPegawai, scanner);
          break;
        case 2:
          hapusPegawai(namaPegawai, idPegawai, gajiPegawai, scanner);
          break;
        case 3:
          tampilkanDataPegawai(namaPegawai, idPegawai, gajiPegawai);
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

  public static void tambahPegawai(ArrayList<String> nama, ArrayList<Integer> id, ArrayList<Double> gaji, Scanner scanner) {
    System.out.print("Masukkan nama pegawai: ");
    String namaBaru = scanner.next();
    nama.add(namaBaru);

    System.out.print("Masukkan ID pegawai: ");
    int idBaru = scanner.nextInt();
    id.add(idBaru);

    System.out.print("Masukkan gaji pegawai: ");
    double gajiBaru = scanner.nextDouble();
    gaji.add(gajiBaru);

    System.out.println("Pegawai berhasil ditambahkan!");
  }

  public static void hapusPegawai(ArrayList<String> nama, ArrayList<Integer> id, ArrayList<Double> gaji, Scanner scanner) {
    System.out.print("Masukkan ID pegawai yang akan dihapus: ");
    int idHapus = scanner.nextInt();

    int index = id.indexOf(idHapus);
    if (index != -1) {
      nama.remove(index);
      id.remove(index);
      gaji.remove(index);
      System.out.println("Pegawai berhasil dihapus!");
    } else {
      System.out.println("Pegawai dengan ID tersebut tidak ditemukan.");
    }
  }

  public static void tampilkanDataPegawai(ArrayList<String> nama, ArrayList<Integer> id, ArrayList<Double> gaji) {
    System.out.println("\nData Pegawai:");
    for (int i = 0; i < nama.size(); i++) {
      System.out.println("Nama: " + nama.get(i) + " | ID: " + id.get(i) + " | Gaji: $" + gaji.get(i));
    }
  }
}
