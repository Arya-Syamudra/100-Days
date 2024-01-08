class Dcoder
{
  public static void main(String args[])
  { 
    bio("Arya Syamudra");
    bio("Jojo", "Mars");
  }
  static void bio (String nama){
    System.out.println("Nama : " + nama);
  }
  static void bio (String nama, String alamat){
    System.out.println("Nama : " + nama);
    System.out.println("Alamat : " + alamat);
  }
}