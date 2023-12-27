import java.util.Scanner;
class Dcoder
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Siapakah Penemu Listrik? \na. Arya Syamudra \nb.Ary \nc. Jojo \nd. Salah Semua");
    System.out.print("Masukkan Jawaban Anda : ");
    String jawaban = input.nextLine();
    if (jawaban.equals("a") || jawaban.equals ("b") || jawaban.equals ("c")){
      salah();
    } else if (jawaban.equals("d")) {
      benar();
    } else {
      tidakValid();
    }
  }
  static void benar() {
    System.out.println("Jawaban Anda Benar!!!");
  }
  static void salah(){
    System.out.println("Jawaban Anda Salah!!! ");
  }
  static void tidakValid() {
    System.out.println("Jawaban Anda Tidak Valid");
  }
}
