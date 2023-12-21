import java.util.Scanner;
class Dcoder
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan lebar segitiga : ");
    double alas = input.nextDouble();
    System.out.print("Masukkan tinggi segitiga : ");
    double tinggi = input.nextDouble();
    double luas = luasSegitiga(alas, tinggi);
    System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah: " + luas);
  }
    public static double luasSegitiga(double alas, double tinggi) {
    return 0.5 * alas * tinggi;
  }
}