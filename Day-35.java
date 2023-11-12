import java.util.Scanner;
import java.util.ArrayList;
class Dcoder
 {
   public static void main(String args[])
   { 
     int awal, akhir, jumlah, total, x;
     Scanner scanner = new Scanner(System.in);
     System.out.println("Penjumlahan Bilangan Ganjil");
     while (true){
       System.out.print("Masukkan Nilai Awal : ");
       awal = scanner.nextInt();
       System.out.print("Masukkan Nilai Akhir : ");
       akhir = scanner.nextInt();
       jumlah = akhir - awal;
       total = 0;
       ArrayList<Integer> ganjil = new ArrayList<Integer>();
       for (x = 0; x < jumlah + 1; x++){
         if (awal % 2 != 0) {
           ganjil.add(awal);
           total += awal;
         }
         awal++;
       }
       System.out.println(ganjil);
       System.out.println(total);
     }
   }
 }
