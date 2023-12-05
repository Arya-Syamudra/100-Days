import java.util.Scanner;
class Dcoder
{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Kalimat : ");
    String kalimat = input.nextLine();
    String[] kata = kalimat.split("\\s+");
    System.out.println("Jumlah kata dalam kalimat: " + kata.length);
  }
}