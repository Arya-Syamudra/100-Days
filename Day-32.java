import java.util.Scanner;
class Dcoder
 {
   public static void header(){
     System.out.println("Selamat Datang di Program Tebak Umur!");
   }
   public static void hasil(String nama, int usia){
     System.out.println("Hai " + nama + ", Saya tebak anda berusia " + usia + " tahun.");
   }
   public static int usia(int tahunSekarang, int tahunLahir){
     return tahunSekarang - tahunLahir;
   }
   public static void main(String args[])
   { 
     header();
     String nama;
     int tahunLahir, tahunSekarang, usia;
     Scanner scanner = new Scanner(System.in);
     System.out.print("Siapa Nama Anda : ");
     nama =  scanner.nextLine();
     System.out.print("Tahun Berapa Anda Lahir : ");
     tahunLahir = scanner.nextInt();
     tahunSekarang = 2023;
     usia = usia(tahunSekarang, tahunLahir);
     hasil(nama, usia);
   }
 }
