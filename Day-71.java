import java.util.Scanner;

class Dcoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tuliskan teks: ");
        String teks = scanner.nextLine().toLowerCase();

        int totalHurufVokal = 0;
        int[] counts = new int[5]; // Array untuk menyimpan jumlah masing-masing vokal

        for (int i = 0; i < teks.length(); i++) {
            char huruf = teks.charAt(i);
            switch (huruf) {
                case 'a':
                    counts[0]++;
                    totalHurufVokal++;
                    break;
                case 'i':
                    counts[1]++;
                    totalHurufVokal++;
                    break;
                case 'u':
                    counts[2]++;
                    totalHurufVokal++;
                    break;
                case 'e':
                    counts[3]++;
                    totalHurufVokal++;
                    break;
                case 'o':
                    counts[4]++;
                    totalHurufVokal++;
                    break;
            }
        }

        System.out.println("Total karakter: " + teks.length());
        System.out.println("Total huruf vokal: " + totalHurufVokal);
        System.out.println("a -> " + counts[0]);
        System.out.println("i -> " + counts[1]);
        System.out.println("u -> " + counts[2]);
        System.out.println("e -> " + counts[3]);
        System.out.println("o -> " + counts[4]);
    }
}
