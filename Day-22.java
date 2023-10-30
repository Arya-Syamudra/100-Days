import java.util.Scanner;

class Dcoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double angka1, angka2, hasil;

        System.out.println("Kalkulator Sederhana:");
        System.out.println("Menu :");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = scanner.nextDouble();

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operasi tidak valid.");
                return;
        }
        System.out.println("Hasilnya adalah : " + hasil) ;
    }
}
