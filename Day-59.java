class Dcoder
{
  public static void main(String args[])
  { 
    double median;
    int[] data = {2, 4, 0, 9, 2, 0, 0, 3};
    for (int x = 0; x < data.length; x++){
      for (int y = x; y < data.length; y++){
        if (data[x] > data[y]){
          int temp = data[x];
          data[x] = data[y];
          data[y] = temp;
        }
      }
    }
    for (int x = 0; x < data.length; x++){
      System.out.print(data[x]);
      if (x < data.length-1){
        System.out.print(", ");
      }
    }
    System.out.println();
    if (data.length % 2 == 0){
      median = (data[data.length/ 2 - 1] + data[data.length/ 2]) / 2.0;
    } else {
      median = data[data.length / 2];
    }
    System.out.println("Median : " + median);
  }
}