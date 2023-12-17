import java.util.HashMap;
import java.util.Scanner;

class Dcoder {
  public static void main(String[] args) {
    System.out.println("Selamat Datang di Kalkulator IPK");
    HashMap<String, Double> point = new HashMap<>();
    point.put("A+", 4.0);
    point.put("A", 4.0);
    point.put("A-", 3.67);
    point.put("B+", 3.33);
    point.put("B", 3.0);
    point.put("B-", 2.67);
    point.put("C+", 2.33);
    point.put("C", 2.0);
    point.put("D+", 1.33);
    point.put("D", 1.0);

    Scanner input = new Scanner(System.in);
    int numCourses = 0;
    double totalPoint = 0;
    boolean done = false;

    while (!done) {
      System.out.print("Masukkan Nilai Angka : ");
      String grade = input.nextLine();

      if (grade.equals("")) {
        done = true;
      } else if (!point.containsKey(grade)) {
        System.out.println("Nilai " + grade + " tidak dikenal.");
      } else {
        numCourses++;
        totalPoint += point.get(grade);
      }

      if (numCourses > 0) {
        System.out.printf("IPK Anda adalah %.2f%n", (totalPoint / numCourses));
      }
    }
  }
}
