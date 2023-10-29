import java.util.Scanner;
class Dcoder
 {
   public static void main(String args[])
   { 
     String nama, nim, makul;
     int pilihan, biner, desimal, hasil, digit;
     double presensi, tugas, uas, rata;
     Scanner scanner = new Scanner (System.in);
     while (true) {
       System.out.println("Menu :\n1. Konversi Bilangan\n2. Hitung Nilai Mahasiswa\n3. Keluar");
       System.out.print("Masukkan pilihan : ");
       pilihan = scanner.nextInt();
       scanner.nextLine();
       if (pilihan == 1){
         while (true){ 
           System.out.println("Menu :\n1. Biner ke Desimal \n2. Desimal ke Biner \n3. Keluar");
           System.out.print("Masukkan Pilihan : ");
           pilihan = scanner.nextInt();
           if (pilihan == 1){
             desimal = 0;
             hasil = 1;
             System.out.print("Input angka biner: ");
             biner = scanner.nextInt();
             System.out.print("Angka desimal dari biner "+ biner+" ");
             while(biner!=0) {
               digit = biner % 10;
               desimal = desimal + (digit*hasil);
               hasil = hasil*2;
               biner = biner/10;
             }
             System.out.println("Hasil Biner Adalah " + desimal);
           }else if (pilihan == 2){
             int[] arr = new int[32];
             int nilai, i;
     
             System.out.print("Input angka desimal: ");
             nilai = scanner.nextInt();
      
             for(i=0; nilai>0; i++){
               arr[i] = nilai%2;
               nilai = nilai/2;
             } 
             System.out.print("Angka binernya adalah: ");
     
             for(i=i-1 ;i>=0 ;i--) {
               System.out.print(arr[i]);
             }
             System.out.println();
           }else if (pilihan == 3){
             break;
           }else{
             System.out.println("Pilihan tidak valid");
           }
         }
       }else if (pilihan == 2){
         System.out.println("Menghitung Nilai Mahasiswa");
         System.out.print("Masukkan Nama : ");
         nama = scanner.nextLine();
         System.out.print("Masukkan NIM : ");
         nim = scanner.nextLine();
         System.out.print("Masukkan Mata Kuliah : ");
         makul = scanner.nextLine();
         System.out.print("Masukkan Nilai Presensi : ");
         presensi = scanner.nextDouble();
         System.out.print("Masukkan Nilai Tugas : ");
         tugas = scanner.nextDouble();
         System.out.print("Masukkan Nilai UAS : ");
         uas = scanner.nextDouble();
         rata = (0.3 * presensi) + (0.3 * tugas) + (0.4 * uas);
         System.out.println("Nilai " + makul + " :\nNama : "+ nama + "\nNIM : " + nim + "\nNilai : " + rata);
       }else if(pilihan == 3){
         break;
       }else{
         System.out.println("Pilihan tidak valid");
       }
     }
   } 
 }
