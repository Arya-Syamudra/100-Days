import java.util.Scanner;

class Day7 {
    public static void main(String[] args) {
        System.out.println("Saya adalah Program yang bisa membaca pikiran");
      
        Scanner input = new Scanner(System.in);

        System.out.print("Ketik angka yang ada di pikiran Anda: ");
        String angka = input.nextLine();

        System.out.println("Anda memikirkan angka: " + angka);
    }
}
