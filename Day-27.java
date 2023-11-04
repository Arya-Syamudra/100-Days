import java.util.Scanner;
class Dcoder
{
   public static void main(String args[])
   {
     String simbol1, simbol2;
     int pilihan;
     double suhuAwal, suhuAkhir;
     Scanner scanner = new Scanner (System.in);
     System.out.println("Program Konversi Suhu");
     do {
       System.out.println("Menu : \n1. Konversi Celcius\n2. Konversi Farhenheit\n3. Konversi Kelvin\n4. Konversi Reamur\n5. Keluar");
       System.out.print("Masukkan pilihan : ");
       pilihan = scanner.nextInt();
       switch (pilihan){
         case 1:
           do{
             simbol1 = "⁰C";
             System.out.print("\nKonversi Celcius ");
             System.out.println("Ke : \n1. Farhenheit\n2. Kelvin\n3. Reamur\n4. Keluar");
             System.out.print("Masukkan pilihan : ");
             pilihan = scanner.nextInt();
             switch (pilihan){
               case 1:
                 simbol2 = "⁰F";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir = (9.0/5.0) * suhuAwal + 32.0;
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 2:
                 simbol2 = "K";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir =  suhuAwal + 273.15;
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 3:
                 simbol2 = "⁰R";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir = (4.0/5.0) * suhuAwal;
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 4:
                 break;
               default:
                 System.out.println("Pilihan Tidak Valid");
                 break;
             }
           }while (pilihan != 4);
           break;
         case 2:
           do{
             simbol1 = "⁰F";
             System.out.print("\nKonversi Farhenheit ");
             System.out.println("Ke : \n1. Celcius\n2. Kelvin\n3. Reamur\n4. Keluar");
             System.out.print("Masukkan pilihan : ");
             pilihan = scanner.nextInt();
             switch (pilihan){
               case 1:
                 simbol2 = "⁰C";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir = 5.0/9.0 * (suhuAwal - 32.0);
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 2:
                 simbol2 = "K";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir = 5.0/9.0 * (suhuAwal + 459.67);
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 3:
                 simbol2 = "⁰R";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir = 4.0/9.0  * (suhuAwal - 32.0);
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 4:
                 break;
               default:
                 System.out.println("Pilihan Tidak Valid");
                 break;
             }
           }while (pilihan!=4);
           break;
         case 3:
           do{
             simbol1 = "K";
             System.out.print("\nKonversi Kelvin ");
             System.out.println("Ke : \n1. Celcius\n2. Farhenheit\n3. Reamur\n4. Keluar");
             System.out.print("Masukkan pilihan : ");
             pilihan = scanner.nextInt();
             switch (pilihan){
               case 1:
                 simbol2 = "⁰C";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir = suhuAwal - 273.15;
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 2:
                 simbol2 = "⁰F";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir = (suhuAwal * 9.0/5.0) - 459.67;
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 3:
                 simbol2 = "⁰R";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir = 4.0/5.0 * (suhuAwal - 273);
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 4:
                 break;
               default:
                 System.out.println("Pilihan Tidak Valid");
                 break;
             }
           }while (pilihan!=4);
           break;
         case 4:
           do{
             simbol1 = "⁰R";
             System.out.print("\nKonversi Reamur ");
             System.out.println("Ke : \n1. Celcius\n2. Farhenheit\n3. Kelvin\n4. Keluar");
             System.out.print("Masukkan pilihan : ");
             pilihan = scanner.nextInt();
             switch (pilihan){
               case 1:
                 simbol2 = "⁰C";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir = suhuAwal / 0.8;
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 2:
                 simbol2 = "F";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir = (suhuAwal * 2.25) + 32;
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               case 3:
                 simbol2 = "K";
                 System.out.print("Masukkan Suhu : ");
                 suhuAwal = scanner.nextInt();
                 suhuAkhir =  (suhuAwal / 0.8) + 273.15;
                 System.out.println(suhuAwal + simbol1 + " = " + suhuAkhir + simbol2);
                 break;
               default:
                 System.out.println("Pilihan Tidak Valid");
                 break;
             }
           }while (pilihan!=4);
           break;
         default:
           System.out.println("Pilihan Tidak Valid");
           break;
       }
     } while (pilihan != 5);
   }
 }