class Dcoder{
  public static void main(String[] args) {
    int n = 5;
    int hasil = hitungJumlah(n);
    System.out.println("Jumlah dari 1 sampai " + n + " adalah " + hasil);
  }
  static int hitungJumlah(int n) {
    if (n == 1) {
      return 1;
    } else {
      System.out.println(n + hitungJumlah(n-1));
      return n + hitungJumlah(n - 1);
    }
  }
}
