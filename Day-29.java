import java.util.Scanner;
class Dcoder
 {
   public static void main(String args[])
   { 
     int jumlahMhs, x;
     Scanner scanner = new Scanner(System.in);
     System.out.print("Masukkan Jumlah Mahasiswa : ");
     jumlahMhs = scanner.nextInt();
     String[] namaMhs = new String[jumlahMhs];
     scanner.nextLine();
     for (x = 0; jumlahMhs > x; x++){
       System.out.print("Nama Mahasiswa ke-" + (x + 1) +" : ");
       namaMhs[x] = scanner.nextLine();
     }
     System.out.println("Daftar Nama Mahasiswa :");
     for (x = 0; jumlahMhs > x; x++){
       System.out.println((x + 1) + ". " + namaMhs[x]);
     }
   }
 }
