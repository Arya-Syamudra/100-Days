import java.util.ArrayList;
import java.util.Scanner;
class Dcoder
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> nilai = new ArrayList<>();
    
    System.out.print("Masukkan Jumlah Nilai : ");
    int jumlah = input.nextInt();
    for (int x = 1; x <= jumlah; x++){
      System.out.print("Masukkan Nilai ke-" + x + " : ");
      int angka = input.nextInt();
      nilai.add(angka);
    }
    
    for (int x = 0; x < nilai.size(); x++){
      for (int y = 0; y < nilai.size(); y++){
        if (nilai.get(x) < nilai.get(y)){
          int temp = nilai.get(x);
          nilai.set(x, nilai.get(y));
          nilai.set(y, temp);
        }
      }
    }
    int nilaiMinimal = nilai.get(0);
    
    double median;
    if (nilai.size() % 2 == 0) {
      median = (double) (nilai.get(nilai.size() / 2 - 1) + nilai.get(nilai.size() / 2)) / 2;
    } else {
      median = nilai.get(nilai.size()/ 2);
    }
    
    int nilaiMaksimal = nilai.get(nilai.size()-1);
    
    System.out.println("Nilai Minimal : " + nilaiMinimal);
    System.out.println("Nilai Median : " + median);
    System.out.println("Nilai Maksimal : " + nilaiMaksimal);
  }
}