import java.util.Queue;
import java.util.LinkedList;
class Dcoder
 {
   public static void main(String args[])
   { 
     Queue<String> antrian = new LinkedList<String>();
     System.out.println(antrian);
     antrian.offer("Jojo");
     antrian.offer("Joro");
     antrian.offer("Jono");
     System.out.println(antrian);
     antrian.poll();
     System.out.println(antrian);
     antrian.poll();
     System.out.println(antrian);
   }
 }