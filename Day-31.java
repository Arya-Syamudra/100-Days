class Dcoder
 {
   public static void main(String args[])
   { 
     StringBuffer buffer = new StringBuffer("Arya");
     buffer.append(" Syamudra");
     System.out.println(buffer.toString()); 

     StringBuilder builder = new StringBuilder("Zoro");
     builder.insert(0, "Roronoa ");
     System.out.println(builder.toString());
   }
 }
