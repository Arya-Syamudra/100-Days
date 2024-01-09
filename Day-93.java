class Dcoder {
  public static void main(String[] args) {
    int hasil = kaliTambah(2, 3);
    System.out.println("Hasil operasi: " + hasil);
  }

  static int kaliTambah(int a, int b) {
    int hasilKali = kali(a, b);
    int hasilTambah = tambah(a, b);
    return hasilKali + hasilTambah;
  }

  static int kali(int a, int b) {
    return a * b;
  }

  static int tambah(int a, int b) {
    return a + b;
  }
}