import java.util.Scanner;

public class Dcoder{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan waktu dalam format 12 jam (hh:mm am/pm): ");
    String waktu12Jam = input.nextLine();

    int jam = Integer.parseInt(waktu12Jam.substring(0, 2));
    int menit = Integer.parseInt(waktu12Jam.substring(3, 5));
    String ampm = waktu12Jam.substring(6).toLowerCase();

    if (ampm.equals("pm") && jam != 12) {
      jam += 12;
    } else if (ampm.equals("am") && jam == 12) {
      jam = 0;
    }

    String waktu24Jam = String.format("%02d:%02d", jam, menit);
    System.out.println("Waktu dalam format 24 jam: " + waktu24Jam);
  }
}
