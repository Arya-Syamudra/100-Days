class Dcoder
{
   public static void main(String args[])
   { 
     String[] nama = {"Ujang", "Asep", "Bambang", "Jono", "Jojo"};
     for(int x = 0; x < nama.length; x++){
       for (int y = x; y < nama.length; y++){
         if (nama[x].compareTo(nama[y]) > 0){
           String temp = nama[x];
           nama[x] = nama[y];
           nama[y] = temp;
         }
       }
     }
     for (String name : nama){
       System.out.println(name);
     }
   }
 }