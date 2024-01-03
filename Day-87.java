import java.util.Scanner;
class Dcoder
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    String cuacaPanas, tanahKering;
    System.out.print("Apakah Cuaca Sedang Panas? (ya/tidak) : ");
    cuacaPanas = scanner.nextLine();
    System.out.print("Apakah Tanah Kering? (ya/tidak) : ");
    tanahKering = scanner.nextLine();
    if (cuacaPanas.equalsIgnoreCase("ya") || tanahKering.equalsIgnoreCase("ya")){
      System.out.println("Silahkan Siram Tanaman");
    } else {
      System.out.println("Tanaman Belum Membutuhkan Air");
    }
  }
}
