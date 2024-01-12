class Dcoder {
  public static void main(String[] args) {
    try {
      int nilai1 = 2;
      String nilai2 = "as";
      System.out.println(nilai1 * Integer.parseInt(nilai2));
    } catch (Exception e) {
      System.out.println("Maaf, terjadi kesalahan.");
    }
  }
}