import java.util.Scanner;

class Dcoder
{
   public static void main(String args[])
   { 
     String nama, input, konfirmasi;
     Scanner scanner = new Scanner (System.in);
     nama = "Ary";
     System.out.print("Siapa Panggilan Anda : ");
     input = scanner.nextLine();
     konfirmasi = (input.equals(nama)) ? "Selamat Datang Tuan" : "Pergilah Biadab";
     System.out.println(konfirmasi);
   }
}