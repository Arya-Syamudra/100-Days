class Dcoder
 {
   public static void main(String args[])
   { 
     int[][] data = new int [3][2];
     int nilai = 1;
     for (int x = 0; x < data.length; x++){
        for (int y = 0; y < data[x].length; y++){
          data[x][y] = nilai;
          nilai++;
        }
     }
     for (int x = 0; x < data.length; x++){
        for (int y = 0; y < data[x].length; y++){
          System.out.print(data[x][y] + " ");
        }
        System.out.println();
     }   
   }
 }
