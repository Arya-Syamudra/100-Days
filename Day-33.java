import java.util.ArrayList;
class Dcoder
 {
   public static void main(String args[])
   { 
     ArrayList angkaGenap = new ArrayList();
     angkaGenap.add(2);
     angkaGenap.add(4);
     angkaGenap.add(5);
     angkaGenap.add(6);
     angkaGenap.add(7);
     angkaGenap.add(10);
     angkaGenap.remove(2);
     angkaGenap.set(3, 8);
     System.out.println(angkaGenap);
   }
 }
