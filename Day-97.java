class Dcoder {
  public static void main(String[] args) {
    int hasil = tambah(3, kali(2, 4));
    System.out.println("Hasil: " + hasil);
  }

  static int tambah(int a, int b) {
    return a + b;
  }

  static int kali(int a, int b) {
    return a * b;
  }
}
