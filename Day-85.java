import java.util.ArrayList;

public class KelompokBilanganTanpaMethod {
  public static void main(String[] args) {
    ArrayList<Integer> bilangan = new ArrayList<>();
    bilangan.add(5);
    bilangan.add(12);
    bilangan.add(7);
    bilangan.add(8);
    bilangan.add(20);
    bilangan.add(3);

    ArrayList<Integer> genap = new ArrayList<>();
    ArrayList<Integer> ganjil = new ArrayList<>();

    for (int x = 0; x < bilangan.size(); x++) {
      int nilai = bilangan.get(x);
      if (nilai % 2 == 0) {
        genap.add(nilai);
      } else {
        ganjil.add(nilai);
      }
    }

    System.out.println("Bilangan Genap:");
    for (int x = 0; x < genap.size(); x++) {
      System.out.print(genap.get(x) + " ");
    }
    System.out.println();

    System.out.println("Bilangan Ganjil:");
    for (int x = 0; x < ganjil.size(); x++) {
      System.out.print(ganjil.get(x) + " ");
    }
    System.out.println();
  }
}
