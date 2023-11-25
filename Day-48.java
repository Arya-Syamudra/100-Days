class Dcoder
 {
   public static void main(String args[])
   { 
     int[] data = {2,4,1,1,2,0,2,3};
     for (int x = 0; x < data.length; x++){
       int min = x;
       for (int y = x; y < data.length; y++){
         if (data[y] < data[min]){
           min = y;
         }
       }
       int temp = data[x];
       data[x] = data[min];
       data[min] = temp;
     }
     for (int x = 0; x < data.length; x++){
       System.out.print(data[x]);
       if (x < data.length - 1){
         System.out.print(", ");
       }
     }
   }
 }
