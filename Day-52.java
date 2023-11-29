import java.util.Scanner;

class Dcoder
{
  public static void main(String[] args) {
    Object[][] barang = new Object[5][2];
    Scanner scanner = new Scanner(System.in);
    for (int x = 0; x < barang.length; x++){
      System.out.print("Masukkan Nama Barang : ");
      String namaBarang = scanner.nextLine();
      barang[x][0] = namaBarang;
      System.out.print("Masukkan Harga " + namaBarang + " : ");
      int hargaBarang = scanner.nextInt();
      barang[x][1] = hargaBarang;
      scanner.nextLine();
    }
    

    System.out.println("+-----+---------------------+---------------------+");
    System.out.println("| No  | Nama Barang         | Harga               |");
    System.out.println("+-----+---------------------+---------------------+");

    for (int x = 0; x < barang.length; x++) {
      System.out.printf("| %-3s | %-19s | Rp. %-15s |\n", x+1, barang[x][0], barang[x][1]);
    }

    System.out.println("+-----+---------------------+---------------------+");
  }
 }
