import java.util.*;
class Dcoder
{
  public static void main(String args[])
  { 
    int[] data = {2, 4, 0, 9, 2, 0, 0, 3};
    int maks = 0;
    for (int x = 0; x < data.length; x++){
      if (maks < data[x]){
        maks = data[x];
      }
    }
    System.out.println("Nilai Maksimal : " + maks);
  }
}