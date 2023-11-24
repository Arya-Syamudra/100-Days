class Dcoder
 {
   public static void main(String args[])
   { 
     int[] data = {2,4,1,1,2,0,2,3};
     for (int x = 1; x < data.length; x++){
       for (int y = x; y >= 1 ; y--){
         if (data[y] > data[y - 1]){
           break;
         }
         int temp = data[y];
         data[y] = data[y - 1];
         data[y - 1] = temp;
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
