import java.util.Random;
class Dcoder
{
  public static void main(String args[])
  {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    Random random = new Random();
    int acak = random.nextInt(characters.length());
        
    char hurufAcak = characters.charAt(acak);
    System.out.println("Huruf acak: " + hurufAcak);
  }
}