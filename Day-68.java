import java.util.Scanner;

class Dcoder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan panjang tanah (meter): ");
    int panjang = scanner.nextInt();

    System.out.print("Masukkan lebar tanah (meter): ");
    int lebar = scanner.nextInt();

    int luasTanah = panjang * lebar;

    int hargaPerMeter = 100000;
    int totalHarga = luasTanah * hargaPerMeter;

    System.out.println("Luas tanah: " + luasTanah + " meter persegi");
    System.out.println("Total harga tanah adalah: " + totalHarga);
  }
}
