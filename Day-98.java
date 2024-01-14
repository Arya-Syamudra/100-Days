class Dcoder{
  public static void main(String[] args) {
    try {
      String data = null;
      System.out.println(data.length());
      System.out.println("Baris ini tidak akan tercetak.");
    } catch (NullPointerException e) {
      System.out.println("Terjadi NullPointerException: " + e.getMessage());
    } finally {
      System.out.println("Blok finally dijalankan.");
    }
  }
}