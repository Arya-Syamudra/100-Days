class Dcoder {
  public static void main(String[] args) {
    String kalimat = "Ini adalah contoh kalimat untuk menghitung jumlah huruf vokal.";
    kalimat = kalimat.toLowerCase();

    int jumlahVokal = 0;
    String vokal = "aeiou";

    for (int i = 0; i < kalimat.length(); i++) {
      char huruf = kalimat.charAt(i);
      if (vokal.contains(String.valueOf(huruf))) {
        jumlahVokal++;
      }
    }
    System.out.println("Jumlah huruf vokal dalam kalimat: " + jumlahVokal);
  }
}
