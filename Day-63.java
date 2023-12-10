class Dcoder {
  public static void main(String[] args) {
    int[] data = {2, 4, 6, 8, 10};
    int hasil = 1;

    for (int i = 0; i < data.length; i++) {
      hasil *= data[i];
    }

    System.out.println("Hasil perkalian semua elemen dalam array: " + hasil);
  }
}
