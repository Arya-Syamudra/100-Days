import java.util.*;

class Dcoder {
  public static void main(String args[]) { 
    int[] array = {5, 3, 0, 2, 4, 1, 0, 5, 2, 3, 1, 4}; 
    boolean terurut = false;
    Random gen = new Random();

    while (!terurut) {
      terurut = true; // Set to true initially

      for (int i = 1; i < array.length; i++) {
        if (array[i] < array[i - 1]) {
          terurut = false;
          break; // Break out if out of order element found
        }
      }

      if (!terurut) { // Only shuffle if not sorted
        for (int i = 0; i < array.length; i++) {  
          int randomPosition = gen.nextInt(array.length);  
          int temp = array[i];  
          array[i] = array[randomPosition];  
          array[randomPosition] = temp;  
        }
      }
    }

    for (int x = 0; x < array.length; x++) {
      System.out.print(array[x]);
    }
  }
}
