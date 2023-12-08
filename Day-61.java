import java.util.ArrayList;
class Dcoder {
  public static void main(String args[]) {
    int[] data = {2, 4, 0, 9, 2, 0, 0, 3};
    ArrayList<Integer> unik = new ArrayList<>();

    for (int i = 0; i < data.length; i++) {
      if (!unik.contains(data[i])) {
        unik.add(data[i]);
      }
    }
    System.out.println("Jumlah elemen unik dalam array: " + unik.size());
  }
}
