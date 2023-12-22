import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        boolean mesinNyala = true;
        while(mesinNyala){
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Masukkan Jarak Hambatan di Bagian Depan : ");
            int jarakDepan = scanner.nextInt();
            
            System.out.print("Masukkan Jarak Hambatan di Bagian Kanan : ");
            int jarakKanan = scanner.nextInt();
            
            System.out.print("Masukkan Jarak Hambatan di Bagian Kiri : ");
            int jarakKiri = scanner.nextInt();
            
            int jarakMinimal = 30;
            
            if (jarakDepan <= jarakMinimal && jarakKanan <= jarakMinimal && jarakKiri <= jarakMinimal){
                System.out.println("Mundur");
            } else if (jarakDepan <= jarakMinimal && jarakKiri <= jarakMinimal){
                System.out.println("Belok Kanan");
            } else if (jarakDepan <= jarakMinimal && jarakKanan <= jarakMinimal){
                System.out.println("Belok Kiri");
            } else if (jarakDepan <= jarakMinimal){
                System.out.println("Belok Kiri");
            } else {
                System.out.println("Maju");
            }
            System.out.println("=============================");
        }
    }
}