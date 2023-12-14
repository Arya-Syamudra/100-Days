import java.util.Scanner;

public class Dcoder{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah elemen dalam array: ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Masukkan elemen-elemen array:");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    System.out.print("Masukkan elemen yang ingin dicari: ");
    int key = input.nextInt();

    boolean found = false;
    int index = -1;

    for (int i = 0; i < n; i++) {
      if (arr[i] == key) {
        found = true;
        index = i;
        break; // Berhenti setelah menemukan elemen
      }
    }

    if (found) {
      System.out.println("Elemen " + key + " ditemukan pada indeks ke-" + index);
    } else {
      System.out.println("Elemen " + key + " tidak ditemukan dalam array.");
    }
  }
}
