import java.util.Random;
class Dcoder
{
  public static void main(String args[])
  { 
    Random dadu = new Random();
    int dadu1 = dadu.nextInt(6);
    int dadu2 = dadu.nextInt(6);
    
    System.out.println("Anda mendapat angka " + dadu1 + " dan " + dadu2);
  }
}
