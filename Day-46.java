class Dcoder
 {
   public static void main(String args[])
   { 
     int[] data = {2,4,1,1,2,0,2,3};
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
       if (x < data.length - 1){
         System.out.print(", ");
       }
     }
   }
 }
