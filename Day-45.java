import java.util.Scanner;
class Dcoder
 {
   public static void main(String args[])
   { 
     String[] buah = {"Durian", "Apel", "Anggur"};
     boolean tidakAda = true;
     Scanner sc = new Scanner (System.in);
     System.out.print("Apa yang anda cari : ");
     String cari = sc.nextLine();
     for (int x = 0; x < buah.length; x++){
       if (buah[x].equalsIgnoreCase(cari)){
         System.out.println("Buah" + buah[x] + " ada di rak nomor " + x);
         tidakAda = false;
       }
     }
     if (tidakAda){
       System.out.println("Buah "+ cari + " tidak ada di rak");
     }
   }
 }
