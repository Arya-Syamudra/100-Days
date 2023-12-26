import java.util.Random;

class Dcoder
{
  public static void main(String[] args)
  {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    int length = 10;

    Random random = new Random();
    StringBuilder password = new StringBuilder();

    for (int i = 0; i < length; i++) {
      int index = random.nextInt(chars.length());
      password.append(chars.charAt(index));
    }

    System.out.println(password.toString());
  }
}
