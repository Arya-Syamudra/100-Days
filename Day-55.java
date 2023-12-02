import java.util.Scanner;
class Dcoder
{
  public static void main(String args[])
  { 
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Batas Nilai : ");
    int batas = input.nextInt();
    
    int[] ganjil = new int[0];
    int index = 0;
    
    for (int i= 0; i < batas; i++) {
      if (i % 2 != 0){
        int[] arrayBaru = new int[ganjil.length+1];
        for (int j = 0; j < ganjil.length; j++){
          arrayBaru[j] = ganjil[j];
        }
        ganjil = arrayBaru;
        ganjil[index] = i;
        index++;
      }
    }
    System.out.println("Bilangan Ganjil Antara 0 Sampai " + batas + " Adalah ");
    for (int i = 0; i < ganjil.length; i++){
      System.out.print(ganjil[i]);
      if (i < ganjil.length-1){
        System.out.print(", ");
      }
    }
  }
}