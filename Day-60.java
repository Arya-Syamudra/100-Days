import java.util.HashMap;
class Dcoder
{
  public static void main(String args[])
  { 
    HashMap<Character, Integer> romawiDesimal = new HashMap<>();
    romawiDesimal.put('I', 1);
    romawiDesimal.put('V', 5);
    romawiDesimal.put('X', 10);
    romawiDesimal.put('L', 50);
    romawiDesimal.put('C', 100);
    romawiDesimal.put('D', 500);
    romawiDesimal.put('M', 1000);
     
    String romawi = "MCMLIV"; // Masukkan angka Romawi di sini
    int desimal = 0;
    int nilaiSebelumnya = 0;
    for (int i = romawi.length() - 1; i >= 0; i--) {
      int nilaiSekarang = romawiDesimal.get(romawi.charAt(i));
      if (nilaiSekarang < nilaiSebelumnya) {
        desimal -= nilaiSekarang;
      } else {
        desimal += nilaiSekarang;
      }
      nilaiSebelumnya = nilaiSekarang;
    }
    System.out.println("Angka Desimal dari " + romawi + " adalah: " + desimal);
  }
}
