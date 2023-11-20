import java.util.Scanner;
class Dcoder
{
   public static void main(String args[])
   { 
     int[] data = new int[5];
     arr(data);
     for(int x = 0; x < data.length; x++){
       System.out.print(data[x]);
       if(x < data.length - 1){
         System.out.print(" + ");
       }
     }
     System.out.println(" = " + jumlah(data));
   }
   public static int[] arr (int[] array){
     Scanner input = new Scanner(System.in);
     for (int x = 0; x < array.length; x++){
       System.out.print("Masukkan Nilai : ");
       int nilai = input.nextInt();
       array[x] = nilai;
     }
     return array;
   }
   public static int jumlah (int[] array){
     int jumlah = 0;
     for (int x = 0; x < array.length; x++){
       jumlah += array[x];
     }
     return jumlah;
   }
}
