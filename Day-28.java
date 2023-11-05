import java.util.Scanner;
class Dcoder
 {
   public static void main(String args[])
   {
     String pilihan;     
     int jumlah, harga = 500000, total, diskon;
     Scanner scanner = new Scanner (System.in);
     System.out.println("Toko Beras Jaya Makmur Abadi");
     do {
       System.out.print("Jumlah Beras Yang Dibeli (Karung) : ");
       jumlah = scanner.nextInt();
       scanner.nextLine();
       total = jumlah * harga;
       if (jumlah >= 300){
         diskon = total * 7/100;
       } else if (jumlah >= 150){
         diskon = total * 3/100;
       } else {
         diskon = 0;
       }
       total -= diskon;
       System.out.println("\nAnda Mendapatkan Diskon Sebesar Rp." + diskon + ". Harga Yang Harus Anda Bayar Adalah Rp." + total);
       System.out.print("\nIngin Lanjut? (y)");
       pilihan = scanner.nextLine();
     }while (pilihan != "y");
     System.out.println("Terima Kasih Telah Berbelanjan Disini");
   }
 }
