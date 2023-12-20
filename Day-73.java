import java.util.Scanner;

class Dcoder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Nama karyawan: ");
    String nama_karyawan = input.nextLine();

    System.out.print("Banyak anak: ");
    int banyak_anak = input.nextInt();

    System.out.print("Gaji pokok: ");
    int gaji_pokok = input.nextInt();

    double tunjangan_istri = 0.20 * gaji_pokok;
    double tunjangan_anak = 0.05 * gaji_pokok;
    double total_tunjangan = tunjangan_istri + tunjangan_anak;
    double gaji_kotor = gaji_pokok + total_tunjangan;
    double pajak = 0.10 * gaji_kotor;

    if (tunjangan_istri != gaji_pokok && tunjangan_anak != gaji_pokok) {
      System.out.println("Tunjangan istri: " + tunjangan_istri);
      System.out.println("Tunjangan anak: " + tunjangan_anak);
    }

    System.out.println("Total tunjangan: " + total_tunjangan);
    System.out.println("Gaji kotor: " + gaji_kotor);
    System.out.println("Pajak: " + pajak);
    System.out.println("Gaji bersih: " + (gaji_kotor - pajak));
  }
}
