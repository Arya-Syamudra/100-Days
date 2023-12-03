import java.util.Scanner;
class Dcoder
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan batas nilai untuk deret Fibonacci: ");
    int batas = scanner.nextInt();
    
    int a = 0, b = 1;
    System.out.println("Deret Fibonacci hingga batas nilai " + batas + " adalah:");
    System.out.print(a + " " + b + " ");

    int c;
    while (true) {
      c = a + b;
      if (c > batas)
        break;
      System.out.print(c + " ");
      a = b;
      b = c;
    }
  }
}