class Dcoder
{
  public static void main(String args[])
  { 
    System.out.println(jumlah(1, 2, 3));
    System.out.println(jumlah(1, 2, 3, 4, 5));
  }
  static int jumlah (int... a){
    int total = 0;
    for (int nilai : a){
      total += nilai;
    }
    return total;
  }
}