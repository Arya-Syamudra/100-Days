class Dcoder
 {
   public static void main(String args[])
   { 
     String namaLengkap, namaPanggilan;
     namaLengkap = "Arya Syamudra";
     namaPanggilan = namaLengkap.substring(0, 3);
     System.out.println(namaPanggilan);
     
     for (int x = 0; namaLengkap.length() > x; x++){
       System.out.println(namaLengkap.charAt(x));
     }
   }
 }
