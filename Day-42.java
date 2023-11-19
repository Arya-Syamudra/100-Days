class Dcoder
 {
   public static void main(String args[])
   { 
        int[] array = new int[5];

        for (int i= 0; i < 7; i++) {
            if (i >= array.length){
                int[] arrayBaru = new int[array.length+1];
                for (int x = 0; x < array.length; x++){
                  arrayBaru[x] = array[x];
                }
                array = arrayBaru;
            }
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}