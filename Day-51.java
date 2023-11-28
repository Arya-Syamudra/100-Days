public class PrintSimpleTableFromArray {
  public static void main(String[] args) {
    String[][] tableData = {
      {"Joro", "Laki-Laki", "Bumi"},
      {"Jojo", "Laki-Laki", "Mars"}
    };

    System.out.println("+----------+---------------------+----------+");
    System.out.println("| Nama     | Jenis Kelamin       | Asal     |");
    System.out.println("+----------+---------------------+----------+");

    for (int x = 0; x < tableData.length; x++) {
      System.out.printf("| %-8s | %-19s | %-8s |\n", tableData[x][0], tableData[x][1], tableData[x][2]);
    }

    System.out.println("+----------+---------------------+----------+");
  }
}
